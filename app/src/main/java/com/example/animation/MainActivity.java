package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ivBall = (ImageView) findViewById(R.id.ivBall);
        ImageView ivCat = (ImageView) findViewById(R.id.ivCat);

        Animation animBall = AnimationUtils.loadAnimation(this,R.anim.anim_ball);
        ivBall.startAnimation(animBall);

        ivCat.setBackgroundResource(R.drawable.anim_cat);
        AnimationDrawable animCat = (AnimationDrawable) ivCat.getBackground();
        animCat.start();


    }
}
