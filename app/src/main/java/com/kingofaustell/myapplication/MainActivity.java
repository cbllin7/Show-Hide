package com.kingofaustell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView Star = (ImageView) findViewById(R.id.Star);

    public void Hide(View view){
            Star.setVisibility(view.INVISIBLE);
        }
        public void Show(View view){
            Star.setVisibility(view.VISIBLE);
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
