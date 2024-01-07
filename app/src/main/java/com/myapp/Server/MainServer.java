package com.myapp.Server;

import com.myapp.Server.Handler.RequestHandler;

import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
    public static void main(String[] args) {
        // Start the server
        ServerSocket serverSocket = ConnectToServer.startServer();

        // Accept client connections
        while (true) {
            Socket clientSocket = ConnectToServer.acceptClient(serverSocket);

            // Handle requests in a separate thread using RequestHandler
            new RequestHandler(clientSocket).start();
        }
    }
}

