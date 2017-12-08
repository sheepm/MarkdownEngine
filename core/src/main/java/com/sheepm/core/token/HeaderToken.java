package com.sheepm.core.token;

import com.sheepm.core.drawable.Drawable;
import com.sheepm.core.drawable.HeaderDrawable;
import com.sheepm.core.render.Render;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sheepm on 2017/12/3.
 * 支持HyperToken PhraseToken CodeSpanToken
 */
public class HeaderToken implements Token {

    private static final String reg = ".*\\[.*\\]\\(.*\\).*";

    public List<Token> list = new LinkedList<>();

    private final String in;

    private int pos;

    private Type size;
    private String renderStr;

    public HeaderToken(String line){
        in = line;
        nextValue();
    }

    public void nextValue(){
        boolean hasHyperLink = in.matches(reg);
        int num = startWithChar(in, '#');
        size = Type.typeFromNum(num > 6 ? 6 : num);
        pos += num;
        while (pos < in.length()){
            char c = in.charAt(pos);
            if (!hasHyperLink){
                renderStr = in.substring(pos,in.length());
                break;
            }else {
                switch (c){
                    case '[':
                        break;
                    default:
                        break;
                }
            }
        }
    }

    @Override
    public void accept(Render render) {
        render.visit(this);
    }

    @Override
    public Drawable convert() {
        HeaderDrawable drawable;
        return null;
    }

    private int startWithChar(String s, char c){
        int p = 0;
        while (s.charAt(p) == c){
            p++;
        }
        return p;
    }

    private enum Type{
        H1(1),
        H2(2),
        H3(3),
        H4(4),
        H5(5),
        H6(6);

        private int size;

        Type(int n){
            size = n;
        }

        public static Type typeFromNum(int n){
            for (Type type : Type.values()) {
                if (type.getTypeValue() == n) {
                    return type;
                }
            }
            return null;
        }

        private int getTypeValue(){
            return size;
        }
    }
}
