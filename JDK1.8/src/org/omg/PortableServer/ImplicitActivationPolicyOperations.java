package org.omg.PortableServer;


/**
* org/omg/PortableServer/ImplicitActivationPolicyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from d:/re/workspace/8-2-build-windows-i586-cygwin/jdk8u20/1074/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Wednesday, July 30, 2014 6:15:47 PM PDT
*/


/**
	 * This policy specifies whether implicit activation 
	 * of servants is supported in the created POA.
	 */
public interface ImplicitActivationPolicyOperations  extends org.omg.CORBA.PolicyOperations
{

  /**
	 * specifies the policy value
	 */
  org.omg.PortableServer.ImplicitActivationPolicyValue value ();
} // interface ImplicitActivationPolicyOperations