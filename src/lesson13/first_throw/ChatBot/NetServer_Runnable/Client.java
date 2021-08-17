package lesson13.first_throw.ChatBot.NetServer_Runnable;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Runnable{
    Socket socket;
    Scanner in;
    PrintStream out;
    ChatBot server;

    public Client(Socket socket, ChatBot server) {

        this.socket = socket;
        this.server = server;
        new Thread(this).start();
    }

    void recieve(String message){
        out.println(message);

    }

    @Override
    public void run() {
        try{
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            in = new Scanner(is);
            out = new PrintStream(os);

            out.println("Welcome to mountains!");
            String input = in.nextLine();

            while(!input.equals("bye")){
                server.SendMessage(input);
                input=in.nextLine();
            }
            socket.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
