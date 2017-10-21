package com.brianphiri.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: Message.proto")
public final class PaymentServiceGrpc {

  private PaymentServiceGrpc() {}

  public static final String SERVICE_NAME = "com.brianphiri.grpc.PaymentService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.brianphiri.grpc.PaymentRequest,
      com.brianphiri.grpc.PaymentResponse> METHOD_MAKE_PAYMENT =
      io.grpc.MethodDescriptor.<com.brianphiri.grpc.PaymentRequest, com.brianphiri.grpc.PaymentResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.brianphiri.grpc.PaymentService", "makePayment"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.brianphiri.grpc.PaymentRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.brianphiri.grpc.PaymentResponse.getDefaultInstance()))
          .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("makePayment"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.brianphiri.grpc.MpesaRequest,
      com.brianphiri.grpc.PaymentResponse> METHOD_SEND_TO_MPESA =
      io.grpc.MethodDescriptor.<com.brianphiri.grpc.MpesaRequest, com.brianphiri.grpc.PaymentResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.brianphiri.grpc.PaymentService", "sendToMpesa"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.brianphiri.grpc.MpesaRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.brianphiri.grpc.PaymentResponse.getDefaultInstance()))
          .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("sendToMpesa"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PaymentServiceStub newStub(io.grpc.Channel channel) {
    return new PaymentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaymentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PaymentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaymentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PaymentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PaymentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void makePayment(com.brianphiri.grpc.PaymentRequest request,
        io.grpc.stub.StreamObserver<com.brianphiri.grpc.PaymentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MAKE_PAYMENT, responseObserver);
    }

    /**
     */
    public void sendToMpesa(com.brianphiri.grpc.MpesaRequest request,
        io.grpc.stub.StreamObserver<com.brianphiri.grpc.PaymentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND_TO_MPESA, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_MAKE_PAYMENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.brianphiri.grpc.PaymentRequest,
                com.brianphiri.grpc.PaymentResponse>(
                  this, METHODID_MAKE_PAYMENT)))
          .addMethod(
            METHOD_SEND_TO_MPESA,
            asyncUnaryCall(
              new MethodHandlers<
                com.brianphiri.grpc.MpesaRequest,
                com.brianphiri.grpc.PaymentResponse>(
                  this, METHODID_SEND_TO_MPESA)))
          .build();
    }
  }

  /**
   */
  public static final class PaymentServiceStub extends io.grpc.stub.AbstractStub<PaymentServiceStub> {
    private PaymentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaymentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaymentServiceStub(channel, callOptions);
    }

    /**
     */
    public void makePayment(com.brianphiri.grpc.PaymentRequest request,
        io.grpc.stub.StreamObserver<com.brianphiri.grpc.PaymentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MAKE_PAYMENT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendToMpesa(com.brianphiri.grpc.MpesaRequest request,
        io.grpc.stub.StreamObserver<com.brianphiri.grpc.PaymentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND_TO_MPESA, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PaymentServiceBlockingStub extends io.grpc.stub.AbstractStub<PaymentServiceBlockingStub> {
    private PaymentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaymentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaymentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.brianphiri.grpc.PaymentResponse makePayment(com.brianphiri.grpc.PaymentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MAKE_PAYMENT, getCallOptions(), request);
    }

    /**
     */
    public com.brianphiri.grpc.PaymentResponse sendToMpesa(com.brianphiri.grpc.MpesaRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEND_TO_MPESA, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PaymentServiceFutureStub extends io.grpc.stub.AbstractStub<PaymentServiceFutureStub> {
    private PaymentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaymentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaymentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.brianphiri.grpc.PaymentResponse> makePayment(
        com.brianphiri.grpc.PaymentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MAKE_PAYMENT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.brianphiri.grpc.PaymentResponse> sendToMpesa(
        com.brianphiri.grpc.MpesaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND_TO_MPESA, getCallOptions()), request);
    }
  }

  private static final int METHODID_MAKE_PAYMENT = 0;
  private static final int METHODID_SEND_TO_MPESA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PaymentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PaymentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MAKE_PAYMENT:
          serviceImpl.makePayment((com.brianphiri.grpc.PaymentRequest) request,
              (io.grpc.stub.StreamObserver<com.brianphiri.grpc.PaymentResponse>) responseObserver);
          break;
        case METHODID_SEND_TO_MPESA:
          serviceImpl.sendToMpesa((com.brianphiri.grpc.MpesaRequest) request,
              (io.grpc.stub.StreamObserver<com.brianphiri.grpc.PaymentResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PaymentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.brianphiri.grpc.Message.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PaymentService");
    }
  }

  private static final class PaymentServiceFileDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier {
    PaymentServiceFileDescriptorSupplier() {}
  }

  private static final class PaymentServiceMethodDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PaymentServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PaymentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PaymentServiceFileDescriptorSupplier())
              .addMethod(METHOD_MAKE_PAYMENT)
              .addMethod(METHOD_SEND_TO_MPESA)
              .build();
        }
      }
    }
    return result;
  }
}
