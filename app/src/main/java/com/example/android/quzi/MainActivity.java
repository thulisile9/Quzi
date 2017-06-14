package com.example.android.quzi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void openSports(View v){
        Intent sports = new Intent(this,SportActivity.class);
        startActivity(sports);


    }
    public void openMusic(View v){
        Intent music = new Intent(this,MusicActivity.class);
        startActivity(music);
    }

    public void openPolitics(View v){
        Intent politics = new Intent(this,PoliticsActivity.class);
        startActivity(politics);
    }
}
