package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListActivity.this, adapterView.getItemAtPosition(i)+"클릭",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(ListActivity.this,DetailActivity.class);
                intent.putExtra("board_seq",seqList.get(i));
                intent.putExtra("userid",userid);
                startActivity(intent);
            }
        });

        reg_button = findViewById(R.id.reg_button);

        reg_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(ListActivity.this,RegisterActivity.class);
                intent.putExtra("userid",userid);
                startActivity(intent);
            }
        });
    }
}