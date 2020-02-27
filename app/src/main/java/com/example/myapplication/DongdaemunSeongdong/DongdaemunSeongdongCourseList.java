package com.example.myapplication.DongdaemunSeongdong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class  DongdaemunSeongdongCourseList extends AppCompatActivity {
    private Button GSND_course1, GSND_course2, GSND_course3, GSND_course4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dongdaemun_seongdong_course_list);

        GSND_course1 = findViewById(R.id.btn_move1);
        GSND_course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(DongdaemunSeongdongCourseList.this,DongdaemunSeongdongCourse1.class);
                startActivity(intent1);
            }
        });
        GSND_course2 = findViewById(R.id.btn_move2);
        GSND_course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(DongdaemunSeongdongCourseList.this,DongdaemunSeongdongCourse2.class);
                startActivity(intent2);
            }
        });
        GSND_course3 = findViewById(R.id.btn_move3);
        GSND_course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(DongdaemunSeongdongCourseList.this,DongdaemunSeongdongCourse3.class);
                startActivity(intent3);
            }
        });
        GSND_course4 = findViewById(R.id.btn_move4);
        GSND_course4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(DongdaemunSeongdongCourseList.this,DongdaemunSeongdongCourse4.class);
                startActivity(intent4);
            }
        });
    }
}
