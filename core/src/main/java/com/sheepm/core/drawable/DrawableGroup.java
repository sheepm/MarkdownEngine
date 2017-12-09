package com.sheepm.core.drawable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sheepm on 2017/12/10.
 */

public abstract class DrawableGroup extends Drawable {

    private int drawableCount;
    private List<Drawable> mLists;

    public DrawableGroup(){
        initDrawableGroup();
    }

    private void initDrawableGroup() {
        drawableCount = 0;
        mLists = new ArrayList<>();
    }

    public int getDrawableCount(){
        return drawableCount;
    }

    public void addDrawable(Drawable drawable){
        if (drawable == null){
            throw new NullPointerException("drawable == null");
        }
        mLists.add(drawable);
        drawableCount++;
    }

    public Drawable getDrawableAt(int index){
        if (index < 0 || index >= drawableCount){
            return null;
        }
        return mLists.get(index);
    }

    @Override
    protected abstract void onLayout(boolean changed, int left, int top, int right, int bottom);


}
