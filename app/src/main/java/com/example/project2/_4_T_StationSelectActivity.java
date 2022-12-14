package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class _4_T_StationSelectActivity extends AppCompatActivity {
    Button s_1, s_2, s_3, s_4, s_5, s_6, s_7, s_8, s_9, s_I1, s_I2, s_SB, s_GU, s_GC, s_SI, s_GH, s_SR, s_UJ, s_EV, s_GG, s_UI, s_SH, s_GP ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_tstation_select);



            s_1 = findViewById(R.id.s_1);
            s_2 = findViewById(R.id.s_2);
            s_3 = findViewById(R.id.s_3);
            s_4 = findViewById(R.id.s_4);
            s_5 = findViewById(R.id.s_5);
            s_6 = findViewById(R.id.s_6);
            s_7 = findViewById(R.id.s_7);
            s_8 = findViewById(R.id.s_8);
            s_9 = findViewById(R.id.s_9);
            s_I1 = findViewById(R.id.s_I1);
            s_I2 = findViewById(R.id.s_I2);
            s_SB = findViewById(R.id.s_SB);
            s_GU = findViewById(R.id.s_GU);
            s_GC = findViewById(R.id.s_GC);
            s_SI = findViewById(R.id.s_SI);
            s_GH = findViewById(R.id.s_GH);
            s_SR = findViewById(R.id.s_SR);
            s_UJ = findViewById(R.id.s_UJ);
            s_EV = findViewById(R.id.s_EV);
            s_GG = findViewById(R.id.s_GG);
            s_UI = findViewById(R.id.s_UI);
            s_SH = findViewById(R.id.s_SH);
            s_GP = findViewById(R.id.s_GP);

            s_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_s1Activity.class);
                    startActivity(intent);
                }
            });



            s_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_s2Activity.class);
                    startActivity(intent);
                }
            });

            s_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_s3Activity.class);
                    startActivity(intent);
                }
            });

            s_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_s4Activity.class);
                    startActivity(intent);
                }
            });

            s_5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_s5Activity.class);
                    startActivity(intent);
                }
            });

            s_6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_s6Activity.class);
                    startActivity(intent);
                }
            });

            s_7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_s7Activity.class);
                    startActivity(intent);
                }
            });

            s_8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_s8Activity.class);
                    startActivity(intent);
                }
            });

            s_9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_s9Activity.class);
                    startActivity(intent);
                }
            });

            s_I1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_sI1Activity.class);
                    startActivity(intent);
                }
            });

            s_I2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_sI2Activity.class);
                    startActivity(intent);
                }
            });

            s_SB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_sSBActivity.class);
                    startActivity(intent);
                }
            });

            s_GU.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_sGUActivity.class);
                    startActivity(intent);
                }
            });

            s_GC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_sGCActivity.class);
                    startActivity(intent);
                }
            });

            s_SI.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_sSIActivity.class);
                    startActivity(intent);
                }
            });

            s_GH.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_sGHActivity.class);
                    startActivity(intent);
                }
            });

            s_SR.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_sSRActivity.class);
                    startActivity(intent);
                }
            });

            s_UJ.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_sUJActivity.class);
                    startActivity(intent);
                }
            });

            s_EV.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_sEVActivity.class);
                    startActivity(intent);
                }
            });

            s_GG.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_sGGActivity.class);
                    startActivity(intent);
                }
            });

            s_UI.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_sUIActivity.class);
                    startActivity(intent);
                }
            });

            s_SH.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_sSHActivity.class);
                    startActivity(intent);
                }
            });

            s_GP.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), _4_T_sGPActivity.class);
                    startActivity(intent);
                }
            });








    }
}