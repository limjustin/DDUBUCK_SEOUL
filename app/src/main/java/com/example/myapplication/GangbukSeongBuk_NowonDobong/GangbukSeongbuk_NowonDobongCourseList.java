package com.example.myapplication.GangbukSeongBuk_NowonDobong;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class  GangbukSeongbuk_NowonDobongCourseList extends AppCompatActivity {
    private Button GSND_course1, GSND_course2, GSND_course3, GSND_course4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gangbuk_seongbuk__nowon_dobong_course_list);

        GSND_course1 = findViewById(R.id.btn_move1);
        GSND_course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(GangbukSeongbuk_NowonDobongCourseList.this, GangbukSeongbuk_NowonDobongCourse1.class);
                startActivity(intent1);
            }
        });
        GSND_course2 = findViewById(R.id.btn_move2);
        GSND_course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(GangbukSeongbuk_NowonDobongCourseList.this,GangbukSeongbuk_NowonDobongCourse2.class);
                startActivity(intent2);
            }
        });
        GSND_course3 = findViewById(R.id.btn_move3);
        GSND_course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(GangbukSeongbuk_NowonDobongCourseList.this,GangbukSeongbuk_NowonDobongCourse3.class);
                startActivity(intent3);
            }
        });
        GSND_course4 = findViewById(R.id.btn_move4);
        GSND_course4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(GangbukSeongbuk_NowonDobongCourseList.this,GangbukSeongbuk_NowonDobongCourse4.class);
                startActivity(intent4);
            }
        });
    }
}
