package com.sheepm.core;

import com.sheepm.core.token.RootToken;
import com.sheepm.core.token.Token;

/**
 * Created by sheepm on 2017/12/3.
 */

public class MarkdownParser {

    private final String input;

    private RootToken rootToken;

    public MarkdownParser(String in){
        if (in != null && in.startsWith("\ufeff")){
            in = in.substring(1);
        }
        this.input = in;
        rootToken = new RootToken(input);
    }

    public RootToken getRoot(){
        return rootToken;
    }

    public static void main(String[] args){

    }
}
