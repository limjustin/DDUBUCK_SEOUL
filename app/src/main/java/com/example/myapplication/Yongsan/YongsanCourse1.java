package com.example.myapplication.Yongsan;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class YongsanCourse1 extends AppCompatActivity implements OnMapReadyCallback{

    GoogleMap map;
    MarkerOptions place1, place2, place3;

    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yongsan_course1);
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.mapFrag);
        mapFragment.getMapAsync(this);

        place1 = new MarkerOptions().position(new LatLng(37.524114, 126.980513)).title("국립중앙박물관").snippet("역사박물관");
        place2 = new MarkerOptions().position(new LatLng(37.532766, 126.963702)).title("기와").snippet("식당");
        place3 = new MarkerOptions().position(new LatLng(37.536861, 126.977226)).title("전쟁기념관").snippet("기념관, 역사박물관");


        final ToggleButton tb2 = (ToggleButton) this.findViewById(R.id.toggleButton2);

            tb2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(tb2.isChecked()){
                    tb2.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.full_heart_button)
                    );
                }else{
                    tb2.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.empty_heart_button)
                    );
                } // end if
            } // end onClick()
        });

            myDialog = new Dialog(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        map.addMarker(place1);
        map.addMarker(place2);
        map.addMarker(place3);

        LatLng zoom = new LatLng(37.533121, 126.972616); // 줌인 할 수 있는 장소 만들기
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(zoom,14)); // v값은 배율을 의미 (값이 작을수록 zoom out / 값이 클수록 zoom in)
    }

    public void ShowPopup(View view) {
        TextView X_button;
        myDialog.setContentView(R.layout.activity_yongsancourse1_popup_window);
        X_button = (TextView)myDialog.findViewById(R.id.x_button);
        X_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }

} // end onCreate()
