package com.henu.sdinosaurcommunity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.henu.sdinosaurcommunity.R;

public class LoginActivity extends AppCompatActivity {
    private Button mBtnLogin = null ;
    private EditText mEditUserName = null ;
    private Button mBtnRegister = null ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mBtnLogin = findViewById(R.id.ConfirmBtn) ;
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
            }
        });

        mEditUserName = findViewById(R.id.UserName) ;
        mEditUserName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        mBtnRegister = findViewById(R.id.RegisterBtn) ;
        mBtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class) ;
                startActivity(intent);
            }
        });

    }
}