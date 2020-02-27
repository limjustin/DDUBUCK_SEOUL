package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {
    private  Button RecMap_button, ExplainApp_button, MyCourse_button, Weather_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        RecMap_button = findViewById(R.id.course_recommend);
        RecMap_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainMenu.this, RecMap.class);
                startActivity(intent2);
            }
        });

        ExplainApp_button = findViewById(R.id.app_explain);
        ExplainApp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainMenu.this, ExplainApp.class);
                startActivity(intent2);
            }
        });

        MyCourse_button = findViewById(R.id.make_mycourse);
        MyCourse_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainMenu.this,MakeMyCourse.class);
                startActivity(intent2);
            }
        });

        Weather_button = findViewById(R.id.weather);
        Weather_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainMenu.this, Weather.class);
                startActivity(intent2);
            }
        });
    }
}

