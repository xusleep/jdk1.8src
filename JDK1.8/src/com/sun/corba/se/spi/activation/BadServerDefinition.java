package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/BadServerDefinition.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from d:/re/workspace/8-2-build-windows-i586-cygwin/jdk8u20/1074/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Wednesday, July 30, 2014 6:15:46 PM PDT
*/

public final class BadServerDefinition extends org.omg.CORBA.UserException
{
  public String reason = null;

  public BadServerDefinition ()
  {
    super(BadServerDefinitionHelper.id());
  } // ctor

  public BadServerDefinition (String _reason)
  {
    super(BadServerDefinitionHelper.id());
    reason = _reason;
  } // ctor


  public BadServerDefinition (String $reason, String _reason)
  {
    super(BadServerDefinitionHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class BadServerDefinition
