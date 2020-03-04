/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavish.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Base64;

/**
 *
 * @author STUDENT
 */
public class Encrypter extends UnicastRemoteObject implements EncrypterInterface{

    Encrypter() throws RemoteException{
        
    }
    
    @Override
    public String encrypt(String s) throws RemoteException {
        return Base64.getEncoder().encodeToString(s.getBytes());
    }
    
}
