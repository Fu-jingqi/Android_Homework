package com.henu.sdinosaurcommunity.Activity;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.henu.sdinosaurcommunity.R;


@SuppressLint("ValidFragment")
public class SearchFragment extends Fragment {

    public SearchFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.acativity_search,container,false);

        return view;
    }
}