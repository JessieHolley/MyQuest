package org.pattersonclippers.myquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
    TextView scoreFTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        scoreFTV = (TextView) findViewById(R.id.scoreF);


        Intent myIntent = getIntent();
        int score = myIntent.getIntExtra("score", 0);
        scoreFTV.setText(""+score);
    }
}