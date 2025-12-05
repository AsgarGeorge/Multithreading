package basicMultithreading.SocketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServer {
    public static void main(String[] args) throws IOException {



        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Server listening on port 8080...");

        while (true) {

            Socket clientSocket = serverSocket.accept();

            // 4. Read the client request (usually just the first line for a basic GET)
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String requestLine = in.readLine();
            System.out.println("Received: " + requestLine);


            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);


            out.println("HTTP/1.1 200 OK");

            out.println("Content-Type: text/html");
            out.println();

            out.println("<html><body><h1>Hello from Java Server!</h1></body></html>");

            // 6. Close the connection
            clientSocket.close();
        }
    }
}