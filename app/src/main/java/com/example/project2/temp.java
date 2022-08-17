package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class temp extends AppCompatActivity {

    private EditText et_name,et_phonenum;
    private Spinner sp_address,sp_gender;
    private Button bt_next;
    private String str_address="",str_gender="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        // 아이디 값 찾아주기기
        et_name = findViewById(R.id.et_name);
        et_phonenum = findViewById(R.id.et_phonenum);
        sp_address = (Spinner)findViewById(R.id.sp_address);
        sp_gender = (Spinner)findViewById(R.id.sp_gender);

        // next버튼을 클릭했을 때 실행
        bt_next = findViewById(R.id.bt_next);
        bt_next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // EditText와 Spinner에 입력된 값을 get 해옴
                String userName = et_name.getText().toString();
                int userNum = Integer.parseInt(et_phonenum.getText().toString());
                String userAddress = sp_address.getSelectedItem().toString();
                String userGender = sp_gender.getSelectedItem().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            boolean success = jsonObject.getBoolean("success");
                            if(success){
                                Toast.makeText(getApplicationContext(),"회원가입 완료",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(temp.this,ListActivity.class);
                                startActivity(intent);
                            } else{
                                Toast.makeText(getApplicationContext(),"회원가입 실패",Toast.LENGTH_SHORT).show();
                                return;
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                // 서버 Volley를 이용해서 요청을 함
                TempRequste tempRequste = new TempRequste(userName,userNum,userAddress,userGender,responseListener);
                RequestQueue queue = Volley.newRequestQueue(temp.this);
                queue.add(tempRequste);

            }
        });

        sp_address.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sp_gender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}