package com.sheepm.core.render;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.sheepm.core.token.RootToken;

/**
 * Created by paomo on 2017/12/8.
 */

public class RenderView extends View {

    private RootToken token;

    public RenderView(Context context) {
        super(context);
    }

    public RenderView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

}
