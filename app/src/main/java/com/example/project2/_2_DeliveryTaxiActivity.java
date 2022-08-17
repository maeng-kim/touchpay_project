package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class _2_DeliveryTaxiActivity extends AppCompatActivity {
    Button deliveryButton, taxiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_delivery_taxi);

        deliveryButton = findViewById(R.id.deliveryButton);
        taxiButton = findViewById(R.id.taxiButton);

        deliveryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _3_D_placeSelectActivity.class);
                startActivity(intent);
            }
        });
        taxiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_T_SchoolSelectActivity.class);
                startActivity(intent);
            }
        });



    }
}