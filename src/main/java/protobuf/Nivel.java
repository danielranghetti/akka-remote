// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mensagem.proto

package protobuf;

/**
 * Protobuf enum {@code serializacao.Nivel}
 */
public enum Nivel
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>BAIXO = 0;</code>
   */
  BAIXO(0),
  /**
   * <code>NORMAL = 1;</code>
   */
  NORMAL(1),
  /**
   * <code>ALTO = 2;</code>
   */
  ALTO(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>BAIXO = 0;</code>
   */
  public static final int BAIXO_VALUE = 0;
  /**
   * <code>NORMAL = 1;</code>
   */
  public static final int NORMAL_VALUE = 1;
  /**
   * <code>ALTO = 2;</code>
   */
  public static final int ALTO_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Nivel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Nivel forNumber(int value) {
    switch (value) {
      case 0: return BAIXO;
      case 1: return NORMAL;
      case 2: return ALTO;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Nivel>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Nivel> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Nivel>() {
          public Nivel findValueByNumber(int number) {
            return Nivel.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return protobuf.AkkaOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final Nivel[] VALUES = values();

  public static Nivel valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Nivel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:serializacao.Nivel)
}

