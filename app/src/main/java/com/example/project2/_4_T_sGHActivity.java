package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class _4_T_sGHActivity extends AppCompatActivity {

    TextView SeoulStation, Gongdeok, HongikUniv, DigitalMediaCity, Magongnaru, GimpoIntlAirport, Gyeyang, Geomam, CheongnaIntlCity,Yeongjong, Unseo, IncheonIntlAirportCargoTerminal, IncheonIntlAirportTerminal1, IncheonIntlAirportTerminal2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_ghactivity);

        SeoulStation = findViewById(R.id.SeoulStation);
        Gongdeok = findViewById(R.id.Gongdeok);
        HongikUniv = findViewById(R.id.HongikUniv);
        DigitalMediaCity = findViewById(R.id.DigitalMediaCity);
        Magongnaru = findViewById(R.id.Magongnaru);
        GimpoIntlAirport = findViewById(R.id.GimpoIntlAirport);
        Gyeyang = findViewById(R.id.Gyeyang);
        Geomam = findViewById(R.id.Geomam);
        CheongnaIntlCity = findViewById(R.id.CheongnaIntlCity);
        Yeongjong = findViewById(R.id.Yeongjong);
        Unseo = findViewById(R.id.Unseo);
        IncheonIntlAirportCargoTerminal = findViewById(R.id.IncheonIntlAirportCargoTerminal);
        IncheonIntlAirportTerminal1 = findViewById(R.id.IncheonIntlAirportTerminal1);
        IncheonIntlAirportTerminal2 = findViewById(R.id.IncheonIntlAirportTerminal2);
    }
}