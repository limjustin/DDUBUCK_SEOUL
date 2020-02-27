package com.example.myapplication.Junggu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class  JungguCourseList extends AppCompatActivity {
    private Button J_course1, J_course2, J_course3, J_course4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junggu_course_list);

        J_course1 = findViewById(R.id.btn_move1);
        J_course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(JungguCourseList.this, JungguCourse1.class);
                startActivity(intent1);
            }
        });
        J_course2 = findViewById(R.id.btn_move2);
        J_course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(JungguCourseList.this,JungguCourse2.class);
                startActivity(intent2);
            }
        });
        J_course3 = findViewById(R.id.btn_move3);
        J_course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(JungguCourseList.this,JungguCourse3.class);
                startActivity(intent3);
            }
        });
        J_course4 = findViewById(R.id.btn_move4);
        J_course4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(JungguCourseList.this,JungguCourse4.class);
                startActivity(intent4);
            }
        });

    }
}