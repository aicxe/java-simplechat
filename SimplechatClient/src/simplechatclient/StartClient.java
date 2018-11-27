package simplechatclient;

/**
*	This class contains the implementation of the Simplechat Client.
*
*	@author Jay Pineda
*/

import ChatroomApp.*;

import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import java.io.*;
import java.util.*;

public class StartClient {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		try {
			// create and initialize the ORB
			ORB orb = ORB.init(args, null);
			
			// get the root naming context
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			
			// Use NamingContextExt instead of NamingContext. This is 
	        // part of the Interoperable naming Service. 
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
			
			
			// resolve the Object Reference in Naming
			Chatroom chatobj = (Chatroom) ChatroomHelper.narrow(ncRef.resolve_str("ABC"));

			Scanner c = new Scanner(System.in);
			System.out.println("Welcome to the addition system:"); 
			
		    for(;;){
		    	System.out.println("Enter a:");
		    	String aa = c.nextLine();
		    	System.out.println("Enter b:");
		    	String bb = c.nextLine();
		    	
		    	int a = Integer.parseInt(aa);
		    	int b = Integer.parseInt(bb);
		    	int r = chatobj.add(a,b);
		    	
		    	System.out.println("The result for addition is : "+r);
		    	System.out.println("-----------------------------------");
		    }
		    
		}
      
		catch (Exception e) {
			System.out.println("Simplechat Client exception: " + e);
			e.printStackTrace();
		}
		
	}
	
}