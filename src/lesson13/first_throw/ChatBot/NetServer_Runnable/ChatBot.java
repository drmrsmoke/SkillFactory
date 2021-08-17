package lesson13.first_throw.ChatBot.NetServer_Runnable;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatBot {
    ArrayList<Client> clients = new ArrayList<>();
    ServerSocket server;

    public ChatBot() throws IOException {
        server = new ServerSocket(1234);
    }
    public void SendMessage(String st){
        for (Client client : clients){
            client.recieve(st);
        }


    }

    public void run(){
        while(true){
            System.out.println(" Waiting for connection");
            try {
                Socket socket = server.accept();
                System.out.println("Client connected!");

                clients.add(new Client(socket, this));

            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
//only for git
    public static void main(String[] args) throws IOException {
        new ChatBot().run();

    }
}
