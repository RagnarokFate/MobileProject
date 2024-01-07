package com.myapp.Server.Handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ResponseHandler extends Thread {
    private Socket serverSocket;

    public ResponseHandler(Socket serverSocket) {
        this.serverSocket = serverSocket;
    }

    @Override
    public void run() {
        try {
            // Setup input stream
            BufferedReader reader = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));

            // Read server responses
            String serverResponse = reader.readLine();
            System.out.println("Received response from server: " + serverResponse);

            // Process the response (add your logic here)

            // Close the connection
            reader.close();
            serverSocket.close();
        } catch (IOException e) {
            System.err.println("Error handling server response: " + e.getMessage());
        }
    }
}
