package learn.socket.prog;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
    
    
    
    public static void main(String[] args) throws IOException {
       
        ServerSocket serverSocket = new ServerSocket(12345);
              Socket socket =serverSocket.accept();
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                dataOutputStream.writeUTF("waiting for U Message x");
               String message =  dataInputStream.readUTF();
               System.out.println(message);
                  dataInputStream.close();
                 dataOutputStream.close();
                  socket.close();
                  serverSocket.close();
            
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

