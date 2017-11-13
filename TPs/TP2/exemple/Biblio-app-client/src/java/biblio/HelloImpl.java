/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package biblio;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author roos
 */
public class HelloImpl extends javax.rmi.PortableRemoteObject implements HelloITF
{
    
	public HelloImpl() throws RemoteException
	{
	  super();
	}
	
	public void say(String message) throws RemoteException
	{
	  System.out.println(message);
	}
	  
}
