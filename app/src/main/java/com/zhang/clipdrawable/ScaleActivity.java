package com.zhang.clipdrawable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ScaleActivity extends AppCompatActivity {

    private ImageView scaleimg;
    private int scalelevel = 10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);

        scaleimg = (ImageView) findViewById(R.id.scaleimg);
        scaleimg.getDrawable().setLevel(10000);
    }

    public void onClick(View v) {
        if (scalelevel > 100) {
            scaleimg.post(rdisapper);
        } else {
            scaleimg.post(rshow);
        }
    }

    private Runnable rshow = new Runnable() {
        @Override
        public void run() {


            if (scalelevel < 10000) {
                scalelevel += 100;
                scaleimg.getDrawable().setLevel(scalelevel);
                scaleimg.postDelayed(rshow, 100);
            }

        }
    };
    private Runnable rdisapper = new Runnable() {
        @Override
        public void run() {


            if (scalelevel > 100) {
                scalelevel -= 100;
                scaleimg.getDrawable().setLevel(scalelevel);
                scaleimg.postDelayed(rdisapper, 100);
            }

        }
    };
}
