package com.myapp.Data.Repository;

import com.myapp.Data.Model.Response;
import com.myapp.Data.Model.Request;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerRepository {

    private static final String SERVER_IP = "192.168.1.200"; // Replace with your server's IP address

    public Response sendRequestToServer(Request request) {
        try {
            // Establish a connection to the server
            Socket socket = new Socket(SERVER_IP, 8080);

            // Create ObjectInputStream and ObjectOutputStream for communication
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

            // Convert the Request object to JSON
            String jsonRequest = new Gson().toJson(request);

            // Send the JSON request to the server
            objectOutputStream.writeObject(jsonRequest);
            objectOutputStream.flush();

            // Receive the JSON response from the server
            String jsonResponse = (String) objectInputStream.readObject();

            // Convert JSON to a Response object using Gson
            Response response = new Gson().fromJson(jsonResponse, Response.class);

            // Close the connections
            objectOutputStream.close();
            objectInputStream.close();
            socket.close();

            return response;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            // Handle errors appropriately in a real-world scenario
            return new Response(-1,"Error: " + e.getMessage());
        }
    }}
