package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class _4_T_s6Activity extends AppCompatActivity {
    TextView Yeokchon	,Bulgwang,Dokbawi	,Yeonsinnae,Gusan,Eungam,Saejeol,Jeungsan,DigitalMediaCity,WorldCupStadium;
    TextView MapoguOffice,Mangwon,Hapjeong,Sangsu,Gwangheungchang,Daeheung,Gongdeok,HyochangPark,Samgakji,Noksapyeong;
    TextView Itaewon,Hangangjin,Beotigogae,Yaksu,Cheonggu,Sindang,Dongmyo,Changsin,Bomun,Anam,KoreaUniv,Wolgok,Sangwolgok;
    TextView Dolgoji,Seokgye,Taereung,Hwarangdae,Bonghwasan,Sinnae;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts6);

        Dolgoji = findViewById(R.id.Dolgoji);
        Seokgye = findViewById(R.id.Seokgye);
        Taereung = findViewById(R.id.Taereung);
        Hwarangdae = findViewById(R.id.Hwarangdae);
        Bonghwasan = findViewById(R.id.Bonghwasan);
        Sinnae = findViewById(R.id.Sinnae);

        Itaewon = findViewById(R.id.Itaewon);
        Hangangjin = findViewById(R.id.Hangangjin);
        Beotigogae = findViewById(R.id.Beotigogae);
        Yaksu = findViewById(R.id.Yaksu);
        Cheonggu = findViewById(R.id.Cheonggu);
        Sindang = findViewById(R.id.Sindang);
        Dongmyo = findViewById(R.id.Dongmyo);
        Changsin = findViewById(R.id.Changsin);
        Bomun = findViewById(R.id.Bomun);
        Anam = findViewById(R.id.Anam);
        KoreaUniv = findViewById(R.id.KoreaUniv);
        Wolgok = findViewById(R.id.Wolgok);
        Sangwolgok = findViewById(R.id.Sangwolgok);

        MapoguOffice = findViewById(R.id.MapoguOffice);
        Mangwon = findViewById(R.id.Mangwon);
        Hapjeong = findViewById(R.id.Hapjeong);
        Sangsu = findViewById(R.id.Sangsu);
        Gwangheungchang = findViewById(R.id.Gwangheungchang);
        Daeheung = findViewById(R.id.Daeheung);
        Gongdeok = findViewById(R.id.Gongdeok);
        HyochangPark = findViewById(R.id.HyochangPark);
        Samgakji = findViewById(R.id.Samgakji);
        Noksapyeong = findViewById(R.id.Noksapyeong);

        Yeokchon = findViewById(R.id.Yeokchon);
        Bulgwang = findViewById(R.id.Bulgwang);
        Dokbawi = findViewById(R.id.Dokbawi);
        Yeonsinnae = findViewById(R.id.Yeonsinnae);
        Gusan = findViewById(R.id.Gusan);
        Eungam = findViewById(R.id.Eungam);
        Saejeol = findViewById(R.id.Saejeol);
        Jeungsan = findViewById(R.id.Jeungsan);
        DigitalMediaCity = findViewById(R.id.DigitalMediaCity);
        WorldCupStadium = findViewById(R.id.WorldCupStadium);
    }
}