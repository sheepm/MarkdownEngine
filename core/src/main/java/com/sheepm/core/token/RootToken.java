package com.sheepm.core.token;

import com.sheepm.core.render.Render;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by paomo on 2017/12/4.
 */

public class RootToken implements Token {
    private final String input;
    private List<Token> list = new LinkedList<>();

    private int pos;
    private int line;


    public RootToken(String input) {
        this.input = input;
    }
    @Override
    public void accept(Render render) {
        render.visit(this);
    }

    public RootToken nextValue(){
        while (pos < input.length()){
            char c = input.charAt(pos);
            switch (c){
                case '#':
                    final String readLine = readLine();
                    list.add(readHeaderToken(readLine));
                    break;
                case '>':
                    final String readLine2 = readLine();
                    list.add(readQuoteToken());
                    break;
                case '[':
                    list.add(readHyperLinkToken());
                    break;
                case '`':
                    list.add(readCodeSpanToken());
                    break;
                case '-':
                case '+':
                case '*':
                    // TODO: 2017/12/3 加粗
                    list.add(readListToken());
                    break;
                case '!':
                    list.add(readImageToken());
                default:
                    list.add(readParagraphToken());
                    break;
            }
        }
        return this;
    }

    public String readLine(){
        int start = pos;
        int end = pos;
        while(pos < input.length()){
            char c = input.charAt(pos);
            if (c == '\n'){
                end = pos;
                pos++;
                break;
            }
            pos++;
        }
        return input.substring(start, end);
    }

    public String readBlock(){
        return null;
    }

    public String readParagraph(){
        return null;
    }

    public HeaderToken readHeaderToken(String line){
        return new HeaderToken(line);
    }

    public QuoteToken readQuoteToken(){
        QuoteToken token = new QuoteToken();
        return token;
    }

    public ListToken readListToken(){
        ListToken token = new ListToken();
        return token;
    }

    public ImageToken readImageToken(){
        ImageToken token = new ImageToken();
        return token;
    }

    public HyperLinkToken readHyperLinkToken(){
        HyperLinkToken token = new HyperLinkToken();
        return token;
    }

    public CodeSpanToken readCodeSpanToken(){
        CodeSpanToken token = new CodeSpanToken();
        return token;
    }

    public ParagraphToken readParagraphToken(){
        ParagraphToken token = new ParagraphToken();
        return token;
    }
}
