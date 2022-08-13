package com.example.project2;

import androidx.annotation.Nullable;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class TempRequste extends StringRequest {

    // 서버 URL 설정 (PHP 파일 연동)
    final static private String URL = "http://soccer0954.dothome.co.kr/Register.php";
    private Map<String, String>map;

    public TempRequste(String userName, int userNum, String userAddress, String userGender, Response.Listener<String> listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("userName",userName);
        map.put("userNum",userNum + "");
        map.put("userAddress",userAddress);
        map.put("userGender",userGender);
    }

    @Nullable
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
