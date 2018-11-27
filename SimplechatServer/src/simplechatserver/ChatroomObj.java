package simplechatserver;

/**
 *	This class is split from the gigantic HelloServer.java file as indicated in the 
 *	official tutorial taken from 
 *	https://docs.oracle.com/javase/7/docs/technotes/guides/idl/jidlExample.html
 *  
 * 	@author Jay Pineda
 */

import ChatroomApp.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import java.util.Properties;
 

/**
 * The IDL compiler translates the methods defined in the IDL file to its
 * corresponding Java interface implementation.
 * 
 * This class contains the implementations of the methods defined in that IDL. 
 * 
 * @author Jay Pineda
 */
class ChatroomObj extends ChatroomPOA {
	private ORB orb;
	  
	public void setORB(ORB orb_val) {
		orb = orb_val; 
	}
	 
	// implement add() method
	public int add(int a, int b) {
		int r = a +b;
	    return r;
	}
	 
	// implement shutdown() method
	public void shutdown() {
		orb.shutdown(false);
	}

}
