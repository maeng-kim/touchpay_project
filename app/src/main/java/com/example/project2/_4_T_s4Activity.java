package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _4_T_s4Activity extends AppCompatActivity {
    Button jsButton;

    private TextView tv_4station;

    private TextView Oido,Jeongwang,Singiloncheon,Ansan,Choji,Gojan,Jungang,HanyangUnivatAnsan,Sangnoksu,Banwol,Daeyami,Sanbon,Geumjeong,Beomgye,Pyeongchon,Indeogwon ;
    private TextView GovernmentComplexGwacheon,Surisan,Gwacheon,SeoulGrandPark,SeoulRacecoursePark,Seonbawi,Namtaeryeong,Sadang,ChongshinUniv,Dongjak,Ichon,Sinyongsan,Samgakji ;
    private TextView SookmyungWomensUniversity,SeoulStation,Hoehyeon,Myeongdong,Chungmuro,DDP,Dongdaemun,Hyehwa,HansungUniv,SungshinWomensUniversity,Gireum,Miasageori ;
    private TextView Mia,Suyu,Ssangmun,Changdong,Nowon,Sanggye,Danggogae,ByeollaeByeolgaram,Onam,Jinjeop ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_ts4);
        jsButton=findViewById(R.id.jsButton);

        jsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), JSActivity.class);
                startActivity(intent);
            }
        });

        tv_4station = findViewById(R.id.tv_4station);

        String text4 = "오이도\n\n정왕\n\n신길온천\n\n안산\n\n초지\n\n고잔\n\n중앙\n\n한대앞\n\n상록수\n\n반월\n\n대야미\n\n수리산\n\n산본\n\n금정\n\n범계\n\n평촌\n\n인덕원\n\n정부과천청사\n\n과천\n\n대공원\n\n경마공원\n\n선바위\n\n남태령\n\n사당\n\n총신대입구(이수)\n\n동작\n\n이촌\n\n신용산\n\n삼각지\n\n숙대입구\n\n서울역\n\n회현\n\n명동\n\n충무로\n\n동대문역사문화공원\n\n동대문\n\n혜화\n\n한성대입구\n\n성신여대입구\n\n길음\n\n미아사거리\n\n미아\n\n수유\n\n쌍문\n\n창동\n\n노원\n\n상계\n\n당고개\n\n별내별가람\n\n오남\n\n진접";
        tv_4station.setText(text4);

        Linkify.TransformFilter mTransform = new Linkify.TransformFilter() {
            @Override
            public String transformUrl(Matcher match, String url) {
                return "";
            }
        };

        Pattern pattern1 = Pattern.compile("오이도");
        Linkify.addLinks(tv_4station,pattern1,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262939153",null,mTransform);

        Pattern pattern2 = Pattern.compile("미아");
        Linkify.addLinks(tv_4station,pattern2,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262946816",null,mTransform);

        Pattern pattern3 = Pattern.compile("미아"+"사거리");
        Linkify.addLinks(tv_4station,pattern3,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262946731",null,mTransform);

        Pattern pattern4 = Pattern.compile("동대문");
        Linkify.addLinks(tv_4station,pattern4,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262946241",null,mTransform);

        Pattern pattern5 = Pattern.compile("동대문"+"역사문화공원");
        Linkify.addLinks(tv_4station,pattern5,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262946177",null,mTransform);

        Pattern pattern6 = Pattern.compile("정왕");
        Linkify.addLinks(tv_4station,pattern6,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262939230",null,mTransform);

        Pattern pattern7 = Pattern.compile("신길온천");
        Linkify.addLinks(tv_4station,pattern7,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262939350",null,mTransform);

        Pattern pattern8 = Pattern.compile("안산");
        Linkify.addLinks(tv_4station,pattern8,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262939408",null,mTransform);

        Pattern pattern9 = Pattern.compile("초지");
        Linkify.addLinks(tv_4station,pattern9,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262939469",null,mTransform);

        Pattern pattern10 = Pattern.compile("고잔");
        Linkify.addLinks(tv_4station,pattern10,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262939571",null,mTransform);

        Pattern pattern11 = Pattern.compile("중앙");
        Linkify.addLinks(tv_4station,pattern11,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262939611",null,mTransform);

        Pattern pattern12 = Pattern.compile("한대앞");
        Linkify.addLinks(tv_4station,pattern12,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262939677",null,mTransform);

        Pattern pattern13 = Pattern.compile("상록수");
        Linkify.addLinks(tv_4station,pattern13,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262939738",null,mTransform);

        Pattern pattern14 = Pattern.compile("반월");
        Linkify.addLinks(tv_4station,pattern14,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262939915",null,mTransform);

        Pattern pattern15 = Pattern.compile("대야미");
        Linkify.addLinks(tv_4station,pattern15,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262939972",null,mTransform);

        Pattern pattern16 = Pattern.compile("수리산");
        Linkify.addLinks(tv_4station,pattern16,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262940052",null,mTransform);

        Pattern pattern17 = Pattern.compile("산본");
        Linkify.addLinks(tv_4station,pattern17,"",null,mTransform);

        Pattern pattern18 = Pattern.compile("금정");
        Linkify.addLinks(tv_4station,pattern18,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262940122",null,mTransform);

        Pattern pattern19 = Pattern.compile("범계");
        Linkify.addLinks(tv_4station,pattern19,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262940178",null,mTransform);

        Pattern pattern20 = Pattern.compile("평촌");
        Linkify.addLinks(tv_4station,pattern20,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262940235",null,mTransform);

        Pattern pattern21 = Pattern.compile("인덕원");
        Linkify.addLinks(tv_4station,pattern21,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262940335",null,mTransform);

        Pattern pattern22 = Pattern.compile("정부"+"과천"+"청사");
        Linkify.addLinks(tv_4station,pattern22,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262940424",null,mTransform);

        Pattern pattern23 = Pattern.compile("과천");
        Linkify.addLinks(tv_4station,pattern23,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262940510",null,mTransform);

        Pattern pattern24 = Pattern.compile("대공원");
        Linkify.addLinks(tv_4station,pattern24,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262940554",null,mTransform);

        Pattern pattern25 = Pattern.compile("경마공원");
        Linkify.addLinks(tv_4station,pattern25,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262944953",null,mTransform);

        Pattern pattern26 = Pattern.compile("선바위");
        Linkify.addLinks(tv_4station,pattern26,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262945062",null,mTransform);

        Pattern pattern27 = Pattern.compile("남태령");
        Linkify.addLinks(tv_4station,pattern27,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262945127",null,mTransform);

        Pattern pattern28 = Pattern.compile("사당");
        Linkify.addLinks(tv_4station,pattern28,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262945154",null,mTransform);

        Pattern pattern29 = Pattern.compile("총신대입구");
        Linkify.addLinks(tv_4station,pattern29,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262945222",null,mTransform);

        Pattern pattern30 = Pattern.compile("동작");
        Linkify.addLinks(tv_4station,pattern30,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262945341",null,mTransform);

        Pattern pattern31 = Pattern.compile("이촌");
        Linkify.addLinks(tv_4station,pattern31,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262945388",null,mTransform);

        Pattern pattern32 = Pattern.compile("신용산");
        Linkify.addLinks(tv_4station,pattern32,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262945465",null,mTransform);

        Pattern pattern33 = Pattern.compile("삼각지");
        Linkify.addLinks(tv_4station,pattern33,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262945519",null,mTransform);

        Pattern pattern34 = Pattern.compile("숙대입구");
        Linkify.addLinks(tv_4station,pattern34,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262945592",null,mTransform);

        Pattern pattern35 = Pattern.compile("서울역");
        Linkify.addLinks(tv_4station,pattern35,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262945678",null,mTransform);

        Pattern pattern36 = Pattern.compile("회현");
        Linkify.addLinks(tv_4station,pattern36,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262945770",null,mTransform);

        Pattern pattern37 = Pattern.compile("명동");
        Linkify.addLinks(tv_4station,pattern37,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262945869",null,mTransform);

        Pattern pattern38 = Pattern.compile("충무로");
        Linkify.addLinks(tv_4station,pattern38,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262946065",null,mTransform);

        Pattern pattern39 = Pattern.compile("혜화");
        Linkify.addLinks(tv_4station,pattern39,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262946350",null,mTransform);

        Pattern pattern40 = Pattern.compile("한성대입구");
        Linkify.addLinks(tv_4station,pattern40,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262946426",null,mTransform);

        Pattern pattern41 = Pattern.compile("성신여대입구");
        Linkify.addLinks(tv_4station,pattern41,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262946503",null,mTransform);

        Pattern pattern42 = Pattern.compile("길음");
        Linkify.addLinks(tv_4station,pattern42,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262946653",null,mTransform);

        Pattern pattern43 = Pattern.compile("수유");
        Linkify.addLinks(tv_4station,pattern43,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262946872",null,mTransform);

        Pattern pattern44 = Pattern.compile("쌍문");
        Linkify.addLinks(tv_4station,pattern44,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262946924",null,mTransform);

        Pattern pattern45 = Pattern.compile("창동");
        Linkify.addLinks(tv_4station,pattern45,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262947216",null,mTransform);

        Pattern pattern46 = Pattern.compile("노원");
        Linkify.addLinks(tv_4station,pattern46,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262947293",null,mTransform);

        Pattern pattern47 = Pattern.compile("상계");
        Linkify.addLinks(tv_4station,pattern47,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262947371",null,mTransform);

        Pattern pattern48 = Pattern.compile("당고개");
        Linkify.addLinks(tv_4station,pattern48,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262947430",null,mTransform);

        Pattern pattern49 = Pattern.compile("별내별가람");
        Linkify.addLinks(tv_4station,pattern49,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262947476",null,mTransform);

        Pattern pattern50 = Pattern.compile("오남");
        Linkify.addLinks(tv_4station,pattern50,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262947527",null,mTransform);

        Pattern pattern51 = Pattern.compile("진접");
       Linkify.addLinks(tv_4station,pattern51,"https://padlet.com/sohyeonj415/sswuTouchPay/wish/2262947599",null,mTransform);



    }
}