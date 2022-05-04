package com.henu.sdinosaurcommunity.Activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.henu.sdinosaurcommunity.R;
import com.henu.sdinosaurcommunity.fragment.MyFragment;
import com.henu.sdinosaurcommunity.fragment.NewsFragment;

public class NaviActivity extends AppCompatActivity implements View.OnClickListener {
    //UI Object
    private TextView txt_topbar;
    private TextView txt_channel;
    private TextView txt_better;
    private TextView txt_setting;
    private FrameLayout ly_content;
    private FrameLayout newsFragment;


    //Fragment Object
    private MyFragment fg4;
    private SearchFragment fg3 ;
    private NewsFragment fg1;
    private FragmentManager fManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_new);
        fManager = getFragmentManager();
        bindViews();
        txt_channel.performClick();   //模拟一次点击，既进去后选择第一项
    }
    //
    private void bindViews() {
        txt_topbar = findViewById(R.id.txt_topbar);
        txt_channel = findViewById(R.id.txt_channel);
        txt_better = findViewById(R.id.txt_better);
        txt_setting = findViewById(R.id.txt_setting);
        ly_content = findViewById(R.id.ly_content);
        newsFragment = findViewById(R.id.ly_content);

        txt_channel.setOnClickListener(this);
        txt_better.setOnClickListener(this);
        txt_setting.setOnClickListener(this);
    }
    //重置所有文本的选中状态
    private void setSelected(){
        txt_channel.setSelected(false);
        txt_better.setSelected(false);
        txt_setting.setSelected(false);
    }
    //隐藏所有Fragment
    private void hideAllFragment(FragmentTransaction fragmentTransaction){
        if(fg1 != null)fragmentTransaction.hide(fg1);
        if(fg3 != null)fragmentTransaction.hide(fg3);
        if(fg4 != null)fragmentTransaction.hide(fg4);
    }
    @Override
    public void onClick(View v) {
        FragmentTransaction fTransaction = fManager.beginTransaction();
        hideAllFragment(fTransaction);
        switch (v.getId()){
            case R.id.txt_channel:
                setSelected();
                txt_channel.setSelected(true);
                if(fg1 == null){
                    fg1 = new NewsFragment();
                    fTransaction.add(R.id.ly_content,fg1);
                }else{
                    fTransaction.show(fg1);
                }
                break;
            case R.id.txt_better:
                setSelected();
                txt_better.setSelected(true);
                if(fg3 == null){
                    fg3 = new SearchFragment();
                    fTransaction.add(R.id.ly_content,fg3);
                }else{
                    fTransaction.show(fg3);
                }
                break;
            case R.id.txt_setting:
                setSelected();
                txt_setting.setSelected(true);
                if(fg4 == null){
                    fg4 = new MyFragment();
                    fTransaction.add(R.id.ly_content,fg4);
                }else{
                    fTransaction.show(fg4);
                }
                break;
        }
        fTransaction.commit();
    }
}