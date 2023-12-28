package com.myapp.entities;
import androidx.room.PrimaryKey;

public class Account_Entity {
    @PrimaryKey(autoGenerate = true)
    public int database_id;
    public String id;
    public String User_username;
    public String User_Email;

    public String User_Password;

    public String User_Gender;

    public String User_Phone_number;

    public Account_Entity(String id, String user_username, String user_Email, String user_Password, String user_Gender) {

        this.id = id;
        this.User_username = user_username;
        this.User_Email = user_Email;
        this.User_Password = user_Password;
        this.User_Gender = user_Gender;
    }

    public Account_Entity(String id, String user_username, String user_Email, String user_Password, String user_Gender, String user_Phone_number) {
        this.id = id;
        this.User_username = user_username;
        this.User_Email = user_Email;
        this.User_Password = user_Password;
        this.User_Gender = user_Gender;
        this.User_Phone_number = user_Phone_number;
    }

    public Account_Entity(Account_Entity user_data, String user_Phone_number) {
        this.id = id;
        this.User_username = user_data.User_username;
        this.User_Email = user_data.User_Email;
        this.User_Password = user_data.User_Password;
        this.User_Gender = user_data.User_Gender;
        this.User_Phone_number = user_Phone_number;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_username() {
        return User_username;
    }

    public void setUser_username(String user_username) {
        User_username = user_username;
    }

    public String getUser_Email() {
        return User_Email;
    }

    public void setUser_Email(String user_Email) {
        User_Email = user_Email;
    }

    public String getUser_Password() {
        return User_Password;
    }

    public void setUser_Password(String user_Password) {
        User_Password = user_Password;
    }

    public String getUser_Gender() {
        return User_Gender;
    }

    public void setUser_Gender(String user_Gender) {
        User_Gender = user_Gender;
    }

    public String getUser_Phone_number() {
        return User_Phone_number;
    }

    public void setUser_Phone_number(String user_Phone_number) {
        User_Phone_number = user_Phone_number;
    }

}
