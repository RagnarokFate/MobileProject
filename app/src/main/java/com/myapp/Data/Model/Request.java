package com.myapp.Data.Model;

public class Request {
    public int request_id;
    public int user_request_id;

    public String username;

    public Object Data_received;

    public Object Data_sent;

    public Object message;

    public String message_content;

    // ================== CONSTRUCTOR ===================================

    public Request(int request_id, int user_request_id, String username, Object data_received, Object data_sent, Object message, String message_content) {
        this.request_id = request_id;
        this.user_request_id = user_request_id;
        this.username = username;
        Data_received = data_received;
        Data_sent = data_sent;
        this.message = message;
        this.message_content = message_content;
    }

    public Request(int request_id, String message_content) {
        this.request_id = request_id;
        this.message_content = message_content;
    }

    public Request() {

    }
    // ==================================================================

    public int getRequest_id() {
        return request_id;
    }

    public void setRequest_id(int request_id) {
        this.request_id = request_id;
    }

    public int getUser_request_id() {
        return user_request_id;
    }

    public void setUser_request_id(int user_request_id) {
        this.user_request_id = user_request_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Object getData_received() {
        return Data_received;
    }

    public void setData_received(Object data_received) {
        Data_received = data_received;
    }

    public Object getData_sent() {
        return Data_sent;
    }

    public void setData_sent(Object data_sent) {
        Data_sent = data_sent;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public String getMessage_content() {
        return message_content;
    }

    public void setMessage_content(String message_content) {
        this.message_content = message_content;
    }
}
