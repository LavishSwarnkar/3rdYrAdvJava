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
public class Server {
    public static void main(String args[]) throws Exception{
        Encrypter enc = new Encrypter();
        Naming.rebind("rmi://localhost/test", enc);
    }
}
