package com.sheepm.core.token;

import com.sheepm.core.drawable.Drawable;
import com.sheepm.core.render.Render;

/**
 * Created by sheepm on 2017/12/3.
 */

public class HyperLinkToken implements Token {

    private static final String reg = "^\\[.*\\]\\(.*\\)$";

    @Override
    public void accept(Render render) {

    }

    @Override
    public Drawable convert() {
        return null;
    }
}
