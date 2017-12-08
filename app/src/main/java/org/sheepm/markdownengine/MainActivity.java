package org.sheepm.markdownengine;

import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.sheepm.core.MarkdownParser;
import com.sheepm.core.render.ConcreteRender;
import com.sheepm.core.token.RootToken;
import com.sheepm.core.token.Token;

public class MainActivity extends AppCompatActivity {

    private EditText mEt;
    private Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEt = (EditText) findViewById(R.id.edit_text);
        mBtn = (Button) findViewById(R.id.button);
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = mEt.getText().toString();
                MarkdownParser parser = new MarkdownParser(s);
                RootToken root = parser.getRoot().nextValue();
            }
        });
    }



    public static void main(String[] args){
        final String reg = "^\\[*\\]\\(*\\)$";
        String line = "[hello](www.baidu.com)";
        if (line.matches(reg)){
            System.out.print("1");
        }else {
            System.out.print("0");
        }
    }
}
