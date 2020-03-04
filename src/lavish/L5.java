package lavish;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class L5 {
   
    public static void main(String[] args) throws Exception{
        Socket skt = new Socket("172.16.53.34", 1002);
        DataOutputStream dos = new DataOutputStream(skt.getOutputStream());
        DataInputStream dis = new DataInputStream(skt.getInputStream());
        Scanner sc = new Scanner(System.in);
        
        new Thread(){
            @Override
            public void run(){
                while(true){
                    try {
                        System.out.println("RECEIVED : " + dis.readUTF());
                    } catch (IOException ex) {
                        Logger.getLogger(L5.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
        String msg = "";
        while(!msg.equals("STOP")){
            System.out.println("SEND : ");
            msg = sc.next();
            dos.writeUTF(msg);
        }
        
    }
    
}