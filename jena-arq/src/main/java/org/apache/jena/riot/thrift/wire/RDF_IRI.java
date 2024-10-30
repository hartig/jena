/**
 * Autogenerated by Thrift Compiler (0.19.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.jena.riot.thrift.wire;

@SuppressWarnings("all")
public class RDF_IRI implements org.apache.thrift.TBase<RDF_IRI, RDF_IRI._Fields>, java.io.Serializable, Cloneable, Comparable<RDF_IRI> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RDF_IRI");

  private static final org.apache.thrift.protocol.TField IRI_FIELD_DESC = new org.apache.thrift.protocol.TField("iri", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RDF_IRIStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RDF_IRITupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String iri; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IRI((short)1, "iri");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // IRI
          return IRI;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IRI, new org.apache.thrift.meta_data.FieldMetaData("iri", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RDF_IRI.class, metaDataMap);
  }

  public RDF_IRI() {
  }

  public RDF_IRI(
    java.lang.String iri)
  {
    this();
    this.iri = iri;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RDF_IRI(RDF_IRI other) {
    if (other.isSetIri()) {
      this.iri = other.iri;
    }
  }

  @Override
  public RDF_IRI deepCopy() {
    return new RDF_IRI(this);
  }

  @Override
  public void clear() {
    this.iri = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getIri() {
    return this.iri;
  }

  public RDF_IRI setIri(@org.apache.thrift.annotation.Nullable java.lang.String iri) {
    this.iri = iri;
    return this;
  }

  public void unsetIri() {
    this.iri = null;
  }

  /** Returns true if field iri is set (has been assigned a value) and false otherwise */
  public boolean isSetIri() {
    return this.iri != null;
  }

  public void setIriIsSet(boolean value) {
    if (!value) {
      this.iri = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case IRI:
      if (value == null) {
        unsetIri();
      } else {
        setIri((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case IRI:
      return getIri();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case IRI:
      return isSetIri();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof RDF_IRI)
      return this.equals((RDF_IRI)that);
    return false;
  }

  public boolean equals(RDF_IRI that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_iri = true && this.isSetIri();
    boolean that_present_iri = true && that.isSetIri();
    if (this_present_iri || that_present_iri) {
      if (!(this_present_iri && that_present_iri))
        return false;
      if (!this.iri.equals(that.iri))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetIri()) ? 131071 : 524287);
    if (isSetIri())
      hashCode = hashCode * 8191 + iri.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(RDF_IRI other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetIri(), other.isSetIri());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIri()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iri, other.iri);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("RDF_IRI(");
    boolean first = true;

    sb.append("iri:");
    if (this.iri == null) {
      sb.append("null");
    } else {
      sb.append(this.iri);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (iri == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'iri' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RDF_IRIStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public RDF_IRIStandardScheme getScheme() {
      return new RDF_IRIStandardScheme();
    }
  }

  private static class RDF_IRIStandardScheme extends org.apache.thrift.scheme.StandardScheme<RDF_IRI> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, RDF_IRI struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IRI
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.iri = iprot.readString();
              struct.setIriIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, RDF_IRI struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.iri != null) {
        oprot.writeFieldBegin(IRI_FIELD_DESC);
        oprot.writeString(struct.iri);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RDF_IRITupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public RDF_IRITupleScheme getScheme() {
      return new RDF_IRITupleScheme();
    }
  }

  private static class RDF_IRITupleScheme extends org.apache.thrift.scheme.TupleScheme<RDF_IRI> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RDF_IRI struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.iri);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RDF_IRI struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.iri = iprot.readString();
      struct.setIriIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

