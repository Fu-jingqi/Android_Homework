package com.example.im.controller.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.Bundle;
import android.view.Display;
import android.view.View;

import com.example.im.R;
import com.example.im.model.Model;
import com.example.im.model.bean.UserInfo;
import com.hyphenate.chat.EMClient;

//欢迎页面
public class SplashActivity extends Activity {

    private Handler handler = new Handler()
    {
        public void handleMessage(Message msg)
        {
            //如果当前的activity已经退出，那么就不处理handler中的消息
            if(isFinishing())
            {
                return;
            }

            //判断进入主页面还是登录界面
            toMainOrLogin();
        }
    };
    //判断进入主页面还是登录界面
    private void toMainOrLogin()
    {

        Model.getInstance().getGlobalThreadPool().execute(new Runnable() {
            @Override
            public void run()
            {
                //判断是否登录过
                if(EMClient.getInstance().isLoggedInBefore())//登录过
                {
                    //获取当前登录的用户信息
                    UserInfo account = Model.getInstance().getUserAccountDao().getAccountByHxid(EMClient.getInstance().getCurrentUser());

                    if(account == null)
                    {
                        //跳转到登录页面
                        Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                        startActivity(intent);
                    }else
                    {
                        //跳转主页面
                        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                        startActivity(intent);
                    }

                }
                else//没登录过
                {
                    //跳转到登录页面
                    Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                    startActivity(intent);
                }

                //结束当前页面
                finish();
            }
        });
    }

    @Override
    protected  void  onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_splash_acvtivity);
        //发送两秒的延迟消息
        handler.sendMessageDelayed(Message.obtain(),2000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //销毁消息
        handler.removeCallbacksAndMessages(null);
    }
}
