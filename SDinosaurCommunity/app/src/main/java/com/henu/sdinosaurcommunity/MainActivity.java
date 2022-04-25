package com.henu.sdinosaurcommunity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.henu.sdinosaurcommunity.Activity.LoginActivity;

public class MainActivity extends AppCompatActivity {

    private Button mHomePageBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        mHomePageBtn = findViewById(R.id.HomePageBtn) ;
        mHomePageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class) ;
                System.out.printf("跳转成功");
                startActivity(intent);
            }
        });
    }
}