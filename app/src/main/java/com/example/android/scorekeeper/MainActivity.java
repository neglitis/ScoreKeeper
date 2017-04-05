package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int statsTeamA3pts = 0;
    int statsTeamA2pts = 0;
    int statsTeamA1pt = 0;
    int statsTeamB3pts = 0;
    int statsTeamB2pts = 0;
    int statsTeamB1pt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Display score - Team A
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Display score - Team B
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Display stats - Team A - 3 PTS
     */
    public void displayStatsTeamA3pts(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_stats_3pts);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Display stats - Team A - 2 PTS
     */
    public void displayStatsTeamA2pts(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_stats_2pts);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Display stats - Team A - 1 PT
     */
    public void displayStatsTeamA1pt(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_stats_1pt);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Display stats - Team B - 3 PTS
     */
    public void displayStatsTeamB3pts(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_stats_3pts);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Display stats - Team B - 2 PTS
     */
    public void displayStatsTeamB2pts(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_stats_2pts);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Display stats Team B - 1 PT
     */
    public void displayStatsTeamB1pt(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_stats_1pt);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Adds 3 points to Team A.
     */
    public void add3PointsTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        statsTeamA3pts = statsTeamA3pts + 1;
        displayForTeamA(scoreTeamA);
        displayStatsTeamA3pts(statsTeamA3pts);
    }
    /**
     * Adds 2 points to Team A.
     */
    public void add2PointsTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        statsTeamA2pts = statsTeamA2pts + 1;
        displayForTeamA(scoreTeamA);
        displayStatsTeamA2pts(statsTeamA2pts);
    }
    /**
     * Adds 1 points to Team A.
     */
    public void add1PointTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
       statsTeamA1pt = statsTeamA1pt + 1;
        displayForTeamA(scoreTeamA);
        displayStatsTeamA1pt(statsTeamA1pt);
    }
    /**
     * Adds 3 points to Team B & adds 1 to 3pts stats
     */
    public void add3PointsTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        statsTeamB3pts = statsTeamB3pts + 1;
        displayForTeamB(scoreTeamB);
        displayStatsTeamB3pts(statsTeamB3pts);
    }
    /**
     * Adds 2 points to Team B.
     */
    public void add2PointsTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        statsTeamB2pts = statsTeamB2pts + 1;
        displayForTeamB(scoreTeamB);
        displayStatsTeamB2pts(statsTeamB2pts);
    }
    /**
     * Adds 1 points to Team B.
     */
    public void add1PointTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        statsTeamB1pt = statsTeamB1pt + 1;
        displayForTeamB(scoreTeamB);
        displayStatsTeamB1pt(statsTeamB1pt);
    }
    /**
     * Resets Score & Stats for Team A & Team B.
     */
    public void resetCounterAB(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        statsTeamA3pts = 0;
        statsTeamA2pts = 0;
        statsTeamA1pt = 0;
        statsTeamB3pts = 0;
        statsTeamB2pts = 0;
        statsTeamB1pt = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayStatsTeamA3pts(statsTeamA3pts);
        displayStatsTeamA2pts(statsTeamA2pts);
        displayStatsTeamA1pt(statsTeamA1pt);
        displayStatsTeamB3pts(statsTeamB3pts);
        displayStatsTeamB2pts(statsTeamB2pts);
        displayStatsTeamB1pt(statsTeamB1pt);
    }
}