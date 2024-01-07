package com.myapp.Server;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class ConnectToServer {
    private static final int PORT = 8080;

    public static ServerSocket startServer() {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(PORT);
            System.out.println("Server started on port " + PORT);
        } catch (IOException e) {
            System.err.println("Error starting the server: " + e.getMessage());
        }
        return serverSocket;
    }

    public static Socket acceptClient(ServerSocket serverSocket) {
        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
            System.out.println("Accepted connection from: " + clientSocket.getInetAddress());
        } catch (IOException e) {
            System.err.println("Error accepting client connection: " + e.getMessage());
        }
        return clientSocket;
    }
}
