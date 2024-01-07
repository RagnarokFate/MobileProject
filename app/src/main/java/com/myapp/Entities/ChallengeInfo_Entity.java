package com.myapp.Entities.Data_Entities;

import java.sql.Time;

public class ChallengeInfo_Entity {
    public Time Challenge_Duration;
    public Time Challenge_Initalize_Time;
    // TODO - will be computed through initialize!
    public Time Challenge_Deadline;
    public int Challenge_Id;
    public String Challenge_Host_username;
    public boolean is_public;
    public boolean is_accomplished;
    public boolean is_active;

    //Challenge Files Data
    public String Path_To_Host_Video;
    public String Path_To_Participant_Video;

    public boolean File_Status;
}
