import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
import java.lang.reflect.Array;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MultithreadingClient implements Runnable{
private int port;
private Socket clientSocket;
private ServerSocket serverSocket;

    public MultithreadingClient(int port) throws IOException {
        this.port = port;
        serverSocket = new ServerSocket();
    }

    @Override
    public void run() {
        try (BufferedReader inputStream = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             OutputStream outputStream = clientSocket.getOutputStream();
             String context = Arrays.stream(inputStream.readLine().split(" ")).collect(Collectors.toList()).get(1);
            while (serverSocket.isBound() && !serverSocket.isClosed()){
            if (context.equalsIgnoreCase("/")){
            String html = "<html><body><h1>Hello, I am here</h1></body></html>";

            }


        }

    }
}
