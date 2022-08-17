package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class _4_T_s8Activity extends AppCompatActivity {
    TextView Amsa,Cheonho,GangdongguOffice,Mongchontoseong,Jamsil,Seokchon,Songpa,GarakMarket,Munjeong,Jangji;
    TextView Bokjeong,Namwirye,Sanseong,Namhansanseong,Dandaeogeori,Sinheung,Sujin,Moran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts8);

        Amsa = findViewById(R.id.Amsa);
        Cheonho = findViewById(R.id.Cheonho);
        GangdongguOffice = findViewById(R.id.GangdongguOffice);
        Mongchontoseong = findViewById(R.id.Mongchontoseong);
        Jamsil = findViewById(R.id.Jamsil);
        Seokchon = findViewById(R.id.Seokchon);
        Songpa = findViewById(R.id.Songpa);
        GarakMarket = findViewById(R.id.GarakMarket);
        Munjeong = findViewById(R.id.Munjeong);
        Jangji = findViewById(R.id.Jangji);
        Bokjeong = findViewById(R.id.Bokjeong);
        Namwirye = findViewById(R.id.Namwirye);
        Sanseong = findViewById(R.id.Sanseong);
        Namhansanseong = findViewById(R.id.Namhansanseong);
        Dandaeogeori = findViewById(R.id.Dandaeogeori);
        Sinheung = findViewById(R.id.Sinheung);
        Sujin = findViewById(R.id.Sujin);
        Moran = findViewById(R.id.Moran);

    }
}