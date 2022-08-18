package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class _3_D_placeSelectActivity extends AppCompatActivity {

    private Button place1,place2,place3,place4,place5,place6,place7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3_dplace_select);

        place1 = findViewById(R.id.place1);
        place2 = findViewById(R.id.place2);
        place3 = findViewById(R.id.place3);
        place4 = findViewById(R.id.place4);
        place5 = findViewById(R.id.place5);
        place6 = findViewById(R.id.place6);
        place7 = findViewById(R.id.place7);
    }

    public void onClick(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()){
            case R.id.place1:
                intent.setData(Uri.parse("https://padlet.com/sohyeonj415/sswuTouchPayD/wish/2262995623"));
                startActivity(intent);
                break;
            case R.id.place2:
                intent.setData(Uri.parse("https://padlet.com/sohyeonj415/sswuTouchPayD/wish/2262995753"));
                startActivity(intent);
                break;
            case R.id.place3:
                intent.setData(Uri.parse("https://padlet.com/sohyeonj415/sswuTouchPayD/wish/2262995821"));
                startActivity(intent);
                break;
            case R.id.place4:
                intent.setData(Uri.parse("https://padlet.com/sohyeonj415/sswuTouchPayD/wish/2262995932"));
                startActivity(intent);
                break;
            case R.id.place5:
                intent.setData(Uri.parse("https://padlet.com/sohyeonj415/sswuTouchPayD/wish/2262996001"));
                startActivity(intent);
                break;
            case R.id.place6:
                intent.setData(Uri.parse("https://padlet.com/sohyeonj415/sswuTouchPayD/wish/2262996485"));
                startActivity(intent);
                break;
            case R.id.place7:
                intent.setData(Uri.parse("https://padlet.com/sohyeonj415/sswuTouchPayD/wish/2262996641"));
                startActivity(intent);
                break;
        }
    }
}