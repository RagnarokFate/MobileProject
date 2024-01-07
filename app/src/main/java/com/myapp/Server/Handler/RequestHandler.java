package com.myapp.Server.Handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class RequestHandler extends Thread {
    private Socket clientSocket;

    public RequestHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            // Setup input and output streams
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

            // Read client requests
            String clientRequest = reader.readLine();
            System.out.println("Received request from client: " + clientRequest);

            // Process the request (add your logic here)

            // Send a response back to the client
            String serverResponse = "Server response to: " + clientRequest;
            writer.println(serverResponse);
            System.out.println("Sent response to client: " + serverResponse);

            // Close the connections
            reader.close();
            writer.close();
            clientSocket.close();
        } catch (IOException e) {
            System.err.println("Error handling client request: " + e.getMessage());
        }
    }
}
