package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.DongdaemunSeongdong.DongdaemunSeongdongCourseList;
import com.example.myapplication.DongjakGwanak.DongjakGwanakCourseList;
import com.example.myapplication.EnpyungSudaemun.EnpyungSudaemunCourseList;
import com.example.myapplication.GangbukSeongBuk_NowonDobong.GangbukSeongbuk_NowonDobongCourseList;
import com.example.myapplication.Gangnam.GangnamCourseList;
import com.example.myapplication.GuroGeumcheon.GuroGeumcheonCourseList;
import com.example.myapplication.Jongro_hyehwa.Jongro_hyehwaCourseList;
import com.example.myapplication.Jongro_insadong.Jongro_insadongCourseList;
import com.example.myapplication.Junggu.JungguCourseList;
import com.example.myapplication.KangsuYangchun.KangsuYangchunCourseList;
import com.example.myapplication.KwangjinJungnang.KwangjinJungnangCourseList;
import com.example.myapplication.Mapogu.MapoguCourseList;
import com.example.myapplication.Songpa.SongpaCourseList;
import com.example.myapplication.Yeongdeungpo.YeongdeungpoCourseList;
import com.example.myapplication.Yongsan.YongsanCourseList;

public class RecMap extends AppCompatActivity {
    private Button Y_button, J_button, J_button1, J_button2, DS_button;
    private Button KJ_button, M_button, ES_button, KSND_button, YD_button;
    private Button KY_button, GG_button, KD_button, SG_button, KS_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec_map);
        Y_button = findViewById(R.id.y_button);
        Y_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(RecMap.this, YongsanCourseList.class);
                startActivity(intent1);
            }
        });
        J_button = findViewById(R.id.j_button);
        J_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(RecMap.this, JungguCourseList.class);
                startActivity(intent2);
            }
        });
        J_button1 = findViewById(R.id.j_button1);
        J_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(RecMap.this, Jongro_insadongCourseList.class);
                startActivity(intent3);
            }
        });
        J_button2 = findViewById(R.id.j_button2);
        J_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(RecMap.this, Jongro_hyehwaCourseList.class);
                startActivity(intent4);
            }
        });
        KJ_button = findViewById(R.id.kj_button);
        KJ_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(RecMap.this, KwangjinJungnangCourseList.class);
                startActivity(intent5);
            }
        });
        DS_button = findViewById(R.id.ds_button);
        DS_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(RecMap.this, DongdaemunSeongdongCourseList.class);
                startActivity(intent6);
            }
        });
        M_button = findViewById(R.id.m_button);
        M_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7 = new Intent(RecMap.this, MapoguCourseList.class);
                startActivity(intent7);
            }
        });
        ES_button = findViewById(R.id.es_button);
        ES_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8 = new Intent(RecMap.this, EnpyungSudaemunCourseList.class);
                startActivity(intent8);
            }
        });
        KSND_button = findViewById(R.id.ksnd_button);
        KSND_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent9 = new Intent(RecMap.this, GangbukSeongbuk_NowonDobongCourseList.class);
                startActivity(intent9);
            }
        });

        YD_button = findViewById(R.id.yd_button);
        YD_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent10 = new Intent(RecMap.this, YeongdeungpoCourseList.class);
                startActivity(intent10);
            }
        });
        GG_button = findViewById(R.id.gg_button);
        GG_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent11 = new Intent(RecMap.this, GuroGeumcheonCourseList.class);
                startActivity(intent11);
            }
        });
        KD_button = findViewById(R.id.kd_button);
        KD_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent12 = new Intent(RecMap.this, DongjakGwanakCourseList.class);
                startActivity(intent12);
            }
        });
        SG_button = findViewById(R.id.sg_button);
        SG_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent13 = new Intent(RecMap.this, GangnamCourseList.class);
                startActivity(intent13);
            }
        });

        KS_button = findViewById(R.id.kss_button);
        KS_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent14 = new Intent(RecMap.this, SongpaCourseList.class);
                startActivity(intent14);
            }
        });

        KY_button = findViewById(R.id.ky_button);
        KY_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent15 = new Intent(RecMap.this, KangsuYangchunCourseList.class);
                startActivity(intent15);
            }
        });


    }
}
