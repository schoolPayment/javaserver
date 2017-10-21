package com.brianphiri.grpc;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ExternalServices {
    public ExternalServices(){
        setupConnetionFactory();
        publishToAMQP();
    }

    private BlockingQueue<Payment> queue = new LinkedBlockingDeque<Payment>();
    void publishMessage(Payment message){
        System.out.println("sending message");
        try{

            queue.put(message);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    ConnectionFactory factory = new ConnectionFactory();
    public void setupConnetionFactory(){
        String uri = " amqp://ckmrenum:HPQn1U2Ygh_uB7_YsNhec5d8irAZLV9N@orangutan.rmq.cloudamqp.com/ckmrenum";
//        String uri ="localhost";
//        factory.setHost(uri);
        try {
            factory.setAutomaticRecoveryEnabled(false);
            factory.setUri(uri);

        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
    }

    Thread subscribeThread;
    Thread publishThread;


    public void publishToAMQP() {
        publishThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        Connection connection = factory.newConnection();
                        Channel channel = connection.createChannel();
                        channel.confirmSelect();
                        channel.exchangeDeclare("payments", "fanout");

                        while (true) {
                            Payment message = queue.take();

                            try {
                                channel.basicPublish("payments", "payments", null, message.toString().getBytes());
                                System.out.println("publishing..." + message);
                                channel.waitForConfirmsOrDie();
                            } catch (Exception e) {
                                queue.put(message);
                                throw e;
                            }
                        }

                    } catch (Exception e) {
                        System.out.println("Connection broken " + e.getClass().getName());
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
        });
        publishThread.start();
    }
}
