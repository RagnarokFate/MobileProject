package com.myapp.server.Util;

import android.os.AsyncTask;

import com.myapp.Data.Model.Request;
import com.myapp.Data.Model.Response;

import com.myapp.Data.Repository.ServerRepository;

public class ConnectToServerTask extends AsyncTask<Void, Void, Response> {

    private final Request request;
    private final OnTaskCompleteListener listener;

    public ConnectToServerTask(Request request, OnTaskCompleteListener listener) {
        this.request = request;
        this.listener = listener;
    }

    @Override
    protected Response doInBackground(Void... voids) {
        // Connect to the server and send the request
        ServerRepository serverRepository = new ServerRepository();
        return serverRepository.sendRequestToServer(request);
    }

    @Override
    protected void onPostExecute(Response response) {
        // Update UI with the server's response
        // For example, display the response in a TextView
        // textView.setText(response.getMessage());

        // Notify the listener about task completion
        if (listener != null) {
            listener.onTaskComplete(response);
        }
    }

    public interface OnTaskCompleteListener {
        void onTaskComplete(Response response);
    }
}
