
package learn.socket.prog;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class Client {
        
    public static void main(String[] args) throws IOException {
            
        Socket socket = new Socket("localhost", 12345);
           DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        System.out.println(dataInputStream.readUTF());
        
        Scanner scanner = new Scanner (System.in);
        String message = scanner.nextLine();
        dataOutputStream.writeUTF("message");
         dataInputStream.close();
            dataOutputStream.close();
            socket.close();
                    
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
