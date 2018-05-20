package com.lzw.viewpagertransform;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.lzw.viewpagertransform.fragment.Main1PagerAdapter;

/**
 * 使用一个fragment，只是当前内容局部切换。
 */
public class MainActivity1 extends AppCompatActivity {

    private Main1PagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        int[] colorsArray = new int[]{R.color.blue,R.color.colorAccent,R.color.colorPrimary};
        mSectionsPagerAdapter = new Main1PagerAdapter(getSupportFragmentManager(),colorsArray);

        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

    }

}
