package com.example.android.cricketscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int runTeamA = 0, wicketTeamA = 0, runTeamB = 0, wicketTeamB = 0, overTeamA1 = 0, overTeamA2 = 0, overTeamB1 = 0, overTeamB2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void scorePageTeamA(View v) {
        setContentView(R.layout.mainpageforteama);
    }

    public void scorePageTeamB(View v) {
        setContentView(R.layout.mainpageforteamb);
    }

    public void conclusion(View v) {
        setContentView(R.layout.final_score_page);
        displayFinalScores();
    }

    public void homePage(View v) {
        runTeamA = wicketTeamA = runTeamB = wicketTeamB = overTeamA1 = overTeamA2 = overTeamB1 = overTeamB2 = 0;
        setContentView(R.layout.activity_main);
    }

    /*
    Methods for Team A
     */

    public void changeOverTeamA() {
        if(overTeamA2==5)
        {
            overTeamA1++;
            overTeamA2 = 0;
        }
        else
            overTeamA2 ++;
    }
    public void dotTeamA(View v) {
        changeOverTeamA();
        displayScoreTeamA();
    }
    public void point1TeamA(View v) {
        runTeamA += 1;
        changeOverTeamA();
        displayScoreTeamA();
    }
    public void point2TeamA(View v) {
        runTeamA += 2;
        changeOverTeamA();
        displayScoreTeamA();
    }
    public void point3TeamA(View v) {
        runTeamA += 3;
        changeOverTeamA();
        displayScoreTeamA();
    }
    public void point4TeamA(View v) {
        runTeamA += 4;
        changeOverTeamA();
        displayScoreTeamA();
    }
    public void point6TeamA(View v) {
        runTeamA += 6;
        changeOverTeamA();
        displayScoreTeamA();
    }
    public void pointWideTeamA(View v) {
        runTeamA += 1;
        displayScoreTeamA();
    }
    public void scoreResetTeamA(View v) {
        runTeamA = overTeamA1 = overTeamA2 = wicketTeamA = 0;
        displayScoreTeamA();
    }
    public void outTeamA(View v) {
        wicketTeamA += 1;
        changeOverTeamA();
        displayScoreTeamA();
    }
    public void displayScoreTeamA() {
        TextView scoreTextView = (TextView) findViewById(R.id.team_a_score);
        TextView overTextView = (TextView) findViewById(R.id.team_a_over);
        scoreTextView.setText(runTeamA + "/" + wicketTeamA);
        overTextView.setText(overTeamA1 + "." + overTeamA2);
    }

    /*
    Methods for Team B
     */

    public void changeOverTeamB() {
        if(overTeamB2==5)
        {
            overTeamB1++;
            overTeamB2 = 0;
        }
        else
            overTeamB2 ++;
    }
    public void dotTeamB(View v) {
        changeOverTeamB();
        displayScoreTeamB();
    }
    public void point1TeamB(View v) {
        runTeamB += 1;
        changeOverTeamB();
        displayScoreTeamB();
    }
    public void point2TeamB(View v) {
        runTeamB += 2;
        changeOverTeamB();
        displayScoreTeamB();
    }
    public void point3TeamB(View v) {
        runTeamB += 3;
        changeOverTeamB();
        displayScoreTeamB();
    }
    public void point4TeamB(View v) {
        runTeamB += 4;
        changeOverTeamB();
        displayScoreTeamB();
    }
    public void point6TeamB(View v) {
        runTeamB += 6;
        changeOverTeamB();
        displayScoreTeamB();
    }
    public void pointWideTeamB(View v) {
        runTeamB += 1;
        displayScoreTeamB();
    }
    public void scoreResetTeamB(View v) {
        runTeamB = overTeamB1 = overTeamB2 = wicketTeamB = 0;
        displayScoreTeamB();
    }
    public void outTeamB(View v) {
        wicketTeamB++;
        changeOverTeamB();
        displayScoreTeamB();
    }
    void displayScoreTeamB() {
        TextView scoreTextView = (TextView) findViewById(R.id.team_b_score);
        TextView overTextView = (TextView) findViewById(R.id.team_b_over);
        scoreTextView.setText(runTeamB + "/" + wicketTeamB);
        overTextView.setText(overTeamB1 + "." + overTeamB2);
    }

    /*
    Method for siaplaying Final Score
     */

    void displayFinalScores() {
        TextView scoreATextView = (TextView) findViewById(R.id.final_team_a_score);
        TextView scoreBTextView = (TextView) findViewById(R.id.final_team_b_score);
        TextView winner = (TextView) findViewById(R.id.winner_team);
        scoreATextView.setText(runTeamA + "/" + wicketTeamA);
        scoreBTextView.setText(runTeamB + "/" + wicketTeamB);
        if(runTeamA < runTeamB)
            winner.setText("Team B wins!");
        else if(runTeamA == runTeamB)
            winner.setText("Draw!");
    }
}

