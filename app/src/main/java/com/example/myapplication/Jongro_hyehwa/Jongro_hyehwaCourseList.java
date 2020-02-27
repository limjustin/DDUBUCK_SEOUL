package com.example.myapplication.Jongro_hyehwa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Jongro_hyehwaCourseList extends AppCompatActivity {

    private Button Jh_course1, Jh_course2, Jh_course3, Jh_course4,Jh_course5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jongro_hyehwa_course_list);

        Jh_course1 = findViewById(R.id.btn_move1);
        Jh_course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Jongro_hyehwaCourseList.this, Jongro_hyehwaCourse1.class);
                startActivity(intent1);
            }
        });
        Jh_course2 = findViewById(R.id.btn_move2);
        Jh_course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Jongro_hyehwaCourseList.this, Jongro_hyehwaCourse2.class);
                startActivity(intent2);
            }
        });
        Jh_course3 = findViewById(R.id.btn_move3);
        Jh_course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Jongro_hyehwaCourseList.this, Jongro_hyehwaCourse3.class);
                startActivity(intent3);
            }
        });
        Jh_course4 = findViewById(R.id.btn_move4);
        Jh_course4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(Jongro_hyehwaCourseList.this, Jongro_hyehwaCourse4.class);
                startActivity(intent4);
            }
        });
        Jh_course5 = findViewById(R.id.btn_move5);
        Jh_course5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(Jongro_hyehwaCourseList.this, Jongro_hyehwaCourse5.class);
                startActivity(intent4);
            }
        });
    }
}
