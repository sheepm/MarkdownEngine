package com.sheepm.core.render;

import android.graphics.Canvas;

import com.sheepm.core.token.CodeSpanToken;
import com.sheepm.core.token.RootToken;
import com.sheepm.core.token.HeaderToken;
import com.sheepm.core.token.HyperLinkToken;
import com.sheepm.core.token.ImageToken;
import com.sheepm.core.token.ListToken;
import com.sheepm.core.token.ParagraphToken;
import com.sheepm.core.token.PhraseToken;
import com.sheepm.core.token.QuoteToken;
import com.sheepm.core.token.Token;

/**
 * Created by paomo on 2017/12/4.
 */

public class ConcreteRender extends Render {

    private Canvas canvas;

    public ConcreteRender(Canvas canvas){
        this.canvas = canvas;
    }

    @Override
    public void visit(CodeSpanToken token) {

    }

    @Override
    public void visit(HeaderToken token) {
        for (Token token1 : token.list) {

        }
    }

    @Override
    public void visit(HyperLinkToken token) {

    }

    @Override
    public void visit(ImageToken token) {

    }

    @Override
    public void visit(ListToken token) {

    }

    @Override
    public void visit(ParagraphToken token) {

    }

    @Override
    public void visit(PhraseToken token) {

    }

    @Override
    public void visit(QuoteToken token) {

    }

    @Override
    public void visit(RootToken token) {

    }
}
