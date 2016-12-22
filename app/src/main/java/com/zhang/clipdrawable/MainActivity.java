package com.zhang.clipdrawable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.clip:
                intent.setClass(MainActivity.this, ClipActivity.class);
                break;
            case R.id.inset:
                intent.setClass(MainActivity.this, InsetActivity.class);
                break;
            case R.id.rotate:
                intent.setClass(MainActivity.this, RotateActivity.class);
                break;
            case R.id.scale:
                intent.setClass(MainActivity.this, ScaleActivity.class);
                break;
            case R.id.bitmap:
                intent.setClass(MainActivity.this, BitmapActivity.class);
                break;
            case R.id.ninepatch:
                intent.setClass(MainActivity.this, NinePatchActivity.class);
                break;
            case R.id.picture:
                intent.setClass(MainActivity.this, PictureActivity.class);
                break;
        }
        startActivity(intent);
    }
}
