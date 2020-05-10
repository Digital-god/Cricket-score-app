package com.example.android.cricketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int startingScoreAlpha = 0;
    int wicketAlpha = 0;

    public void TeamAlphaScoreSix(View view){
        startingScoreAlpha+=6;
        TeamAlpha(startingScoreAlpha,wicketAlpha);
    }

    public void TeamAlphaScoreFour(View view){
        startingScoreAlpha+=4;
        TeamAlpha(startingScoreAlpha,wicketAlpha);
    }

    public void TeamAlphaScoreSingle(View view){
        startingScoreAlpha+=1;
        TeamAlpha(startingScoreAlpha,wicketAlpha);
    }

    public void TeamAlphaScoreWicket(View view){
        wicketAlpha+=1;
        TeamAlpha(startingScoreAlpha,wicketAlpha);
    }
    private void TeamAlpha(int startingScoreAlpha, int wicketAlpha) {
        TextView quantityTextView = findViewById(R.id.TeamAlphascore);
        quantityTextView.setText(startingScoreAlpha + "-" + wicketAlpha);
    }
    int startingScoreBeta=0;
    int wicketBeta=0;

    public void TeamBetaScoreSix(View view){
        startingScoreBeta+=6;
        TeamBeta(startingScoreBeta,wicketBeta);
    }

    public void TeamBetaScoreFour(View view){
        startingScoreBeta+=4;
        TeamBeta(startingScoreBeta,wicketBeta);
    }

    public void TeamBetaScoreSingle(View view){
        startingScoreBeta+=1;
        TeamBeta(startingScoreBeta,wicketBeta);
    }

    public void TeamBetaScoreWicket(View view){
        wicketBeta+=1;
        TeamBeta(startingScoreBeta,wicketBeta);
    }
    private void TeamBeta(int startingScoreBeta, int wicketBeta) {
        TextView quantityTextView = findViewById(R.id.BetaScore);
        quantityTextView.setText(startingScoreBeta + "-" + wicketBeta);
    }
    public void resetscore(View view){
        startingScoreAlpha=0;
        startingScoreBeta=0;
        wicketAlpha=0;
        wicketBeta=0;
        TeamAlpha(0,0);
        TeamBeta(0,0);
    }

}
