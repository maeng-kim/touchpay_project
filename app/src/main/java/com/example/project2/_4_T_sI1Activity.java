package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class _4_T_sI1Activity extends AppCompatActivity {
    TextView Gyeyang,Gyulhyeon,Bakchon,Imhak,Gyesan,GyeonginNatlUnivofEducation,Jakjeon,Galsan,BupyeongguOffice;
    TextView BupyeongMarket,Bupyeong,Dongsu,Bupyeongsamgeori,Ganseogogeori,IncheonCityHall,CultureArtsCenter;
    TextView IncheonBusTerminal,MunhakSportsComplex,Seonhak,Sinyeonsu,Woninjae,Dongchun,Dongmak,CampusTown;
    TextView Technopark,BITZone,IncheonNatlUniv,CentralPark,IntlBusinessDistrict,SongdoMoonlightFestivalPark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_i1);

        IncheonNatlUniv = findViewById(R.id.IncheonNatlUniv);
        CentralPark = findViewById(R.id.CentralPark);
        IntlBusinessDistrict = findViewById(R.id.IntlBusinessDistrict);
        SongdoMoonlightFestivalPark = findViewById(R.id.SongdoMoonlightFestivalPark);

        Ganseogogeori = findViewById(R.id.Ganseogogeori);
        IncheonCityHall = findViewById(R.id.IncheonCityHall);
        CultureArtsCenter = findViewById(R.id.CultureArtsCenter);
        IncheonBusTerminal = findViewById(R.id.IncheonBusTerminal);
        MunhakSportsComplex = findViewById(R.id.MunhakSportsComplex);
        Seonhak = findViewById(R.id.Seonhak);
        Sinyeonsu = findViewById(R.id.Sinyeonsu);
        Woninjae = findViewById(R.id.Woninjae);
        Dongchun = findViewById(R.id.Dongchun);
        Dongmak = findViewById(R.id.Dongmak);
        CampusTown = findViewById(R.id.CampusTown);
        Technopark = findViewById(R.id.Technopark);
        BITZone = findViewById(R.id.BITZone);

        Gyeyang = findViewById(R.id.Gyeyang);
        Gyulhyeon = findViewById(R.id.Gyulhyeon);
        Bakchon = findViewById(R.id.Bakchon);
        Imhak = findViewById(R.id.Imhak);
        Gyesan = findViewById(R.id.Gyesan);
        GyeonginNatlUnivofEducation = findViewById(R.id.GyeonginNatlUnivofEducation);
        Jakjeon = findViewById(R.id.Jakjeon);
        Galsan = findViewById(R.id.Galsan);
        BupyeongguOffice = findViewById(R.id.BupyeongguOffice);
        BupyeongMarket = findViewById(R.id.BupyeongMarket);
        Bupyeong = findViewById(R.id.Bupyeong);
        Dongsu = findViewById(R.id.Dongsu);
        Bupyeongsamgeori = findViewById(R.id.Bupyeongsamgeori);
    }
}