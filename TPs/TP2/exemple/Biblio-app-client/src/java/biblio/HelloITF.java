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
public interface HelloITF extends Remote {
    public void say(String message) throws RemoteException;
}
