package com.example.myapplication.KangsuYangchun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class KangsuYangchunCourseList extends AppCompatActivity {

    private Button KY_course1, KY_course2, KY_course3, KY_course4,KY_course5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kangsu_yangchun_course_list);

        KY_course1 = findViewById(R.id.btn_move1);
        KY_course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(KangsuYangchunCourseList.this, KangsuYangchunCourse1.class);
                startActivity(intent1);
            }
        });
        KY_course2 = findViewById(R.id.btn_move2);
        KY_course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(KangsuYangchunCourseList.this,KangsuYangchunCourse2.class);
                startActivity(intent2);
            }
        });
        KY_course3 = findViewById(R.id.btn_move3);
        KY_course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(KangsuYangchunCourseList.this,KangsuYangchunCourse3.class);
                startActivity(intent3);
            }
        });
        KY_course4 = findViewById(R.id.btn_move4);
        KY_course4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(KangsuYangchunCourseList.this,KangsuYangchunCourse4.class);
                startActivity(intent4);
            }
        });
        KY_course5 = findViewById(R.id.btn_move5);
        KY_course5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(KangsuYangchunCourseList.this,KangsuYangchunCourse5.class);
                startActivity(intent4);
            }
        });
    }
}
