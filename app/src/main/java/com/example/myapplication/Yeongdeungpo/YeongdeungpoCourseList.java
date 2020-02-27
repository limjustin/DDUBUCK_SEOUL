package com.example.myapplication.Yeongdeungpo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class  YeongdeungpoCourseList extends AppCompatActivity {
    private Button Y_course1, Y_course2, Y_course3, Y_course4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeongdeungpo_course_list);

        Y_course1 = findViewById(R.id.btn_move1);
        Y_course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(YeongdeungpoCourseList.this, YeongdeungpoCourse1.class);
                startActivity(intent1);
            }
        });
        Y_course2 = findViewById(R.id.btn_move2);
        Y_course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(YeongdeungpoCourseList.this,YeongdeungpoCourse2.class);
                startActivity(intent2);
            }
        });
        Y_course3 = findViewById(R.id.btn_move3);
        Y_course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(YeongdeungpoCourseList.this,YeongdeungpoCourse3.class);
                startActivity(intent3);
            }
        });
        Y_course4 = findViewById(R.id.btn_move4);
        Y_course4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(YeongdeungpoCourseList.this,YeongdeungpoCourse4.class);
                startActivity(intent4);
            }
        });

    }
}