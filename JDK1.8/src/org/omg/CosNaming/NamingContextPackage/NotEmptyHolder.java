package org.omg.CosNaming.NamingContextPackage;

/**
* org/omg/CosNaming/NamingContextPackage/NotEmptyHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from d:/re/workspace/8-2-build-windows-i586-cygwin/jdk8u20/1074/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Wednesday, July 30, 2014 6:15:46 PM PDT
*/

public final class NotEmptyHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosNaming.NamingContextPackage.NotEmpty value = null;

  public NotEmptyHolder ()
  {
  }

  public NotEmptyHolder (org.omg.CosNaming.NamingContextPackage.NotEmpty initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosNaming.NamingContextPackage.NotEmptyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosNaming.NamingContextPackage.NotEmptyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosNaming.NamingContextPackage.NotEmptyHelper.type ();
  }

}
