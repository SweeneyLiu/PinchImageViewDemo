package com.lsw.demo.pinchimageviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Matrix;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View mBackground;
    private PinchImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = (PinchImageView) findViewById(R.id.pic);
        mBackground = findViewById(R.id.background);
        mImageView.setImageDrawable(getResources().getDrawable((R.drawable.photo)));
    }
}