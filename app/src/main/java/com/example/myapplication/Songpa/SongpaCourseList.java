package com.example.myapplication.Songpa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class  SongpaCourseList extends AppCompatActivity {
    private Button S_course1, S_course2, S_course3, S_course4,S_course5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songpa_course_list);

        S_course1 = findViewById(R.id.btn_move1);
        S_course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(SongpaCourseList.this, SongpaCourse1.class);
                startActivity(intent1);
            }
        });
        S_course2 = findViewById(R.id.btn_move2);
        S_course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(SongpaCourseList.this,SongpaCourse2.class);
                startActivity(intent2);
            }
        });
        S_course3 = findViewById(R.id.btn_move3);
        S_course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(SongpaCourseList.this,SongpaCourse3.class);
                startActivity(intent3);
            }
        });
        S_course4 = findViewById(R.id.btn_move4);
        S_course4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(SongpaCourseList.this,SongpaCourse4.class);
                startActivity(intent4);
            }
        });
        S_course5 = findViewById(R.id.btn_move5);
        S_course5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(SongpaCourseList.this,SongpaCourse5.class);
                startActivity(intent5);
            }
        });

    }
}