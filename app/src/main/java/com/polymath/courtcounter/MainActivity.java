package com.polymath.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void resetButton(View view)
    {
        scoreTeamA=scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamA (View view)
    {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamB (View view)
    {
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamA (View view)
    {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamB (View view)
    {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }

    public void addThreeForTeamA (View view)
    {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamB (View view)
    {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA (int score)
    {
        TextView scoreview = (TextView) findViewById(R.id.team_a_score);
        scoreview.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score)
    {
        TextView scoreview  = (TextView) findViewById(R.id.team_b_score);
        scoreview.setText(String.valueOf(score));
    }
}