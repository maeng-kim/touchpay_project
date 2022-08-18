package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class _4_T_sUIActivity extends AppCompatActivity {
    TextView Sinseoldong,Bomun,SungshinWomensUniversity,Jeongneung,BukhansanBogungmun,Solsaem ;
    TextView SamyangSageori,Samyang,Hwagye,Gaori,April19thNationalCemetery,SolbatPark,BukhansanUi ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_uiactivity);

        Sinseoldong = findViewById(R.id.Sinseoldong);
        Bomun = findViewById(R.id.Bomun);
        SungshinWomensUniversity = findViewById(R.id.SungshinWomensUniversity);
        Jeongneung = findViewById(R.id.Jeongneung);
        BukhansanBogungmun = findViewById(R.id.BukhansanBogungmun);
        Solsaem = findViewById(R.id.Solsaem);

        SamyangSageori = findViewById(R.id.SamyangSageori);
        Samyang = findViewById(R.id.Samyang);
        Hwagye = findViewById(R.id.Hwagye);
        Gaori = findViewById(R.id.Gaori);
        April19thNationalCemetery = findViewById(R.id.April19thNationalCemetery);
        SolbatPark = findViewById(R.id.SolbatPark);
        BukhansanUi = findViewById(R.id.BukhansanUi);
    }
}