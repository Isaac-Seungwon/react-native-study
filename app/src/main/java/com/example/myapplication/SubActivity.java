package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SubActivity extends AppCompatActivity {

    private TextView tv_sub;
    private TextView tv_date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        // 텍스트뷰 변수 초기화
        tv_sub = findViewById(R.id.tv_sub);
        tv_date = findViewById(R.id.tv_date);

        // Intent에서 문자열 값 가져오기
        Intent intent = getIntent();
        String str = intent.getStringExtra("str");

        // 텍스트뷰에 문자열 값 설정
        tv_sub.setText(str);

        // 현재 날짜 및 시간 가져오기
        String currentDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());

        // 텍스트뷰에 날짜 및 시간 설정
        tv_date.setText(currentDateTime);
    }
}
