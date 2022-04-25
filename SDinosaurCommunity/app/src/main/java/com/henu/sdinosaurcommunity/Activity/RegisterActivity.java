package com.henu.sdinosaurcommunity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.henu.sdinosaurcommunity.R;

public class RegisterActivity extends AppCompatActivity {
    private Button mBtnReturn = null ;
    private Button mBtnSubmit = null;
    private TextView mRegisterReadme = null ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mBtnReturn = findViewById(R.id.Register_btn1) ;
        mBtnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class) ;
                startActivity(intent);
            }
        });

        mBtnSubmit = findViewById(R.id.Register_btn2) ;
        mBtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
            }
        });

        mRegisterReadme = findViewById(R.id.Register_readme) ;
        mRegisterReadme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this,DisciplineActivity.class) ;
                startActivity(intent);
            }
        });
    }
}