package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ActivatorOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from d:/re/workspace/8-2-build-windows-i586-cygwin/jdk8u20/1074/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, July 30, 2014 6:15:47 PM PDT
*/

public interface ActivatorOperations 
{

  /** A new ORB started server registers itself with the Activator
	*/
  void registerServer (String serverId, com.sun.corba.se.PortableActivationIDL.ServerProxy serverObj) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered;

  /** A server is shutting down that was started by this activator.
	* Complete termination of the server is detected by the death of the
	* process implementing the server.
	*/
  void serverGoingDown (String serverId);

  /** Called whenever an ORB instance is created.  This registers
	* the transport endpoints and the ORB proxy callback object.
	* Note that we cannot detect when an ORB shuts down, although
	* all of the POA shutdowns should still be reported.
	*/
  void registerORB (String serverId, String orbId, com.sun.corba.se.PortableActivationIDL.ORBProxy orb, com.sun.corba.se.PortableActivationIDL.EndPointInfo[] endPointInfo) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered, com.sun.corba.se.PortableActivationIDL.NoSuchEndPoint, com.sun.corba.se.PortableActivationIDL.ORBAlreadyRegistered;

  /** Construct or find an ORBD object template corresponding to the 
	* server's object template and return it.  Called whenever a 
	* persistent POA is created.
	*/
  org.omg.PortableInterceptor.ObjectReferenceTemplate registerPOA (String serverId, String orbId, org.omg.PortableInterceptor.ObjectReferenceTemplate poaTemplate);

  /** Called whenever a POA is destroyed.
	*/
  void poaDestroyed (String serverId, String orbId, org.omg.PortableInterceptor.ObjectReferenceTemplate poaTemplate);

  /** If the server is not running, start it up.  This is allowed
	* whether or not the server has been installed.
	*/
  void activate (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerAlreadyActive, com.sun.corba.se.PortableActivationIDL.ServerNotRegistered, com.sun.corba.se.PortableActivationIDL.ServerHeldDown;

  /** If the server is running, shut it down
	*/
  void shutdown (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotActive, com.sun.corba.se.PortableActivationIDL.ServerNotRegistered;

  /** Invoke the server install hook.  If the server is not 
	* currently running, this method will activate it.
	*/
  void install (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered, com.sun.corba.se.PortableActivationIDL.ServerHeldDown, com.sun.corba.se.PortableActivationIDL.ServerAlreadyInstalled;

  /** Invoke the server uninstall hook.  If the server is not
	* currently running, this method will activate it.
	* After this hook completes, the server may still be running.
	*/
  void uninstall (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered, com.sun.corba.se.PortableActivationIDL.ServerHeldDown, com.sun.corba.se.PortableActivationIDL.ServerAlreadyUninstalled;

  /** list active servers
	*/
  String[] getActiveServers ();

  /** list all registered ORBs for a server
	*/
  String[] getORBNames (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered;

  /** Find the server template that corresponds to the ORBD's
	* adapter id.
	*/
  org.omg.PortableInterceptor.ObjectReferenceTemplate lookupPOATemplate (String serverId, String orbId, String[] orbAdapterName);
} // interface ActivatorOperations
