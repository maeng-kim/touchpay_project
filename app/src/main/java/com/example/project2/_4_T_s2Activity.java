package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class _4_T_s2Activity extends AppCompatActivity {

    TextView Kkachisan,Sinjeongnegeori,YangcheonguOffice,Dorimcheon,Sindorim,Mullae,YeongdeungpoguOffice,Dangsan,Hapjeong,HongikUniv,Sinchon,EwhaWomansUniv;
    TextView Ahyeon,Chungjeongno,CityHall,Euljiro1ga,Euljiro3ga,Euljiro4ga,DDP,Sindang,Sangwangsimni,Wangsimni,HanyangUniv;
    TextView Ttukseom,Seongsu,Yongdap,Sindap,Yongdu,Sinseoldong,KonkukUniv,Guui,Gangbyeon,Jamsillaru,Jamsil,Jamsilsaenae;
    TextView SportsComplex,Samseong,Seolleung,Yeoksam,Gangnam,SeoulNatlUnivofEducation,Seocho,Bangbae,Sadang,Nakseongdae;
    TextView SeoulNatlUniv,Bongcheon,Sillim,Sindaebang,GuroDigitalComplex,Daerim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts2);

        SeoulNatlUniv = findViewById(R.id.SeoulNatlUniv);
        Bongcheon = findViewById(R.id.Bongcheon);
        Sillim = findViewById(R.id.Sillim);
        Sindaebang = findViewById(R.id.Sindaebang);
        GuroDigitalComplex = findViewById(R.id.GuroDigitalComplex);

        SportsComplex = findViewById(R.id.SportsComplex);
        Samseong = findViewById(R.id.Samseong);
        Seolleung = findViewById(R.id.Seolleung);
        Yeoksam = findViewById(R.id.Yeoksam);
        Gangnam = findViewById(R.id.Gangnam);
        SeoulNatlUnivofEducation = findViewById(R.id.SeoulNatlUnivofEducation);
        Seocho = findViewById(R.id.Seocho);
        Bangbae = findViewById(R.id.Bangbae);
        Sadang = findViewById(R.id.Sadang);
        Nakseongdae = findViewById(R.id.Nakseongdae);

        Ttukseom = findViewById(R.id.Ttukseom);
        Seongsu = findViewById(R.id.Seongsu);
        Yongdap = findViewById(R.id.Yongdap);
        Sindap = findViewById(R.id.Sindap);
        Yongdu = findViewById(R.id.Yongdu);
        Sinseoldong = findViewById(R.id.Sinseoldong);
        KonkukUniv = findViewById(R.id.KonkukUniv);
        Guui = findViewById(R.id.Guui);
        Gangbyeon = findViewById(R.id.Gangbyeon);
        Jamsillaru = findViewById(R.id.Jamsillaru);
        Jamsil = findViewById(R.id.Jamsil);
        Jamsilsaenae = findViewById(R.id.Jamsilsaenae);

        Ahyeon = findViewById(R.id.Ahyeon);
        Chungjeongno = findViewById(R.id.Chungjeongno);
        CityHall = findViewById(R.id.CityHall);
        Euljiro1ga = findViewById(R.id.Euljiro1ga);
        Euljiro3ga = findViewById(R.id.Euljiro3ga);
        Euljiro4ga = findViewById(R.id.Euljiro4ga);
        DDP = findViewById(R.id.DDP);
        Sindang = findViewById(R.id.Sindang);
        Sangwangsimni = findViewById(R.id.Sangwangsimni);
        Wangsimni = findViewById(R.id.Wangsimni);
        HanyangUniv = findViewById(R.id.HanyangUniv);

        Kkachisan = findViewById(R.id.Kkachisan);
        Sinjeongnegeori = findViewById(R.id.Sinjeongnegeori);
        YangcheonguOffice = findViewById(R.id.YangcheonguOffice);
        Dorimcheon = findViewById(R.id.Dorimcheon);
        Sindorim = findViewById(R.id.Sindorim);
        Mullae = findViewById(R.id.Mullae);
        YeongdeungpoguOffice = findViewById(R.id.YeongdeungpoguOffice);
        Dangsan = findViewById(R.id.Dangsan);
        Hapjeong = findViewById(R.id.Hapjeong);
        HongikUniv = findViewById(R.id.HongikUniv);
        Sinchon = findViewById(R.id.Sinchon);
        EwhaWomansUniv = findViewById(R.id.EwhaWomansUniv);
        Daerim = findViewById(R.id.Daerim);
    }
}