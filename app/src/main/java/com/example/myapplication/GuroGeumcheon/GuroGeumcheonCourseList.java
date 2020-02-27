package com.example.myapplication.GuroGeumcheon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class  GuroGeumcheonCourseList extends AppCompatActivity {
    private Button GG_course1, GG_course2, GG_course3, GG_course4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guro_geumcheon_course_list);

        GG_course1 = findViewById(R.id.btn_move1);
        GG_course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(GuroGeumcheonCourseList.this, GuroGeumcheonCourse1.class);
                startActivity(intent1);
            }
        });
        GG_course2 = findViewById(R.id.btn_move2);
        GG_course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(GuroGeumcheonCourseList.this,GuroGeumcheonCourse2.class);
                startActivity(intent2);
            }
        });
        GG_course3 = findViewById(R.id.btn_move3);
        GG_course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(GuroGeumcheonCourseList.this,GuroGeumcheonCourse3.class);
                startActivity(intent3);
            }
        });

    }
}
