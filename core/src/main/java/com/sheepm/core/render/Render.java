package com.sheepm.core.render;

import com.sheepm.core.token.CodeSpanToken;
import com.sheepm.core.token.RootToken;
import com.sheepm.core.token.HeaderToken;
import com.sheepm.core.token.HyperLinkToken;
import com.sheepm.core.token.ImageToken;
import com.sheepm.core.token.ListToken;
import com.sheepm.core.token.ParagraphToken;
import com.sheepm.core.token.PhraseToken;
import com.sheepm.core.token.QuoteToken;

/**
 * Created by paomo on 2017/12/4.
 */

public abstract class Render {

    public abstract void visit(CodeSpanToken token);

    public abstract void visit(HeaderToken token);

    public abstract void visit(HyperLinkToken token);

    public abstract void visit(ImageToken token);

    public abstract void visit(ListToken token);

    public abstract void visit(ParagraphToken token);

    public abstract void visit(PhraseToken token);

    public abstract void visit(QuoteToken token);

    public abstract void visit(RootToken token);

}
