package com.lzw.viewpagertransform.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lzw.viewpagertransform.R;

/**
 *
 */
public class Main3FragmentOne extends Fragment {

    public Main3FragmentOne() {
    }

    public static Main3FragmentOne newInstance() {
        Main3FragmentOne fragment = new Main3FragmentOne();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.vp_layout1, container, false);
    }

}
