package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ExplainApp extends AppCompatActivity {
    private Button D_button, A_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain_app);
        D_button = findViewById(R.id.dev_button);
        D_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ExplainApp.this, DevPopup.class);
                startActivity(intent1);
            }
        });
        A_button = findViewById(R.id.app_button);
        A_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ExplainApp.this, AppPopup.class);
                startActivity(intent1);
            }
        });
    }
}
