package com.firtstprojectsuvojitsarker.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView imageView;
    Animation animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);
        animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoom_in );

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //animation code here
                imageView.startAnimation(animation);
            }
        });





    }
}