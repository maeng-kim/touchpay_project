package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class _4_T_sSBActivity extends AppCompatActivity {
    TextView Sinsa,Nonhyeon,Sinnonhyeon,Gangnam,Yangjae,YangjaeCitizensForest,Cheonggyesan,Pangyo,Jeongja ;
    TextView Migeum,Dongcheon,SujiguOffice,Seongbok,Sanghyeon,GwanggyoJungang,Gwanggyo ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts_sbactivity);

        Sinsa = findViewById(R.id.Sinsa);
        Nonhyeon = findViewById(R.id.Nonhyeon);
        Sinnonhyeon = findViewById(R.id.Sinnonhyeon);
        Gangnam = findViewById(R.id.Gangnam);
        Yangjae = findViewById(R.id.Yangjae);
        YangjaeCitizensForest = findViewById(R.id.YangjaeCitizensForest);
        Cheonggyesan = findViewById(R.id.Cheonggyesan);
        Pangyo = findViewById(R.id.Pangyo);
        Jeongja = findViewById(R.id.Jeongja);

        Migeum = findViewById(R.id.Migeum);
        Dongcheon = findViewById(R.id.Dongcheon);
        SujiguOffice = findViewById(R.id.SujiguOffice);
        Sanghyeon = findViewById(R.id.Sanghyeon);
        GwanggyoJungang = findViewById(R.id.GwanggyoJungang);
        Gwanggyo = findViewById(R.id.Gwanggyo);
        Seongbok = findViewById(R.id.Seongbok);
    }
}