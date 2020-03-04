/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavish.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author STUDENT
 */
public interface EncrypterInterface extends Remote{
    public String encrypt(String s) throws RemoteException;
}
