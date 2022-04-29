package com.henu.sdinosaurcommunity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.henu.sdinosaurcommunity.R;

public class HomePageActivity extends AppCompatActivity {
    private Button mHomePageBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        mHomePageBtn = findViewById(R.id.HomePageBtn) ;
        mHomePageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomePageActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
            }
        });
    }
}