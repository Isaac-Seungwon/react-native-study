package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // 변수 선언
    private EditText et_id;
    private EditText et_test;
    private Button btn_test;
    private Button btn_move;
    private Button btn_toast;
    private String str;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 이 액티비티에 Edge-to-Edge 디스플레이 활성화
        EdgeToEdge.enable(this);

        // activity_main 레이아웃을 이 액티비티의 컨텐츠 뷰로 설정
        setContentView(R.layout.activity_main);

        // EditText 및 Button 변수 초기화
        et_id = findViewById(R.id.et_id);
        et_test = findViewById(R.id.et_test);
        btn_test = findViewById(R.id.btn_test);
        btn_move = findViewById(R.id.btn_move);
        btn_toast = findViewById(R.id.btn_toast);

        // btn_move 클릭 시 액티비티 이동
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = et_test.getText().toString();
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                intent.putExtra("str", str); // str 변수를 Intent에 문자열로 전달
                startActivity(intent); // 액티비티 이동
            }
        });

        // btn_test 클릭 시 EditText에 텍스트 설정
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_id.setText("버튼 클릭");
            }
        });

        // btn_toast 클릭 시 토스트 메시지 표시
        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "토스트 메시지!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
