package com.myapp.Database;

import com.myapp.Database.entity.DatabaseConnectDetails;

import java.sql.Connection;

public class MainConfig {
    public static void main(String[] args) {
        // Database connection details
        String databaseUrl = "jdbc:mysql://localhost:3306/your_database";
        String databaseUsername = "your_username";
        String databasePassword = "your_password";

        // Create an instance of DatabaseConnectDetails
        DatabaseConnectDetails databaseDetails = new DatabaseConnectDetails(databaseUrl, databaseUsername, databasePassword);

        // Use ConnectToDatabase to establish the connection
        Connection databaseConnection = ConnectToDatabase.connect(databaseDetails);

        // Now you have the database connection to use in your application
    }
}
