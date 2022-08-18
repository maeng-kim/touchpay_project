package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class JSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jsactivity);
    }

    public void devideClick(View v) {
        EditText number1=(EditText) findViewById(R.id.number1);
        EditText number2=(EditText) findViewById(R.id.number2);
        TextView result=(TextView) findViewById(R.id.result);
        int n1=Integer.parseInt(number1.getText().toString());
        int n2=Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1/n2));
    }
}