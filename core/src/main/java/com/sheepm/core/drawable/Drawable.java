package com.sheepm.core.drawable;

import android.icu.util.Measure;

/**
 * Created by paomo on 2017/12/8.
 */

public class Drawable {

    private int height;
    private int width;

    public int getMeasureHeight(){
        return height;
    }

    public int getMeasureWidth(){
        return width;
    }
    
    protected void onMeasure(int widthMeasureSpec , int heightMeasureSpec){
        // TODO: 2017/12/10
    }

    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        //null implement
    }

    public void layout(int left , int top , int right , int bottom){
        // TODO: 2017/12/10
    }

}
