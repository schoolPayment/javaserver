// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Message.proto

package com.brianphiri.grpc;

public final class Message {
  private Message() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_brianphiri_grpc_PaymentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_brianphiri_grpc_PaymentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_brianphiri_grpc_MpesaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_brianphiri_grpc_MpesaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_brianphiri_grpc_PaymentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_brianphiri_grpc_PaymentResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rMessage.proto\022\023com.brianphiri.grpc\"L\n\016" +
      "PaymentRequest\022\025\n\rstudentNumber\030\001 \001(\t\022\023\n" +
      "\013phoneNumber\030\002 \001(\t\022\016\n\006amount\030\003 \001(\t\"3\n\014Mp" +
      "esaRequest\022\023\n\013phoneNumber\030\001 \001(\t\022\016\n\006amoun" +
      "t\030\002 \001(\t\"\021\n\017PaymentResponse2\302\001\n\016PaymentSe" +
      "rvice\022X\n\013makePayment\022#.com.brianphiri.gr" +
      "pc.PaymentRequest\032$.com.brianphiri.grpc." +
      "PaymentResponse\022V\n\013sendToMpesa\022!.com.bri" +
      "anphiri.grpc.MpesaRequest\032$.com.brianphi" +
      "ri.grpc.PaymentResponseB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_brianphiri_grpc_PaymentRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_brianphiri_grpc_PaymentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_brianphiri_grpc_PaymentRequest_descriptor,
        new java.lang.String[] { "StudentNumber", "PhoneNumber", "Amount", });
    internal_static_com_brianphiri_grpc_MpesaRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_brianphiri_grpc_MpesaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_brianphiri_grpc_MpesaRequest_descriptor,
        new java.lang.String[] { "PhoneNumber", "Amount", });
    internal_static_com_brianphiri_grpc_PaymentResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_brianphiri_grpc_PaymentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_brianphiri_grpc_PaymentResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
