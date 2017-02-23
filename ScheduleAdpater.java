package com.example.administorzz.cs_classtutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by administorzz on 17/2/8.
 */

public class ScheduleAdpater extends ArrayAdapter<Team> {
    private int resourceId;
    public ScheduleAdpater(Context context, int textViewResourceId, ArrayList<Team> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }
    public View getView (int position, View convertView, ViewGroup parent) {
        Team team=getItem(position);
        View view = convertView;
//        View view= LayoutInflater.from(getContext()).inflate(resourceId,null);
//        ImageView teamLogo = (ImageView) view.findViewById(R.id.teamlogo);
//        TextView teamName = (TextView) view.findViewById(R.id.textTeam);
//        TextView dateTime =  (TextView)view.findViewById(R.id.textDate);
//
//        teamLogo.setImageResource(team.getImageId());
//        teamName.setText(team.getTeamName());
//        dateTime.setText(team.getDateTime());
        return  view;

    }

}
