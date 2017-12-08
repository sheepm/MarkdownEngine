package com.sheepm.core.token;

import com.sheepm.core.drawable.Drawable;
import com.sheepm.core.render.Render;

/**
 * Created by sheepm on 2017/12/3.
 */

public interface Token {

    void accept(Render render);

    Drawable convert();

}
