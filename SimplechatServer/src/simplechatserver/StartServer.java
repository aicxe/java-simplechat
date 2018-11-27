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
 * This class contains the implementation needed to start the ORB server.
 * It is copied from the tutorial as indicated on the link above.
 * 
 * @author Jay Pineda
 *
 */
public class StartServer {

	public static void main(String args[]) {

		try {
			// create and initialize the ORB, 
			// get reference to rootpoa & activate the POAManager
			ORB orb = ORB.init(args, null);      
		    POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
		    rootpoa.the_POAManager().activate();
		 
		    // create servant and register it with the ORB
		    ChatroomObj chatOBJ = new ChatroomObj();
		    chatOBJ.setORB(orb); 
		 
		    // get object reference from the servant
		    org.omg.CORBA.Object ref = rootpoa.servant_to_reference(chatOBJ);
		    Chatroom href = ChatroomHelper.narrow(ref);
		 
		    // get the root naming context
		    // NameService invokes the name service
		    org.omg.CORBA.Object objRef =  orb.resolve_initial_references("NameService");
		    
		    // Use NamingContextExt which is part of the Interoperable
		    // Naming Service (INS) specification.
		    NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
		 
		    // bind the Object Reference in Naming
		    NameComponent path[] = ncRef.to_name( "ABC" );
		    ncRef.rebind(path, href);
		 
		    System.out.println("Simplechat Server ready and waiting ...");
		 
		    // wait for invocations from clients
		    for (;;){ orb.run(); }
		    
		} 
 
		catch (Exception e) {
			System.err.println("Simplechat Client exception: " + e);
			e.printStackTrace(System.out);
		}
 
		System.out.println("Simplechat Server Exiting ...");
 
	}
}