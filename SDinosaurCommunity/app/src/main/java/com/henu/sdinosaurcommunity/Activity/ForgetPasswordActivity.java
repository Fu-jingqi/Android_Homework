package com.henu.sdinosaurcommunity.Activity;

import androidx.appcompat.app.AppCompatActivity;
import com.henu.sdinosaurcommunity.R ;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ForgetPasswordActivity extends AppCompatActivity {

    private Button mforget_btn1 ;
    private Button mforget_btn2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        mforget_btn1 = findViewById(R.id.forget_btn1) ;
        mforget_btn2 = findViewById(R.id.forget_btn2) ;

        mforget_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ForgetPasswordActivity.this,LoginActivity.class) ;
                startActivity(intent);
            }
        });

        mforget_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ForgetPasswordActivity.this, "提交成功", Toast.LENGTH_SHORT).show();
            }
        });
    }
}