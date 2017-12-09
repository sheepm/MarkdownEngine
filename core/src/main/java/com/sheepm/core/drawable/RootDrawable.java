package com.sheepm.core.drawable;


/**
 * Created by sheepm on 2017/12/10.
 */

public class RootDrawable extends DrawableGroup {

    public RootDrawable(){

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        measureVertical(widthMeasureSpec,heightMeasureSpec);
    }

    private void measureVertical(int widthMeasureSpec,int heightMeasureSpec){

    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        layoutVertical(left, top, right, bottom);
    }

    private void layoutVertical(int left,int top,int right,int bottom){
        int childTop = 0;
        int childLeft = 0;
        final int count = getDrawableCount();
        for (int i = 0; i < count; i++) {
            final Drawable child = getDrawableAt(i);
            if (child == null){
                childTop += measureNullChild(childTop);
            }else {
                final int childWidth = child.getMeasureWidth();
                final int childHeight = child.getMeasureHeight();
                setChildFrame(child,childLeft,childTop,childWidth,childHeight);
                childTop += childHeight;
            }
        }
    }

    private void setChildFrame(Drawable child , int left , int top , int width , int height){
        child.layout(left, top , left + width , top + height);
    }

    int measureNullChild(int childIndex) {
        return 0;
    }
}
