package lavish;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;

public class L4 {
   
    public static void main(String[] args) throws IOException {
        Socket skt = new ServerSocket(1002).accept();
        DataInputStream dis = new DataInputStream(skt.getInputStream());
        System.out.println(dis.readUTF());
        
        DataOutputStream dos = new DataOutputStream(skt.getOutputStream());
        dos.writeUTF("Hellllllllllooooooooooooooo!");
    }
    
}