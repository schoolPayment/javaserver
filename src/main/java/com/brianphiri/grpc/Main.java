package com.brianphiri.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Main {
    static public void main(String [] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080).addService(new PaymentServiceImpl()).build();
        System.out.print("started server");
        server.start();
        server.awaitTermination();

    }
}
