package com.henu.sdinosaurcommunity.fragment;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.henu.sdinosaurcommunity.R;

@SuppressLint("ValidFragment")
public class MyFragment extends Fragment {

    public MyFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_content,container,false);

        return view;
    }
}