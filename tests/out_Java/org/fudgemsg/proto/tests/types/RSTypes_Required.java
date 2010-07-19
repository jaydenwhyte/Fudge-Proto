// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from types.proto:150(10)
package org.fudgemsg.proto.tests.types;
public class RSTypes_Required implements java.io.Serializable, RSTypesBase {
  private static final long serialVersionUID = -4832290588359394749l;
  private final java.util.List<Boolean> __Boolean;
  public static final String _BOOLEAN_KEY = "_Boolean";
  private final java.util.List<Byte> __Byte;
  public static final String _BYTE_KEY = "_Byte";
  private final java.util.List<Double> __Double;
  public static final String _DOUBLE_KEY = "_Double";
  private final java.util.List<Float> __Float;
  public static final String _FLOAT_KEY = "_Float";
  private final java.util.List<Boolean> __Indicator;
  public static final String _INDICATOR_KEY = "_Indicator";
  private final java.util.List<Integer> __Int;
  public static final String _INT_KEY = "_Int";
  private final java.util.List<Long> __Long;
  public static final String _LONG_KEY = "_Long";
  private final java.util.List<Short> __Short;
  public static final String _SHORT_KEY = "_Short";
  private final java.util.List<String> __String;
  public static final String _STRING_KEY = "_String";
  private final java.util.List<org.fudgemsg.proto.tests.types.SubMessage> __SubMessage;
  public static final String _SUBMESSAGE_KEY = "_SubMessage";
  private final java.util.List<org.fudgemsg.proto.tests.types.CustomEnum> __CustomEnum;
  public static final String _CUSTOMENUM_KEY = "_CustomEnum";
  private final java.util.List<org.fudgemsg.FudgeFieldContainer> __Message;
  public static final String _MESSAGE_KEY = "_Message";
  private final java.util.List<javax.time.calendar.DateProvider> __Date;
  public static final String _DATE_KEY = "_Date";
  private final java.util.List<javax.time.calendar.DateTimeProvider> __DateTime;
  public static final String _DATETIME_KEY = "_DateTime";
  private final java.util.List<javax.time.calendar.TimeProvider> __Time;
  public static final String _TIME_KEY = "_Time";
  public RSTypes_Required (java.util.Collection<? extends Boolean> _Boolean, java.util.Collection<? extends Byte> _Byte, java.util.Collection<? extends Double> _Double, java.util.Collection<? extends Float> _Float, java.util.Collection<? extends Boolean> _Indicator, java.util.Collection<? extends Integer> _Int, java.util.Collection<? extends Long> _Long, java.util.Collection<? extends Short> _Short, java.util.Collection<? extends String> _String, java.util.Collection<? extends org.fudgemsg.proto.tests.types.SubMessage> _SubMessage, java.util.Collection<? extends org.fudgemsg.proto.tests.types.CustomEnum> _CustomEnum, java.util.Collection<? extends org.fudgemsg.FudgeFieldContainer> _Message, java.util.Collection<? extends javax.time.calendar.DateProvider> _Date, java.util.Collection<? extends javax.time.calendar.DateTimeProvider> _DateTime, java.util.Collection<? extends javax.time.calendar.TimeProvider> _Time) {
    if (_Boolean == null) throw new NullPointerException ("'_Boolean' cannot be null");
    else {
      final java.util.List<Boolean> fudge0 = new java.util.ArrayList<Boolean> (_Boolean);
      if (_Boolean.size () == 0) throw new IllegalArgumentException ("'_Boolean' cannot be an empty list");
      for (java.util.ListIterator<Boolean> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Boolean fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Boolean' cannot be null");
      }
      __Boolean = fudge0;
    }
    if (_Byte == null) throw new NullPointerException ("'_Byte' cannot be null");
    else {
      final java.util.List<Byte> fudge0 = new java.util.ArrayList<Byte> (_Byte);
      if (_Byte.size () == 0) throw new IllegalArgumentException ("'_Byte' cannot be an empty list");
      for (java.util.ListIterator<Byte> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Byte fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Byte' cannot be null");
      }
      __Byte = fudge0;
    }
    if (_Double == null) throw new NullPointerException ("'_Double' cannot be null");
    else {
      final java.util.List<Double> fudge0 = new java.util.ArrayList<Double> (_Double);
      if (_Double.size () == 0) throw new IllegalArgumentException ("'_Double' cannot be an empty list");
      for (java.util.ListIterator<Double> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Double fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Double' cannot be null");
      }
      __Double = fudge0;
    }
    if (_Float == null) throw new NullPointerException ("'_Float' cannot be null");
    else {
      final java.util.List<Float> fudge0 = new java.util.ArrayList<Float> (_Float);
      if (_Float.size () == 0) throw new IllegalArgumentException ("'_Float' cannot be an empty list");
      for (java.util.ListIterator<Float> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Float fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Float' cannot be null");
      }
      __Float = fudge0;
    }
    if (_Indicator == null) throw new NullPointerException ("'_Indicator' cannot be null");
    else {
      final java.util.List<Boolean> fudge0 = new java.util.ArrayList<Boolean> (_Indicator);
      if (_Indicator.size () == 0) throw new IllegalArgumentException ("'_Indicator' cannot be an empty list");
      for (java.util.ListIterator<Boolean> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Boolean fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Indicator' cannot be null");
      }
      __Indicator = fudge0;
    }
    if (_Int == null) throw new NullPointerException ("'_Int' cannot be null");
    else {
      final java.util.List<Integer> fudge0 = new java.util.ArrayList<Integer> (_Int);
      if (_Int.size () == 0) throw new IllegalArgumentException ("'_Int' cannot be an empty list");
      for (java.util.ListIterator<Integer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Integer fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Int' cannot be null");
      }
      __Int = fudge0;
    }
    if (_Long == null) throw new NullPointerException ("'_Long' cannot be null");
    else {
      final java.util.List<Long> fudge0 = new java.util.ArrayList<Long> (_Long);
      if (_Long.size () == 0) throw new IllegalArgumentException ("'_Long' cannot be an empty list");
      for (java.util.ListIterator<Long> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Long fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Long' cannot be null");
      }
      __Long = fudge0;
    }
    if (_Short == null) throw new NullPointerException ("'_Short' cannot be null");
    else {
      final java.util.List<Short> fudge0 = new java.util.ArrayList<Short> (_Short);
      if (_Short.size () == 0) throw new IllegalArgumentException ("'_Short' cannot be an empty list");
      for (java.util.ListIterator<Short> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Short fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Short' cannot be null");
      }
      __Short = fudge0;
    }
    if (_String == null) throw new NullPointerException ("'_String' cannot be null");
    else {
      final java.util.List<String> fudge0 = new java.util.ArrayList<String> (_String);
      if (_String.size () == 0) throw new IllegalArgumentException ("'_String' cannot be an empty list");
      for (java.util.ListIterator<String> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        String fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_String' cannot be null");
      }
      __String = fudge0;
    }
    if (_SubMessage == null) throw new NullPointerException ("'_SubMessage' cannot be null");
    else {
      final java.util.List<org.fudgemsg.proto.tests.types.SubMessage> fudge0 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage> (_SubMessage);
      if (_SubMessage.size () == 0) throw new IllegalArgumentException ("'_SubMessage' cannot be an empty list");
      for (java.util.ListIterator<org.fudgemsg.proto.tests.types.SubMessage> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.proto.tests.types.SubMessage fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_SubMessage' cannot be null");
        fudge1.set (fudge2);
      }
      __SubMessage = fudge0;
    }
    if (_CustomEnum == null) throw new NullPointerException ("'_CustomEnum' cannot be null");
    else {
      final java.util.List<org.fudgemsg.proto.tests.types.CustomEnum> fudge0 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum> (_CustomEnum);
      if (_CustomEnum.size () == 0) throw new IllegalArgumentException ("'_CustomEnum' cannot be an empty list");
      for (java.util.ListIterator<org.fudgemsg.proto.tests.types.CustomEnum> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.proto.tests.types.CustomEnum fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_CustomEnum' cannot be null");
      }
      __CustomEnum = fudge0;
    }
    if (_Message == null) throw new NullPointerException ("'_Message' cannot be null");
    else {
      final java.util.List<org.fudgemsg.FudgeFieldContainer> fudge0 = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer> (_Message);
      if (_Message.size () == 0) throw new IllegalArgumentException ("'_Message' cannot be an empty list");
      for (java.util.ListIterator<org.fudgemsg.FudgeFieldContainer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.FudgeFieldContainer fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Message' cannot be null");
      }
      __Message = fudge0;
    }
    if (_Date == null) throw new NullPointerException ("'_Date' cannot be null");
    else {
      final java.util.List<javax.time.calendar.DateProvider> fudge0 = new java.util.ArrayList<javax.time.calendar.DateProvider> (_Date);
      if (_Date.size () == 0) throw new IllegalArgumentException ("'_Date' cannot be an empty list");
      for (java.util.ListIterator<javax.time.calendar.DateProvider> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.DateProvider fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Date' cannot be null");
      }
      __Date = fudge0;
    }
    if (_DateTime == null) throw new NullPointerException ("'_DateTime' cannot be null");
    else {
      final java.util.List<javax.time.calendar.DateTimeProvider> fudge0 = new java.util.ArrayList<javax.time.calendar.DateTimeProvider> (_DateTime);
      if (_DateTime.size () == 0) throw new IllegalArgumentException ("'_DateTime' cannot be an empty list");
      for (java.util.ListIterator<javax.time.calendar.DateTimeProvider> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.DateTimeProvider fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_DateTime' cannot be null");
      }
      __DateTime = fudge0;
    }
    if (_Time == null) throw new NullPointerException ("'_Time' cannot be null");
    else {
      final java.util.List<javax.time.calendar.TimeProvider> fudge0 = new java.util.ArrayList<javax.time.calendar.TimeProvider> (_Time);
      if (_Time.size () == 0) throw new IllegalArgumentException ("'_Time' cannot be an empty list");
      for (java.util.ListIterator<javax.time.calendar.TimeProvider> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.TimeProvider fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Time' cannot be null");
      }
      __Time = fudge0;
    }
  }
  protected RSTypes_Required (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    java.util.List<org.fudgemsg.FudgeField> fudgeFields;
    fudgeFields = fudgeMsg.getAllByName (_BOOLEAN_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Boolean' is not present");
    __Boolean = new java.util.ArrayList<Boolean> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge1 : fudgeFields) {
      try {
        __Boolean.add (fudgeMsg.getFieldValue (Boolean.class, fudge1));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Boolean' is not boolean", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_BYTE_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Byte' is not present");
    __Byte = new java.util.ArrayList<Byte> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
      try {
        __Byte.add (fudgeMsg.getFieldValue (Byte.class, fudge2));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Byte' is not byte", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_DOUBLE_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Double' is not present");
    __Double = new java.util.ArrayList<Double> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge3 : fudgeFields) {
      try {
        __Double.add (fudgeMsg.getFieldValue (Double.class, fudge3));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Double' is not double", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_FLOAT_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Float' is not present");
    __Float = new java.util.ArrayList<Float> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge4 : fudgeFields) {
      try {
        __Float.add (fudgeMsg.getFieldValue (Float.class, fudge4));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Float' is not float", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_INDICATOR_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Indicator' is not present");
    __Indicator = new java.util.ArrayList<Boolean> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge5 : fudgeFields) {
      __Indicator.add (fudge5.getValue () != null);
    }
    fudgeFields = fudgeMsg.getAllByName (_INT_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Int' is not present");
    __Int = new java.util.ArrayList<Integer> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge6 : fudgeFields) {
      try {
        __Int.add (fudgeMsg.getFieldValue (Integer.class, fudge6));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Int' is not integer", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_LONG_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Long' is not present");
    __Long = new java.util.ArrayList<Long> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge7 : fudgeFields) {
      try {
        __Long.add (fudgeMsg.getFieldValue (Long.class, fudge7));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Long' is not long", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_SHORT_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Short' is not present");
    __Short = new java.util.ArrayList<Short> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge8 : fudgeFields) {
      try {
        __Short.add (fudgeMsg.getFieldValue (Short.class, fudge8));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Short' is not short", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_STRING_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_String' is not present");
    __String = new java.util.ArrayList<String> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge9 : fudgeFields) {
      try {
        __String.add (fudge9.getValue ().toString ());
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_String' is not string", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_SUBMESSAGE_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_SubMessage' is not present");
    __SubMessage = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge10 : fudgeFields) {
      try {
        final org.fudgemsg.proto.tests.types.SubMessage fudge11;
        fudge11 = org.fudgemsg.proto.tests.types.SubMessage.fromFudgeMsg (fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge10));
        __SubMessage.add (fudge11);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_SubMessage' is not SubMessage message", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_CUSTOMENUM_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_CustomEnum' is not present");
    __CustomEnum = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge11 : fudgeFields) {
      try {
        __CustomEnum.add (fudgeMsg.getFieldValue (org.fudgemsg.proto.tests.types.CustomEnum.class, fudge11));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_CustomEnum' is not CustomEnum enum", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_MESSAGE_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Message' is not present");
    __Message = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge12 : fudgeFields) {
      try {
        final org.fudgemsg.FudgeFieldContainer fudge13;
        fudge13 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge12);
        __Message.add (fudge13);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Message' is not anonymous/unknown message", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_DATE_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Date' is not present");
    __Date = new java.util.ArrayList<javax.time.calendar.DateProvider> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge13 : fudgeFields) {
      try {
        __Date.add (fudgeMsg.getFieldValue (javax.time.calendar.DateProvider.class, fudge13));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Date' is not date", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_DATETIME_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_DateTime' is not present");
    __DateTime = new java.util.ArrayList<javax.time.calendar.DateTimeProvider> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge14 : fudgeFields) {
      try {
        __DateTime.add (fudgeMsg.getFieldValue (javax.time.calendar.DateTimeProvider.class, fudge14));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_DateTime' is not datetime", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_TIME_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Time' is not present");
    __Time = new java.util.ArrayList<javax.time.calendar.TimeProvider> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge15 : fudgeFields) {
      try {
        __Time.add (fudgeMsg.getFieldValue (javax.time.calendar.TimeProvider.class, fudge15));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RSTypes_Required - field '_Time' is not time", e);
      }
    }
  }
  protected RSTypes_Required (final RSTypes_Required source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    if (source.__Boolean == null) __Boolean = null;
    else {
      __Boolean = new java.util.ArrayList<Boolean> (source.__Boolean);
    }
    if (source.__Byte == null) __Byte = null;
    else {
      __Byte = new java.util.ArrayList<Byte> (source.__Byte);
    }
    if (source.__Double == null) __Double = null;
    else {
      __Double = new java.util.ArrayList<Double> (source.__Double);
    }
    if (source.__Float == null) __Float = null;
    else {
      __Float = new java.util.ArrayList<Float> (source.__Float);
    }
    if (source.__Indicator == null) __Indicator = null;
    else {
      __Indicator = new java.util.ArrayList<Boolean> (source.__Indicator);
    }
    if (source.__Int == null) __Int = null;
    else {
      __Int = new java.util.ArrayList<Integer> (source.__Int);
    }
    if (source.__Long == null) __Long = null;
    else {
      __Long = new java.util.ArrayList<Long> (source.__Long);
    }
    if (source.__Short == null) __Short = null;
    else {
      __Short = new java.util.ArrayList<Short> (source.__Short);
    }
    if (source.__String == null) __String = null;
    else {
      __String = new java.util.ArrayList<String> (source.__String);
    }
    if (source.__SubMessage == null) __SubMessage = null;
    else {
      final java.util.List<org.fudgemsg.proto.tests.types.SubMessage> fudge0 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage> (source.__SubMessage);
      for (java.util.ListIterator<org.fudgemsg.proto.tests.types.SubMessage> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.proto.tests.types.SubMessage fudge2 = fudge1.next ();
        fudge1.set (fudge2);
      }
      __SubMessage = fudge0;
    }
    if (source.__CustomEnum == null) __CustomEnum = null;
    else {
      __CustomEnum = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum> (source.__CustomEnum);
    }
    if (source.__Message == null) __Message = null;
    else {
      __Message = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer> (source.__Message);
    }
    if (source.__Date == null) __Date = null;
    else {
      __Date = new java.util.ArrayList<javax.time.calendar.DateProvider> (source.__Date);
    }
    if (source.__DateTime == null) __DateTime = null;
    else {
      __DateTime = new java.util.ArrayList<javax.time.calendar.DateTimeProvider> (source.__DateTime);
    }
    if (source.__Time == null) __Time = null;
    else {
      __Time = new java.util.ArrayList<javax.time.calendar.TimeProvider> (source.__Time);
    }
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    if (__Boolean != null)  {
      for (Boolean fudge1 : __Boolean) {
        msg.add (_BOOLEAN_KEY, null, fudge1);
      }
    }
    if (__Byte != null)  {
      for (Byte fudge1 : __Byte) {
        msg.add (_BYTE_KEY, null, fudge1);
      }
    }
    if (__Double != null)  {
      for (Double fudge1 : __Double) {
        msg.add (_DOUBLE_KEY, null, fudge1);
      }
    }
    if (__Float != null)  {
      for (Float fudge1 : __Float) {
        msg.add (_FLOAT_KEY, null, fudge1);
      }
    }
    if (__Indicator != null)  {
      for (Boolean fudge1 : __Indicator) {
        if (fudge1) msg.add (_INDICATOR_KEY, null, org.fudgemsg.types.IndicatorType.INSTANCE);
      }
    }
    if (__Int != null)  {
      for (Integer fudge1 : __Int) {
        msg.add (_INT_KEY, null, fudge1);
      }
    }
    if (__Long != null)  {
      for (Long fudge1 : __Long) {
        msg.add (_LONG_KEY, null, fudge1);
      }
    }
    if (__Short != null)  {
      for (Short fudge1 : __Short) {
        msg.add (_SHORT_KEY, null, fudge1);
      }
    }
    if (__String != null)  {
      for (String fudge1 : __String) {
        msg.add (_STRING_KEY, null, fudge1);
      }
    }
    if (__SubMessage != null)  {
      for (org.fudgemsg.proto.tests.types.SubMessage fudge1 : __SubMessage) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge2 = fudgeContext.newMessage ();
        Class<?> fudge3 = fudge1.getClass ();
        while (!org.fudgemsg.proto.tests.types.SubMessage.class.equals (fudge3)) {
          fudge2.add (null, 0, org.fudgemsg.types.StringFieldType.INSTANCE, fudge3.getName ());
          fudge3 = fudge3.getSuperclass ();
        }
        fudge1.toFudgeMsg (fudgeContext, fudge2);
        msg.add (_SUBMESSAGE_KEY, null, fudge2);
      }
    }
    if (__CustomEnum != null)  {
      for (org.fudgemsg.proto.tests.types.CustomEnum fudge1 : __CustomEnum) {
        msg.add (_CUSTOMENUM_KEY, null, fudge1.name ());
      }
    }
    if (__Message != null)  {
      for (org.fudgemsg.FudgeFieldContainer fudge1 : __Message) {
        msg.add (_MESSAGE_KEY, null, fudgeContext.newMessage (fudge1));
      }
    }
    if (__Date != null)  {
      for (javax.time.calendar.DateProvider fudge1 : __Date) {
        msg.add (_DATE_KEY, null, fudge1);
      }
    }
    if (__DateTime != null)  {
      for (javax.time.calendar.DateTimeProvider fudge1 : __DateTime) {
        msg.add (_DATETIME_KEY, null, fudge1);
      }
    }
    if (__Time != null)  {
      for (javax.time.calendar.TimeProvider fudge1 : __Time) {
        msg.add (_TIME_KEY, null, fudge1);
      }
    }
  }
  public static RSTypes_Required fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.types.RSTypes_Required".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.types.RSTypes_Required)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new RSTypes_Required (fudgeMsg);
  }
  public java.util.List<Boolean> get_Boolean () {
    return java.util.Collections.unmodifiableList (__Boolean);
  }
  public java.util.List<Byte> get_Byte () {
    return java.util.Collections.unmodifiableList (__Byte);
  }
  public java.util.List<Double> get_Double () {
    return java.util.Collections.unmodifiableList (__Double);
  }
  public java.util.List<Float> get_Float () {
    return java.util.Collections.unmodifiableList (__Float);
  }
  public java.util.List<Boolean> get_Indicator () {
    return java.util.Collections.unmodifiableList (__Indicator);
  }
  public java.util.List<Integer> get_Int () {
    return java.util.Collections.unmodifiableList (__Int);
  }
  public java.util.List<Long> get_Long () {
    return java.util.Collections.unmodifiableList (__Long);
  }
  public java.util.List<Short> get_Short () {
    return java.util.Collections.unmodifiableList (__Short);
  }
  public java.util.List<String> get_String () {
    return java.util.Collections.unmodifiableList (__String);
  }
  public java.util.List<org.fudgemsg.proto.tests.types.SubMessage> get_SubMessage () {
    return java.util.Collections.unmodifiableList (__SubMessage);
  }
  public java.util.List<org.fudgemsg.proto.tests.types.CustomEnum> get_CustomEnum () {
    return java.util.Collections.unmodifiableList (__CustomEnum);
  }
  public java.util.List<org.fudgemsg.FudgeFieldContainer> get_Message () {
    return java.util.Collections.unmodifiableList (__Message);
  }
  public java.util.List<javax.time.calendar.DateProvider> get_Date () {
    return java.util.Collections.unmodifiableList (__Date);
  }
  public java.util.List<javax.time.calendar.DateTimeProvider> get_DateTime () {
    return java.util.Collections.unmodifiableList (__DateTime);
  }
  public java.util.List<javax.time.calendar.TimeProvider> get_Time () {
    return java.util.Collections.unmodifiableList (__Time);
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof RSTypes_Required)) return false;
    RSTypes_Required msg = (RSTypes_Required)o;
    if (__Boolean != null) {
      if (msg.__Boolean != null) {
        if (!__Boolean.equals (msg.__Boolean)) return false;
      }
      else return false;
    }
    else if (msg.__Boolean != null) return false;
    if (__Byte != null) {
      if (msg.__Byte != null) {
        if (!__Byte.equals (msg.__Byte)) return false;
      }
      else return false;
    }
    else if (msg.__Byte != null) return false;
    if (__Double != null) {
      if (msg.__Double != null) {
        if (!__Double.equals (msg.__Double)) return false;
      }
      else return false;
    }
    else if (msg.__Double != null) return false;
    if (__Float != null) {
      if (msg.__Float != null) {
        if (!__Float.equals (msg.__Float)) return false;
      }
      else return false;
    }
    else if (msg.__Float != null) return false;
    if (__Indicator != null) {
      if (msg.__Indicator != null) {
        if (!__Indicator.equals (msg.__Indicator)) return false;
      }
      else return false;
    }
    else if (msg.__Indicator != null) return false;
    if (__Int != null) {
      if (msg.__Int != null) {
        if (!__Int.equals (msg.__Int)) return false;
      }
      else return false;
    }
    else if (msg.__Int != null) return false;
    if (__Long != null) {
      if (msg.__Long != null) {
        if (!__Long.equals (msg.__Long)) return false;
      }
      else return false;
    }
    else if (msg.__Long != null) return false;
    if (__Short != null) {
      if (msg.__Short != null) {
        if (!__Short.equals (msg.__Short)) return false;
      }
      else return false;
    }
    else if (msg.__Short != null) return false;
    if (__String != null) {
      if (msg.__String != null) {
        if (!__String.equals (msg.__String)) return false;
      }
      else return false;
    }
    else if (msg.__String != null) return false;
    if (__SubMessage != null) {
      if (msg.__SubMessage != null) {
        if (!__SubMessage.equals (msg.__SubMessage)) return false;
      }
      else return false;
    }
    else if (msg.__SubMessage != null) return false;
    if (__CustomEnum != null) {
      if (msg.__CustomEnum != null) {
        if (!__CustomEnum.equals (msg.__CustomEnum)) return false;
      }
      else return false;
    }
    else if (msg.__CustomEnum != null) return false;
    if (__Message != null) {
      if (msg.__Message != null) {
        if (!__Message.equals (msg.__Message)) return false;
      }
      else return false;
    }
    else if (msg.__Message != null) return false;
    if (__Date != null) {
      if (msg.__Date != null) {
        if (!__Date.equals (msg.__Date)) return false;
      }
      else return false;
    }
    else if (msg.__Date != null) return false;
    if (__DateTime != null) {
      if (msg.__DateTime != null) {
        if (!__DateTime.equals (msg.__DateTime)) return false;
      }
      else return false;
    }
    else if (msg.__DateTime != null) return false;
    if (__Time != null) {
      if (msg.__Time != null) {
        if (!__Time.equals (msg.__Time)) return false;
      }
      else return false;
    }
    else if (msg.__Time != null) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc *= 31;
    if (__Boolean != null) hc += __Boolean.hashCode ();
    hc *= 31;
    if (__Byte != null) hc += __Byte.hashCode ();
    hc *= 31;
    if (__Double != null) hc += __Double.hashCode ();
    hc *= 31;
    if (__Float != null) hc += __Float.hashCode ();
    hc *= 31;
    if (__Indicator != null) hc += __Indicator.hashCode ();
    hc *= 31;
    if (__Int != null) hc += __Int.hashCode ();
    hc *= 31;
    if (__Long != null) hc += __Long.hashCode ();
    hc *= 31;
    if (__Short != null) hc += __Short.hashCode ();
    hc *= 31;
    if (__String != null) hc += __String.hashCode ();
    hc *= 31;
    if (__SubMessage != null) hc += __SubMessage.hashCode ();
    hc *= 31;
    if (__CustomEnum != null) hc += __CustomEnum.hashCode ();
    hc *= 31;
    if (__Message != null) hc += __Message.hashCode ();
    hc *= 31;
    if (__Date != null) hc += __Date.hashCode ();
    hc *= 31;
    if (__DateTime != null) hc += __DateTime.hashCode ();
    hc *= 31;
    if (__Time != null) hc += __Time.hashCode ();
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
