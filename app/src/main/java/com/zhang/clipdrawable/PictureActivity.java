package com.zhang.clipdrawable;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class PictureActivity extends AppCompatActivity {

    private PictureDrawable mDrawable;
    private ImageView img1, img2, img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);

        Picture mPicture = new Picture();
        drawPic(mPicture.beginRecording(200, 100));
        mPicture.endRecording();

        mDrawable = new PictureDrawable(mPicture);


        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);
        img1.setBackground(mDrawable);
        img2.setBackground(mDrawable);
        img3.setBackground(mDrawable);
    }

    @Override
    protected void onResume() {
        super.onResume();

        img1.setImageDrawable(mDrawable);
        img2.setBackground(mDrawable);
        img3.setBackground(mDrawable);

    }

    private void drawPic(Canvas canvas) {
        Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);

        canvas.drawRGB(255, 255, 0);

        p.setColor(Color.GREEN);
        p.setTextSize(30);
        canvas.drawText("Pictures", 60, 60, p);
    }
}
