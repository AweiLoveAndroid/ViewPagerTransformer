package com.lzw.viewpagertransform;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.lzw.viewpagertransform.fragment.Main2PagerAdapter;
import com.lzw.viewpagertransform.transform.banner.AccordionTransformer;

import java.util.ArrayList;
import java.util.List;

/**
 * viewpager加载3个layout，进行切换
 */
public class MainActivity2 extends AppCompatActivity {

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
    }

    private void init() {
        mViewPager = (ViewPager) findViewById(R.id.viewpager2);

        LayoutInflater inflater = getLayoutInflater();
        View view1 = inflater.inflate(R.layout.vp_layout1, null);
        View view2 = inflater.inflate(R.layout.vp_layout2,null);
        View view3 = inflater.inflate(R.layout.vp_layout3, null);

        List<View> pageList = new ArrayList<>();
        pageList.add(view1);
        pageList.add(view2);
        pageList.add(view3);

        mViewPager.setAdapter(new Main2PagerAdapter(pageList));

        mViewPager.setPageTransformer(false,new AccordionTransformer());
    }

}
