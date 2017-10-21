package com.brianphiri.grpc;

import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class PaymentServiceImpl extends PaymentServiceGrpc.PaymentServiceImplBase {
    @Override
    public void makePayment(PaymentRequest request, StreamObserver<PaymentResponse> responseObserver) {

        Payment payment = new Payment(request.getPhoneNumber(), request.getStudentNumber(), request.getAmount());
        new ExternalServices().publishMessage(payment);
        
//        try {
//            new MpesaPayment().onlinePayment(payment);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        PaymentResponse response = PaymentResponse.newBuilder().build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
