package com.example.project2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class JoinActivity extends AppCompatActivity {

    LinearLayout baseLayout;
    Button bt_address;
    Button bt_gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        baseLayout = findViewById(R.id.baseLayout);

        bt_address = findViewById(R.id.bt_address);
        registerForContextMenu(bt_address);

        bt_gender = findViewById(R.id.bt_gender);
        registerForContextMenu(bt_gender);
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);

        MenuInflater menuInflater = getMenuInflater();

        if (v == bt_address) {
            menuInflater.inflate(R.menu.menu_address, menu);
        }
        if (v == bt_gender) {
            menuInflater.inflate(R.menu.menu_gender, menu);
        }
    }

    public boolean onContextitemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.place1:
                return true;
            case R.id.place2:
                return true;
            case R.id.place3:
                return true;
            case R.id.place4:
                return true;
            case R.id.place5:
                return true;
            case R.id.place6:
                return true;
            case R.id.place7:
                return true;
        }
        return false;
    }

}