package com.myapp.Entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.myapp.UserInterface.UserType;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(tableName = "user_accounts")
public class Account_Entity {
    @PrimaryKey(autoGenerate = true)
    public int database_id;

    public String id;
    public String User_username;
    public String User_Email;
    public String User_Password;
    public String User_Gender;
    public String User_Phone_number;
    public UserType User_Type;

    private Set<String> friendIds = new HashSet<>();
    private List<Friendship_Entity> friendships = new ArrayList<>();

    public Account_Entity(String id, String user_username, String user_Email, String user_Password, String user_Gender, UserType User_Type) {
        this.id = id;
        this.User_username = user_username;
        this.User_Email = user_Email;
        this.User_Password = user_Password;
        this.User_Gender = user_Gender;
        this.User_Type = User_Type;
    }

    public Account_Entity(String id, String user_username, String user_Email, String user_Password, String user_Gender, String user_Phone_number, UserType User_Type) {
        this.id = id;
        this.User_username = user_username;
        this.User_Email = user_Email;
        this.User_Password = user_Password;
        this.User_Gender = user_Gender;
        this.User_Phone_number = user_Phone_number;
        this.User_Type = User_Type;
    }

    public Account_Entity(Account_Entity user_data, String user_Phone_number, UserType User_Type) {
        this.id = user_data.id;
        this.User_username = user_data.User_username;
        this.User_Email = user_data.User_Email;
        this.User_Password = user_data.User_Password;
        this.User_Gender = user_data.User_Gender;
        this.User_Phone_number = user_Phone_number;
        this.User_Type = User_Type;
    }

    // Getter and Setter methods

    public Set<String> getFriendIds() {
        return friendIds;
    }

    public void setFriendIds(Set<String> friendIds) {
        this.friendIds = friendIds;
    }

    public void addFriend(String friendId) {
        friendIds.add(friendId);
    }

    public void removeFriend(String friendId) {
        friendIds.remove(friendId);
    }

    public List<Friendship_Entity> getFriendships() {
        return friendships;
    }

    public void setFriendships(List<Friendship_Entity> friendships) {
        this.friendships = friendships;
    }

    public void addFriendship(Friendship_Entity friendship) {
        friendships.add(friendship);
    }
}

