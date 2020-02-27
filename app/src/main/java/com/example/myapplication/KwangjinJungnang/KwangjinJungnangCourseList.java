package com.example.myapplication.KwangjinJungnang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class  KwangjinJungnangCourseList extends AppCompatActivity {
    private Button KJ_course1, KJ_course2, KJ_course3, KJ_course4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kwangjin_jungnang_course_list);

        KJ_course1 = findViewById(R.id.btn_move1);
        KJ_course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(KwangjinJungnangCourseList.this, KwangjinJungnangCourse1.class);
                startActivity(intent1);
            }
        });
        KJ_course2 = findViewById(R.id.btn_move2);
        KJ_course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(KwangjinJungnangCourseList.this,KwangjinJungnangCourse2.class);
                startActivity(intent2);
            }
        });
        KJ_course3 = findViewById(R.id.btn_move3);
        KJ_course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(KwangjinJungnangCourseList.this,KwangjinJungnangCourse3.class);
                startActivity(intent3);
            }
        });
        KJ_course4 = findViewById(R.id.btn_move4);
        KJ_course4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(KwangjinJungnangCourseList.this,KwangjinJungnangCourse4.class);
                startActivity(intent4);
            }
        });

    }
}