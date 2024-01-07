package com.myapp.Database;

import com.myapp.Database.entity.DatabaseConnectDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDatabase {
    public static Connection connect(DatabaseConnectDetails details) {
        Connection connection = null;
        try {
            // Extracting database connection details
            String url = details.getUrl();
            String username = details.getUsername();
            String password = details.getPassword();

            // Establishing the connection
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
        return connection;
    }
}


