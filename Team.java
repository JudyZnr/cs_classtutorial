package com.example.administorzz.cs_classtutorial;

/**
 * Created by administorzz on 17/2/9.
 */

public class Team {

    public String teamName;
    public int imageId;
    public String dateTime;

    public Team(String name, int imageId,String time)
    {
        this.teamName =name;
        this.imageId=imageId;
        this.dateTime=time;
    }
    public String getTeamName (){
        return teamName;
    }
    public int getImageId(){
        return imageId;
    }
    public String getDateTime(){
        return dateTime;
    }

}
