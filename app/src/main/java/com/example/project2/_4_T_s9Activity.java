package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class _4_T_s9Activity extends AppCompatActivity {

    TextView Gaehwa,GimpoIntlAirport,AirportMarket,Sinbanghwa,Magongnaru,YangcheonHyanggyo,Gayang,Jeungmi;
    TextView Deungchon,Yeomchang,Sinmokdong,Seonyudo,Dangsan,NationalAssembly,Yeouido,Saetgang,Noryangjin,Nodeul,Heukseok;
    TextView Dongjak,Gubanpo,Sinbanpo,ExpressBusTerminal,Sapyeong,Sinnonhyeon,Eonju,Seonjeongneung,SamseongJungang;
    TextView Bongeunsa,SportsComplex,Samjeon,SeokchonGobun,Seokchon,Songpanaru,HanseongBaekje,OlympicPark,DunchonOryun,VHSMedicalCenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts9);

        Seonjeongneung = findViewById(R.id.Seonjeongneung);
        SamseongJungang = findViewById(R.id.SamseongJungang);
        Bongeunsa = findViewById(R.id.Bongeunsa);
        SportsComplex = findViewById(R.id.SportsComplex);
        Samjeon = findViewById(R.id.Samjeon);
        SeokchonGobun = findViewById(R.id.SeokchonGobun);
        Seokchon = findViewById(R.id.Seokchon);
        Songpanaru = findViewById(R.id.Songpanaru);
        HanseongBaekje = findViewById(R.id.HanseongBaekje);
        OlympicPark = findViewById(R.id.OlympicPark);
        DunchonOryun = findViewById(R.id.DunchonOryun);
        VHSMedicalCenter = findViewById(R.id.VHSMedicalCenter);

        NationalAssembly = findViewById(R.id.NationalAssembly);
        Yeouido = findViewById(R.id.Yeouido);
        Saetgang = findViewById(R.id.Saetgang);
        Noryangjin = findViewById(R.id.Noryangjin);
        Nodeul = findViewById(R.id.Nodeul);
        Heukseok = findViewById(R.id.Heukseok);
        Dongjak = findViewById(R.id.Dongjak);
        Gubanpo = findViewById(R.id.Gubanpo);
        Sinbanpo = findViewById(R.id.Sinbanpo);
        ExpressBusTerminal = findViewById(R.id.ExpressBusTerminal);
        Sapyeong = findViewById(R.id.Sapyeong);
        Sinnonhyeon = findViewById(R.id.Sinnonhyeon);
        Eonju = findViewById(R.id.Eonju);

        Gaehwa = findViewById(R.id.Gaehwa);
        GimpoIntlAirport = findViewById(R.id.GimpoIntlAirport);
        AirportMarket = findViewById(R.id.AirportMarket);
        Sinbanghwa = findViewById(R.id.Sinbanghwa);
        Magongnaru = findViewById(R.id.Magongnaru);
        YangcheonHyanggyo = findViewById(R.id.YangcheonHyanggyo);
        Gayang = findViewById(R.id.Gayang);
        Jeungmi = findViewById(R.id.Jeungmi);
        Deungchon = findViewById(R.id.Deungchon);
        Yeomchang = findViewById(R.id.Yeomchang);
        Sinmokdong = findViewById(R.id.Sinmokdong);
        Seonyudo = findViewById(R.id.Seonyudo);
        Dangsan = findViewById(R.id.Dangsan);
    }
}