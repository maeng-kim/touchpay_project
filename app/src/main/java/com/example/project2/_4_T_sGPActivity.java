package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class _4_T_sGPActivity extends AppCompatActivity {
    TextView Yangchon, Gurae, Masan, Janggi, Unyang, GeolpoBukbyeon, Sau, Pungmu, Gochon, GimpoIntlAirport ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_gpactivity);

        Yangchon = findViewById(R.id.Yangchon);
        Gurae = findViewById(R.id.Gurae);
        Masan = findViewById(R.id.Masan);
        Janggi = findViewById(R.id.Janggi);
        Unyang = findViewById(R.id.Unyang);
        GeolpoBukbyeon = findViewById(R.id.GeolpoBukbyeon);
        Sau = findViewById(R.id.Sau);
        Pungmu = findViewById(R.id.Pungmu);
        Gochon = findViewById(R.id.Gochon);
        GimpoIntlAirport = findViewById(R.id.GimpoIntlAirport);
    }
}