package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    final private String TAG = getClass().getSimpleName();

    ListView listView;
    Button reg_button;
    String userid = "";

    ArrayList<String> titleList = new ArrayList<>();

    ArrayList<String> seqList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        userid = getIntent().getStringExtra("userid");

        listView = findViewById(R.id.listView);
    }
}