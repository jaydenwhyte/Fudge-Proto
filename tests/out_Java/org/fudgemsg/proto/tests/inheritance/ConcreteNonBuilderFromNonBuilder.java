// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from inheritance.proto:87(10)
package org.fudgemsg.proto.tests.inheritance;
public class ConcreteNonBuilderFromNonBuilder extends org.fudgemsg.proto.tests.inheritance.AbstractNonBuilderFromBuilder implements java.io.Serializable {
  private static final long serialVersionUID = 108523l;
  private final int _e;
  public static final String E_KEY = "e";
  public static class Builder extends org.fudgemsg.proto.tests.inheritance.AbstractNonBuilderFromBuilder.Builder {
    private final int _e;
    public Builder (int c, int d, int e) {
      super (c, d);
      _e = e;
    }
    protected Builder (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      super (fudgeMsg);
      org.fudgemsg.FudgeField fudgeField;
      fudgeField = fudgeMsg.getByName (E_KEY);
      if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a ConcreteNonBuilderFromNonBuilder - field 'e' is not present");
      try {
        _e = fudgeMsg.getFieldValue (Integer.class, fudgeField);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a ConcreteNonBuilderFromNonBuilder - field 'e' is not integer", e);
      }
    }
    public ConcreteNonBuilderFromNonBuilder build () {
      return new ConcreteNonBuilderFromNonBuilder (this);
    }
  }
  protected ConcreteNonBuilderFromNonBuilder (final Builder builder) {
    super (builder);
    _e = builder._e;
  }
  public ConcreteNonBuilderFromNonBuilder (Integer b, int c, int d, int e) {
    super (b, c, d);
    _e = e;
  }
  protected ConcreteNonBuilderFromNonBuilder (final ConcreteNonBuilderFromNonBuilder source) {
    super (source);
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _e = source._e;
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    super.toFudgeMsg (fudgeContext, msg);
    msg.add (E_KEY, null, _e);
  }
  public static ConcreteNonBuilderFromNonBuilder fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.inheritance.ConcreteNonBuilderFromNonBuilder".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.inheritance.ConcreteNonBuilderFromNonBuilder)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new Builder (fudgeMsg).build ();
  }
  public int getE () {
    return _e;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof ConcreteNonBuilderFromNonBuilder)) return false;
    ConcreteNonBuilderFromNonBuilder msg = (ConcreteNonBuilderFromNonBuilder)o;
    if (_e != msg._e) return false;
    return super.equals (msg);
  }
  public int hashCode () {
    int hc = super.hashCode ();
    hc = (hc * 31) + (int)_e;
    return hc;
  }
  public String toString () {
    return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
/* filefooter.java.include
 *
 * This file is part of the Java unit test generated output.
 */