package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class _4_T_sUJActivity extends AppCompatActivity {

    TextView Balgok,Hoeryong,Beomgol,LRTUijeongbu,UijeongbuCityHall,Heungseon,UijeongbuJungang,Dongo,Saemal;
    TextView GyeonggiProvincialGovernmentNorthernOffice,Hyoja,Gonjae,Eoryong,Songsan,Tapseok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_ujactivity);

        Balgok = findViewById(R.id.Balgok);
        Hoeryong = findViewById(R.id.Hoeryong);
        Beomgol = findViewById(R.id.Beomgol);
        LRTUijeongbu = findViewById(R.id.LRTUijeongbu);
        UijeongbuCityHall = findViewById(R.id.UijeongbuCityHall);
        Heungseon = findViewById(R.id.Heungseon);
        UijeongbuJungang = findViewById(R.id.UijeongbuJungang);
        Dongo = findViewById(R.id.Dongo);
        Saemal = findViewById(R.id.Saemal);
        GyeonggiProvincialGovernmentNorthernOffice = findViewById(R.id.GyeonggiProvincialGovernmentNorthernOffice);
        Hyoja = findViewById(R.id.Hyoja);
        Gonjae = findViewById(R.id.Gonjae);
        Eoryong = findViewById(R.id.Eoryong);
        Songsan = findViewById(R.id.Songsan);
        Tapseok = findViewById(R.id.Tapseok);
    }
}