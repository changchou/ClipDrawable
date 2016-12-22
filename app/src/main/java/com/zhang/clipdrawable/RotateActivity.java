package com.zhang.clipdrawable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class RotateActivity extends AppCompatActivity {

    private ImageView rotateimg;
    private int rotatelevel = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);
        rotateimg = (ImageView) findViewById(R.id.rotateimg);
    }

    public void onClick(View v) {
        if (rotatelevel > 100) {
            rotateimg.post(rdisapper);
        } else {
            rotateimg.post(rshow);
        }

    }

    private Runnable rshow = new Runnable() {
        @Override
        public void run() {


            if (rotatelevel < 10000) {
                rotatelevel += 100;
                rotateimg.getDrawable().setLevel(rotatelevel);
                rotateimg.postDelayed(rshow, 100);
            }

        }
    };
    private Runnable rdisapper = new Runnable() {
        @Override
        public void run() {


            if (rotatelevel > 100) {
                rotatelevel -= 100;
                rotateimg.getDrawable().setLevel(rotatelevel);
                rotateimg.postDelayed(rdisapper, 100);
            }

        }
    };
}
