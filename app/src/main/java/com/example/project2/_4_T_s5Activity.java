package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class _4_T_s5Activity extends AppCompatActivity {

    TextView Banghwa,Gaehwasan,GimpoIntlAirport,Songjeong,Magok,Balsan,Ujangsan,Hwagok,Kkachisan,Sinjeong,Mokdong,Omokgyo,Yangpyeong,YeongdeungpoguOffice,YeongdeungpoMarket ;
    TextView Singil, Yeouido,Yeouinaru,Mapo,Gongdeok,Aeogae,Chungjeongno,Seodaemun,Gwanghwamun,Jongno3ga,Euljiro4ga,DDP,Cheonggu,Singeumho,Haengdang,Wangsimni ;
    TextView Majang,Dapsimni, Janghanpyeong,Gunja,Achasan,Gwangnaru,Cheonho,Gangdong,Gildong,Gubeundari,Myeongil,Godeok,Sangildong,Gangil,Misa,HanamPungsan ;
    TextView HanamCityHall,HanamGeomdansan,Dunchondong,OlympicPark,Bangi,Ogeum,Gaerong,Geoyeo,Macheon ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts5);

        HanamCityHall = findViewById(R.id.HanamCityHall);
        HanamGeomdansan = findViewById(R.id.HanamGeomdansan);
        Dunchondong = findViewById(R.id.Dunchondong);
        OlympicPark = findViewById(R.id.OlympicPark);
        Bangi = findViewById(R.id.Bangi);
        Ogeum = findViewById(R.id.Ogeum);
        Gaerong = findViewById(R.id.Gaerong);
        Geoyeo = findViewById(R.id.Geoyeo);
        Macheon = findViewById(R.id.Macheon);

        Majang = findViewById(R.id.Majang);
        Dapsimni = findViewById(R.id.Dapsimni);
        Janghanpyeong = findViewById(R.id.Janghanpyeong);
        Gunja = findViewById(R.id.Gunja);
        Achasan = findViewById(R.id.Achasan);
        Gwangnaru = findViewById(R.id.Gwangnaru);
        Cheonho = findViewById(R.id.Cheonho);
        Gangdong = findViewById(R.id.Gangdong);
        Gildong = findViewById(R.id.Gildong);
        Gubeundari = findViewById(R.id.Gubeundari);
        Myeongil = findViewById(R.id.Myeongil);
        Godeok = findViewById(R.id.Godeok);
        Sangildong = findViewById(R.id.Sangildong);
        Gangil = findViewById(R.id.Gangil);
        Misa = findViewById(R.id.Misa);
        HanamPungsan = findViewById(R.id.HanamPungsan);

        Singil = findViewById(R.id.Singil);
        Yeouido = findViewById(R.id.Yeouido);
        Yeouinaru = findViewById(R.id.Yeouinaru);
        Mapo = findViewById(R.id.Mapo);
        Gongdeok = findViewById(R.id.Gongdeok);
        Aeogae = findViewById(R.id.Aeogae);
        Chungjeongno = findViewById(R.id.Chungjeongno);
        Seodaemun = findViewById(R.id.Seodaemun);
        Gwanghwamun = findViewById(R.id.Gwanghwamun);
        Jongno3ga = findViewById(R.id.Jongno3ga);
        Euljiro4ga = findViewById(R.id.Euljiro4ga);
        DDP = findViewById(R.id.DDP);
        Cheonggu = findViewById(R.id.Cheonggu);
        Singeumho = findViewById(R.id.Singeumho);
        Haengdang = findViewById(R.id.Haengdang);
        Wangsimni = findViewById(R.id.Wangsimni);

        Banghwa = findViewById(R.id.Banghwa);
        Gaehwasan = findViewById(R.id.Gaehwasan);
        GimpoIntlAirport = findViewById(R.id.GimpoIntlAirport);
        Songjeong = findViewById(R.id.Songjeong);
        Magok = findViewById(R.id.Magok);
        Balsan = findViewById(R.id.Balsan);
        Ujangsan = findViewById(R.id.Ujangsan);
        Hwagok = findViewById(R.id.Hwagok);
        Kkachisan = findViewById(R.id.Kkachisan);
        Sinjeong = findViewById(R.id.Sinjeong);
        Mokdong = findViewById(R.id.Mokdong);
        Omokgyo = findViewById(R.id.Omokgyo);
        Yangpyeong = findViewById(R.id.Yangpyeong);
        YeongdeungpoguOffice = findViewById(R.id.YeongdeungpoguOffice);
        YeongdeungpoMarket = findViewById(R.id.YeongdeungpoMarket);
    }
}