package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class _4_T_sEVActivity extends AppCompatActivity {
    TextView Giheung, KangnamUniv, Jiseok, Eojeong, Dongbaek, Chodang, Samga, CityHallYonginUniv, MyongjiUniv, Gimnyangjang, StadiumSongdamCollege, Gojin, Bopyeong, Dunjeon, JeondaeEverland ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_evactivity);

        Giheung = findViewById(R.id.Giheung);
        KangnamUniv = findViewById(R.id.KangnamUniv);
        Jiseok = findViewById(R.id.Jiseok);
        Eojeong = findViewById(R.id.Eojeong);
        Dongbaek = findViewById(R.id.Dongbaek);
        Chodang = findViewById(R.id.Chodang);
        Samga = findViewById(R.id.Samga);
        CityHallYonginUniv = findViewById(R.id.CityHallYonginUniv);
        MyongjiUniv = findViewById(R.id.MyongjiUniv);
        Gimnyangjang = findViewById(R.id.Gimnyangjang);
        StadiumSongdamCollege = findViewById(R.id.StadiumSongdamCollege);
        Gojin = findViewById(R.id.Gojin);
        Bopyeong = findViewById(R.id.Bopyeong);
        Dunjeon = findViewById(R.id.Dunjeon);
        JeondaeEverland = findViewById(R.id.JeondaeEverland);
    }
}