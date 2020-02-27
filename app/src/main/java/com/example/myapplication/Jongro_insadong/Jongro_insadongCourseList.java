package com.example.myapplication.Jongro_insadong;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Jongro_insadongCourseList extends AppCompatActivity {

    private Button Ji_course1, Ji_course2, Ji_course3, Ji_course4, Ji_course5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jongro_insadong_course_list);

        Ji_course1 = findViewById(R.id.btn_move1);
        Ji_course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Jongro_insadongCourseList.this, Jongro_insadongCourse1.class);
                startActivity(intent1);
            }
        });
        Ji_course2 = findViewById(R.id.btn_move2);
        Ji_course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Jongro_insadongCourseList.this,Jongro_insadongCourse2.class);
                startActivity(intent2);
            }
        });
        Ji_course3 = findViewById(R.id.btn_move3);
        Ji_course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Jongro_insadongCourseList.this,Jongro_insadongCourse3.class);
                startActivity(intent3);
            }
        });
        Ji_course4 = findViewById(R.id.btn_move4);
        Ji_course4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(Jongro_insadongCourseList.this,Jongro_insadongCourse4.class);
                startActivity(intent4);
            }
        });
        Ji_course5 = findViewById(R.id.btn_move5);
        Ji_course5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(Jongro_insadongCourseList.this,Jongro_insadongCourse5.class);
                startActivity(intent5);
            }
        });
    }
}
