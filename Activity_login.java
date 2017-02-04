package com.example.administorzz.cs_classtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button = (Button) findViewById(R.id.jump_btn);

        final View.OnClickListener btn_click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             launch_maininterface();
                //click motion
            }
        };
        button.setOnClickListener(btn_click);
    }

    public void launch_maininterface(){
        Intent intent = new Intent(Activity_login.this,Activity_maininterface.class);
        startActivity(intent);
    }
}
