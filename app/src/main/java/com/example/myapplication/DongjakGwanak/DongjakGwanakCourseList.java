package com.example.myapplication.DongjakGwanak;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class  DongjakGwanakCourseList extends AppCompatActivity {
    private Button DG_course1, DG_course2, DG_course3, DG_course4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dongjak_gwanak_course_list);

        DG_course1 = findViewById(R.id.btn_move1);
        DG_course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(DongjakGwanakCourseList.this, DongjakGwanakCourse1.class);
                startActivity(intent1);
            }
        });
        DG_course2 = findViewById(R.id.btn_move2);
        DG_course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(DongjakGwanakCourseList.this,DongjakGwanakCourse2.class);
                startActivity(intent2);
            }
        });
        DG_course3 = findViewById(R.id.btn_move3);
        DG_course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(DongjakGwanakCourseList.this,DongjakGwanakCourse3.class);
                startActivity(intent3);
            }
        });
        DG_course4 = findViewById(R.id.btn_move4);
        DG_course4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(DongjakGwanakCourseList.this,DongjakGwanakCourse4.class);
                startActivity(intent4);
            }
        });

    }
}
