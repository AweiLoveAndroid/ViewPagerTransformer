package com.lzw.viewpagertransform.lib.transform.custom;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * 垂直方向的PageTransformer
 */
public class VerticalTransformer implements ViewPager.PageTransformer {

    @Override
    public void transformPage(View page, float position) {
        float alpha = 0;
        if(alpha>= 0 && alpha <= 1){
            alpha = 1 - position;
        }else if(alpha>= -1 && alpha < 0){
            alpha = 1 + position;
        }
        page.setAlpha(alpha);
        float transX = page.getWidth() * -position;
        page.setTranslationX(transX);
        float transY = position * page.getHeight();
        page.setTranslationY(transY);

    }
}
