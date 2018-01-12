package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int totalWicketsTeamA = 0;
    int totalWicketsTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0,0);
        displayForTeamB(0,0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score, int wickets) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score)+" - "+String.valueOf(wickets));
    }

    public void displayForTeamB(int score, int wickets) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score)+" - "+String.valueOf(wickets));
    }

    public void singleRunTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA, totalWicketsTeamA);
    }

    public void fourRunsTeamA(View view){
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA, totalWicketsTeamA);
    }

    public void sixRunsTeamA(View view){
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA, totalWicketsTeamA);
    }

    public void wicketsTeamA(View view){
        totalWicketsTeamA = totalWicketsTeamA+1;
        displayForTeamA(scoreTeamA, totalWicketsTeamA);
    }

    public void singleRunTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB, totalWicketsTeamB);
    }

    public void fourRunsTeamB(View view){
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB(scoreTeamB, totalWicketsTeamB);
    }

    public void sixRunsTeamB(View view){
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB, totalWicketsTeamB);
    }

    public void wicketsTeamB(View view){
        totalWicketsTeamB = totalWicketsTeamB + 1;
        displayForTeamB(scoreTeamB, totalWicketsTeamB);
    }
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        totalWicketsTeamB = 0;
        totalWicketsTeamA = 0;
        displayForTeamB(scoreTeamB, totalWicketsTeamB);
        displayForTeamA(scoreTeamA, totalWicketsTeamA);
    }

}
