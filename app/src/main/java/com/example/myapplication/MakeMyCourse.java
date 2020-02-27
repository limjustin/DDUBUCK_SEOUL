package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MakeMyCourse extends AppCompatActivity {

    public Button gotomakecourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_my_course);

        gotomakecourse = findViewById(R.id.btn_move_my);
        gotomakecourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/d/?hl=ko"));
                startActivity(intent2);
            }
        });
    }
}
