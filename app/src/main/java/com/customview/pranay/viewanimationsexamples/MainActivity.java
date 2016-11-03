package com.customview.pranay.viewanimationsexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ball;
    ImageView cloud;
    ImageView birds;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ball = (ImageView) findViewById(R.id.ball);
        btn = (Button) findViewById(R.id.btn);
        cloud = (ImageView) findViewById(R.id.cloud);
        birds = (ImageView) findViewById(R.id.birds);


        Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.firstanimation);
        ball.startAnimation(animation);

        Animation cloudAnimation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.cloud);
        cloud.startAnimation(cloudAnimation);

        Animation birdsAnimation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.birds);
        birds.startAnimation(birdsAnimation);

        birdsAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                birds.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.firstanimation);
                ball.startAnimation(animation);
            }
        });
    }
}
