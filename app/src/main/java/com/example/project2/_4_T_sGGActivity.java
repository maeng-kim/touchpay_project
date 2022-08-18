package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class _4_T_sGGActivity extends AppCompatActivity {
    TextView Pangyo, Imae, Samdong, GyeonggiGwangju, Chowol, Gonjiam, Sindundoyechon, Icheon, Bubal, Sejongdaewangneung, Yeoju ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_ggactivity);

        Pangyo = findViewById(R.id.Pangyo);
        Imae = findViewById(R.id.Imae);
        Samdong = findViewById(R.id.Samdong);
        GyeonggiGwangju = findViewById(R.id.GyeonggiGwangju);
        Chowol = findViewById(R.id.Chowol);
        Gonjiam = findViewById(R.id.Gonjiam);
        Sindundoyechon = findViewById(R.id.Sindundoyechon);
        Pangyo = findViewById(R.id.Pangyo);
        Icheon = findViewById(R.id.Icheon);
        Bubal = findViewById(R.id.Bubal);
        Sejongdaewangneung = findViewById(R.id.Sejongdaewangneung);
        Yeoju = findViewById(R.id.Yeoju);
    }
}