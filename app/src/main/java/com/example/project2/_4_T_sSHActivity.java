package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class _4_T_sSHActivity extends AppCompatActivity {

    TextView Sosa,Sosaeul,SiheungDaeya,Sincheon,Sinhyeon,SiheungCityHall,SiheungNeunggok,Dalmi,Seonbu,Choji,Siu,Wonsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_shactivity);

        Sosa = findViewById(R.id.Sosa);
        Sosaeul = findViewById(R.id.Sosaeul);
        SiheungDaeya = findViewById(R.id.SiheungDaeya);
        Sincheon = findViewById(R.id.Sincheon);
        Sinhyeon = findViewById(R.id.Sinhyeon);
        SiheungCityHall = findViewById(R.id.SiheungCityHall);
        SiheungNeunggok = findViewById(R.id.SiheungNeunggok);
        Dalmi = findViewById(R.id.Dalmi);
        Seonbu = findViewById(R.id.Seonbu);
        Choji = findViewById(R.id.Choji);
        Siu = findViewById(R.id.Siu);
        Wonsi = findViewById(R.id.Wonsi);
    }
}