// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mensagem.proto

package protobuf;

public final class AkkaOuterClass {
  private AkkaOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_serializacao_PingMensagem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_serializacao_PingMensagem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_serializacao_PongMensagem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_serializacao_PongMensagem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_serializacao_Iniciar_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_serializacao_Iniciar_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_serializacao_Mensagem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_serializacao_Mensagem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016mensagem.proto\022\014serializacao\"D\n\014PingMe" +
      "nsagem\022\020\n\010mensagem\030\001 \001(\t\022\"\n\005nivel\030\002 \001(\0162" +
      "\023.serializacao.Nivel\"D\n\014PongMensagem\022\020\n\010" +
      "mensagem\030\001 \001(\t\022\"\n\005nivel\030\002 \001(\0162\023.serializ" +
      "acao.Nivel\"\t\n\007Iniciar\"\251\001\n\010Mensagem\022(\n\004pi" +
      "ng\030\001 \001(\0132\032.serializacao.PingMensagem\022(\n\004" +
      "pong\030\002 \001(\0132\032.serializacao.PongMensagem\022%" +
      "\n\006inicio\030\003 \001(\0132\025.serializacao.Iniciar\022\"\n" +
      "\005nivel\030\004 \001(\0162\023.serializacao.Nivel*(\n\005Niv" +
      "el\022\t\n\005BAIXO\020\000\022\n\n\006NORMAL\020\001\022\010\n\004ALTO\020\002B\034\n\010p" +
      "rotobufB\016AkkaOuterClassP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_serializacao_PingMensagem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_serializacao_PingMensagem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_serializacao_PingMensagem_descriptor,
        new java.lang.String[] { "Mensagem", "Nivel", });
    internal_static_serializacao_PongMensagem_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_serializacao_PongMensagem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_serializacao_PongMensagem_descriptor,
        new java.lang.String[] { "Mensagem", "Nivel", });
    internal_static_serializacao_Iniciar_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_serializacao_Iniciar_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_serializacao_Iniciar_descriptor,
        new java.lang.String[] { });
    internal_static_serializacao_Mensagem_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_serializacao_Mensagem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_serializacao_Mensagem_descriptor,
        new java.lang.String[] { "Ping", "Pong", "Inicio", "Nivel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
