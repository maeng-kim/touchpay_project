package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class _4_T_sI2Activity extends AppCompatActivity {

    TextView GeomdanOryu,Wanggil,GeomdanSageori,Majeon,Wanjeong,Dokjeong,Geomam,Geombawi,AsiadStadium;
    TextView SeoguOffice,Gajeong,GajeongJungangMarket,Seongnam,WestWomansCommunityCenter,IncheonGajwa;
    TextView Gajaeul,JuanNationalIndustrialComplex,Juan,CitizensPark,SeokbawiMarket,IncheonCityHall,SeokcheonSageori;
    TextView MoraenaeMarket,Mansu,NamdongguOffice,IncheonGrandPark,Unyeon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_i2);

        WestWomansCommunityCenter = findViewById(R.id.WestWomansCommunityCenter);
        IncheonGajwa = findViewById(R.id.IncheonGajwa);
        Gajaeul = findViewById(R.id.Gajaeul);
        JuanNationalIndustrialComplex = findViewById(R.id.JuanNationalIndustrialComplex);
        CitizensPark = findViewById(R.id.CitizensPark);
        Juan = findViewById(R.id.Juan);
        SeokbawiMarket = findViewById(R.id.SeokbawiMarket);
        IncheonCityHall = findViewById(R.id.IncheonCityHall);
        SeokcheonSageori = findViewById(R.id.SeokcheonSageori);
        MoraenaeMarket = findViewById(R.id.MoraenaeMarket);
        NamdongguOffice = findViewById(R.id.NamdongguOffice);
        Mansu = findViewById(R.id.Mansu);
        IncheonGrandPark = findViewById(R.id.IncheonGrandPark);
        Unyeon = findViewById(R.id.Unyeon);

        GeomdanOryu = findViewById(R.id.GeomdanOryu);
        Wanggil = findViewById(R.id.Wanggil);
        GeomdanSageori = findViewById(R.id.GeomdanSageori);
        Majeon = findViewById(R.id.Majeon);
        Wanjeong = findViewById(R.id.Wanjeong);
        Dokjeong = findViewById(R.id.Dokjeong);
        Geomam = findViewById(R.id.Geomam);
        Geombawi = findViewById(R.id.Geombawi);
        AsiadStadium = findViewById(R.id.AsiadStadium);
        SeoguOffice = findViewById(R.id.SeoguOffice);
        Gajeong = findViewById(R.id.Gajeong);
        GajeongJungangMarket = findViewById(R.id.GajeongJungangMarket);
        Seongnam = findViewById(R.id.Seongnam);
    }
}