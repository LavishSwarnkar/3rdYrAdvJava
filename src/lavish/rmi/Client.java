/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavish.rmi;

import java.rmi.Naming;

/**
 *
 * @author STUDENT
 */
public class Client {
    public static void main(String args[]) throws Exception{
        EncrypterInterface enc = (EncrypterInterface) Naming.lookup("rmi://localhost/test");
        System.out.println(enc.encrypt("Lavish Swarnkar"));
    }
}
