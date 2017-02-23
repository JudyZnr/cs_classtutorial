package com.example.administorzz.cs_classtutorial;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by administorzz on 17/2/13.
 */

public class Activity_maininterface extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Log.d("hello","world");
            setContentView(R.layout.activity_maininterface);

            Team Chicago_state = new Team ("Chicago_State", R.drawable.fightingirish,"Feb 1");
             Team Georgia_Tech = new Team("Georgia_Tech",R.drawable.georgiatech ,"Feb 10");
            Team North_Virginia = new Team("North_Virginia",R.drawable.north_virginia ,"Mar 1");
            Team Wake_Forest = new Team("Wake_Forest",R.drawable.wake_forest ,"Mar 2");
            Team Ohio_State = new Team("Ohio_State",R.drawable.ohio_state ,"Mar 15");
            Team Florida_State = new Team("Florida_State",R.drawable.florida_state ,"Mar 30");
            Team Boston_college= new Team("Boston_college",R.drawable.boston_college ,"Apr 5");
            Team North_Carolina = new Team("North_Carolina",R.drawable.north_carolina ,"Apr 15");

            ArrayList<Team> scheduleList = new ArrayList<Team>();

            scheduleList.add(Chicago_state);
            scheduleList.add(Georgia_Tech);
            scheduleList.add(North_Virginia);
            scheduleList.add(Wake_Forest);
            scheduleList.add(Ohio_State);
            scheduleList.add(Florida_State);
            scheduleList.add(Boston_college);
            scheduleList.add(North_Carolina);


            ScheduleAdpater adpater = new ScheduleAdpater(com.example.administorzz.cs_classtutorial.Activity_maininterface.this, R.layout.schedule_item, scheduleList);
            ListView scheduleListView = (ListView) findViewById(R.id.ScheduleListView);
            scheduleListView.setAdapter(adpater);


        }
    }

