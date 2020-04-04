import java.net.*;
import java.io.*;

//starter code from https://www.geeksforgeeks.org/socket-programming-in-java/
// modifications were made for allowing both server and client to pass and display inputs and outputs

public class Server{

    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;
    private DataOutputStream outServer = null;

    public Server(int port){
        try{
            server = new ServerSocket(port);
            System.out.println("Server started");
            System.out.println("Wiating for client...");

            socket = server.accept();
            System.out.println("Client accepted");


            outServer = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(
                new BufferedInputStream(socket.getInputStream())
            );
            String serverLine = "";
            String out;
            Chatbot chbt = new Chatbot();
            outServer.writeUTF("hello");

             while(!serverLine.equals("Over")){
                 try{
                     serverLine = in.readUTF();
                     System.out.println( "client says: " + serverLine);
                     out = chbt.ear(serverLine);
                     outServer.writeUTF(out);
                     System.out.println("server says: " + out);
                 }
                 catch(IOException i){
                     System.out.println(i);
                 }
             }
             System.out.println("Closing connection");
             socket.close();
             in.close();
               
        }
        catch(IOException i){
            System.out.println(i);
                }
    }
    public static void main(String args[]){
        Server server = new Server(5003);
    }


}
