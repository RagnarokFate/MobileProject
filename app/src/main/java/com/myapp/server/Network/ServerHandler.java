package com.myapp.server.Network;

import com.myapp.Data.Model.Response;
import com.myapp.Data.Model.Request;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerHandler implements Runnable {

    private final Socket clientSocket;

    public ServerHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            // Create ObjectInputStream and ObjectOutputStream for communication
            ObjectInputStream objectInputStream = new ObjectInputStream(clientSocket.getInputStream());
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(clientSocket.getOutputStream());

            // Read data from the client as a JSON string
            String jsonRequest = (String) objectInputStream.readObject();
            // Convert JSON to a Request object using Gson
            Response request = new Gson().fromJson(jsonRequest, Response.class);

            // Process the request
            String responseMessage = processRequest(request);

            // Create a Response object and convert it to JSON
            Request response = new Request();
            String jsonResponse = new Gson().toJson(response);

            // Send the JSON response back to the client
            objectOutputStream.writeObject(jsonResponse);
            objectOutputStream.flush();  

            // Close the connections
            objectInputStream.close();
            objectOutputStream.close();
            clientSocket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private String processRequest(Response request) {
        // Implement your business logic based on the received request
        // For example, you can perform database operations, authentication, etc.

        // For demonstration purposes, let's just echo the received message
        return "Server received: " + request.getMessage_content();
    }
}

