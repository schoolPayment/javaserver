package com.brianphiri.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;


public class MpesaPayment {

    public void onlinePayment(Payment payment)throws IOException{
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9000)
                .usePlaintext(true)
                .build();

        PaymentServiceGrpc.PaymentServiceBlockingStub stub = PaymentServiceGrpc.newBlockingStub(channel);
        stub.sendToMpesa(MpesaRequest.newBuilder()
            .setAmount(payment.getAmount()).setPhoneNumber(payment.getPhoneNumner()).build()
        );
    }
}
