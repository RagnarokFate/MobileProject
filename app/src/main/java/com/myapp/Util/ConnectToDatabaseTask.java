package com.myapp.Util;

import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectToDatabaseTask extends AsyncTask<String, Void, String> {
    @Override
    protected String doInBackground(String... params) {
        try {
            // Replace the URL with the location of your PHP file
            URL url = new URL("http://your_server_domain/db_connect.php");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder result = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                result.append(line);
            }

            return result.toString();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String result) {
        // Handle the result as needed
        // For example, parse JSON or update UI
    }
}
