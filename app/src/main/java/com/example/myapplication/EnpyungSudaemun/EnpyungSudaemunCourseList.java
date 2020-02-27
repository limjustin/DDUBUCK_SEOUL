package com.example.myapplication.EnpyungSudaemun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class EnpyungSudaemunCourseList extends AppCompatActivity {

    private Button ES_course1,ES_course2,ES_course3,ES_course4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enpyung_sudaemun_course_list);

        ES_course1 = findViewById(R.id.btn_move1);
        ES_course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(EnpyungSudaemunCourseList.this,EnpyungSudaemunCourse1.class);
                startActivity(intent1);
            }
        });

        ES_course2 = findViewById(R.id.btn_move2);
        ES_course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(EnpyungSudaemunCourseList.this,EnpyungSudaemunCourse2.class);
                startActivity(intent2);
            }
        });

        ES_course3 = findViewById(R.id.btn_move3);
        ES_course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(EnpyungSudaemunCourseList.this,EnpyungSudaemunCourse3.class);
                startActivity(intent3);
            }
        });

        ES_course4 = findViewById(R.id.btn_move4);
        ES_course4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(EnpyungSudaemunCourseList.this,EnpyungSudaemunCourse4.class);
                startActivity(intent4);
            }
        });

    }
}
