package com.example.myapplication.Mapogu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class MapoguCourseList extends AppCompatActivity {
    private Button M_course1, M_course2, M_course3, M_course4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapogu_course_list);

        M_course1 = findViewById(R.id.btn_move1);
        M_course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MapoguCourseList.this, MapoguCourse1.class);
                startActivity(intent1);
            }
        });
        M_course2 = findViewById(R.id.btn_move2);
        M_course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MapoguCourseList.this,MapoguCourse2.class);
                startActivity(intent2);
            }
        });
        M_course3 = findViewById(R.id.btn_move3);
        M_course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MapoguCourseList.this,MapoguCourse3.class);
                startActivity(intent3);
            }
        });
        M_course4 = findViewById(R.id.btn_move4);
        M_course4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MapoguCourseList.this,MapoguCourse4.class);
                startActivity(intent4);
            }
        });
    }
}
