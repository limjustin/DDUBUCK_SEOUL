package com.example.myapplication.Yongsan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class YongsanCourseList extends AppCompatActivity {
    private Button Y_course1, Y_course2, Y_course3, Y_course4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yongsan_course_list);

        Y_course1 = findViewById(R.id.btn_move1);
        Y_course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(YongsanCourseList.this, YongsanCourse1.class);
                startActivity(intent1);
            }
        });
        Y_course2 = findViewById(R.id.btn_move2);
        Y_course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(YongsanCourseList.this,YongsanCourse2.class);
                startActivity(intent2);
            }
        });
        Y_course3 = findViewById(R.id.btn_move3);
        Y_course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(YongsanCourseList.this,YongsanCourse3.class);
                startActivity(intent3);
            }
        });
        Y_course4 = findViewById(R.id.btn_move4);
        Y_course4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(YongsanCourseList.this,YongsanCourse4.class);
                startActivity(intent4);
            }
        });
    }
}