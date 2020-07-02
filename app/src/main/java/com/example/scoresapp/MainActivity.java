package com.example.scoresapp;

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
    int scoreTeamA = 0;
    int scoreTeamB = 0;


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreePointsA(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoPointsA(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void addFreeThrowA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void addThreePointsB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoPointsB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void addFreeThrowB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}

