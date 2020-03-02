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

        ImageView ivBall = findViewById(R.id.ivBall);
        ImageView ivCat = findViewById(R.id.ivCat);
        ImageView ivSun = findViewById(R.id.ivSun);

        Animation animBall = AnimationUtils.loadAnimation(this,R.anim.anim_ball);
        ivBall.startAnimation(animBall);

        Animation animSun = AnimationUtils.loadAnimation(this,R.anim.anim_sun);
        ivSun.startAnimation(animSun);

        ivCat.setBackgroundResource(R.drawable.anim_cat);
        AnimationDrawable animCat = (AnimationDrawable) ivCat.getBackground();
        animCat.start();


    }
}
