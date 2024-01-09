package com.myapp.Entities;


public class Fetch_Data_Cell_Entity {
    private String id;
    private String userUsername;
    private String userEmail;
    private String userPassword;
    private String userGender;
    private String userPhoneNumber;
    private double appCurrency;
    private App_Activity_Entity latestActivity;

    public Fetch_Data_Cell_Entity(String id, String userUsername, String userEmail, String userPassword,
                               String userGender, String userPhoneNumber, double appCurrency,
                               App_Activity_Entity latestActivity) {
        this.id = id;
        this.userUsername = userUsername;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userGender = userGender;
        this.userPhoneNumber = userPhoneNumber;
        this.appCurrency = appCurrency;
        this.latestActivity = latestActivity;
    }

    // Add getters and setters for all fields

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public double getAppCurrency() {
        return appCurrency;
    }

    public void setAppCurrency(double appCurrency) {
        this.appCurrency = appCurrency;
    }

    public App_Activity_Entity getLatestActivity() {
        return latestActivity;
    }

    public void setLatestActivity(App_Activity_Entity latestActivity) {
        this.latestActivity = latestActivity;
    }
}

