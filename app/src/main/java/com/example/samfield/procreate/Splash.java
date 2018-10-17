package com.example.samfield.procreate;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }
        setContentView(R.layout.activity_splash);
        TextView textView = findViewById(R.id.procreate);

        Animation myAnim = AnimationUtils.loadAnimation(this,R.anim.texttransition);
        Animation mytranslate = AnimationUtils.loadAnimation(this,R.anim.texttranslateup);
        textView.setAnimation(myAnim);
        textView.setAnimation(mytranslate);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this,MainActivity.class);
                startActivity(intent);
            }
        },6000);

    }
}
