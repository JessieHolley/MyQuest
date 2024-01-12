package org.pattersonclippers.myquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ScoreActivity extends AppCompatActivity {
    TextView scoreFTV;

    EditText nameET;

    Button highBT;

    FirebaseDatabase database;

    DatabaseReference myRef;

    HighScore myHS;

    String myName;

    Intent myIntent;

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        scoreFTV = (TextView) findViewById(R.id.scoreF);
        nameET = (EditText) findViewById(R.id.NameET);
        highBT = (Button) findViewById(R.id.HighBT);
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("My score");


        myIntent = getIntent();
        score = myIntent.getIntExtra("score", 0);
        scoreFTV.setText(""+score);


        highBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myName = nameET.getText().toString();
                myHS = new HighScore(score, myName);
                myRef.setValue(myHS);
            }
        });
    }
}