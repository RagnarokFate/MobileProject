package com.myapp.entities;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Time;
import java.util.Date;

public class App_Activity {
    public String Device_IP_Address;
    public String Device_Type;
    public Time Last_Activity_Login_Time;
    public String Last_Activity_Approximate_Location;

    // Constructor
    public App_Activity(String deviceType, Date latestLoginTime, String latestLoginLocation) {
        // Set Device_Type
        this.Device_Type = deviceType;

        // Set Device_IP_Address
        try {
            this.Device_IP_Address = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            // Handle the exception according to your requirements
            e.printStackTrace();
        }

        // Set Last_Activity_Login_Time
        this.Last_Activity_Login_Time = new Time(latestLoginTime.getTime());

        // Set Last_Activity_Approximate_Location
        this.Last_Activity_Approximate_Location = latestLoginLocation;
    }
}
