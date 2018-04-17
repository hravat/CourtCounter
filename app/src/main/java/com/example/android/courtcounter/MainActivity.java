package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */

    int scoreA = 0;

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void addThreePointsA(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);

    }


    public void addTwoPointsA(View view) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);

    }


    public void addFreeThrowA(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);

    }


    int scoreB = 0;

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void addThreePointsB(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);

    }


    public void addTwoPointsB(View view) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);

    }


    public void addFreeThrowB(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);

    }



    public void scoreReset(View view) {
        scoreB = 0;
        scoreA = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);

    }

}
