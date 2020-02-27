package com.example.myapplication.Gangnam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class  GangnamCourseList extends AppCompatActivity {
    private Button G_course1, G_course2, G_course3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gangnam_course_list);

        G_course1 = findViewById(R.id.btn_move1);
        G_course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(GangnamCourseList.this, GangnamCourse1.class);
                startActivity(intent1);
            }
        });
        G_course2 = findViewById(R.id.btn_move2);
        G_course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(GangnamCourseList.this,GangnamCourse2.class);
                startActivity(intent2);
            }
        });
        G_course3 = findViewById(R.id.btn_move3);
        G_course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(GangnamCourseList.this,GangnamCourse3.class);
                startActivity(intent3);
            }
        });

    }
}
