package org.pattersonclippers.myquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView QuestionTV;

    Button  TrueTB;

    Button  FalseTB;

    Button NextPC;

    Question q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,CurrentQ;

    int QuestionBT, finalScore;

    Question [] questions;
    CharSequence message;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       QuestionTV = (TextView) findViewById(R.id.QuestionBT);


       TrueTB = (Button) findViewById(R.id.TrueTB);

       FalseTB = (Button) findViewById(R.id.FalseTB);

       NextPC = (Button) findViewById(R.id.NextPC);

       q1 = new Question("Are all fruits Sweet?", false);

       q2 = new Question("Do fruits come from animals?",false);

       q3 = new Question("Do all fruits come from seeds", true);

       q4 = new Question("Can fruits be cooked?", true);

       q5 = new Question("Can fruits be modified?", true);

       q6 = new Question("Do all fruits comes from trees?",false);

       q7 = new Question("Is a carrot a fruit?", false);

       q8 = new Question("Is a tomato a fruit?", true);

       q9 = new Question("Can all fruits can expire?", true);

       q10 = new Question("Are lemons sweet?",false);

       CurrentQ = q1;

       QuestionBT = 0; finalScore = 0;

       questions = new Question[] {q1,q2,q3,q4,q5,q6,q7,q8,q9,q10};



       TrueTB.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (CurrentQ.getCorrectAns()==true){
                    message = "Right!";
                    finalScore += 1;
               } else {
                    message = "Wrong!";
            }

               int duration = Toast.LENGTH_SHORT;
               Toast toast = Toast.makeText(getApplicationContext() /* MyActivity */, message, duration);
               toast.show();
           }
       });
       FalseTB.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (CurrentQ.getCorrectAns()==false){
                   message = "Right!";
                   finalScore += 1;
               } else {
                   message = "Wrong!";
               }
               int duration = Toast.LENGTH_SHORT;
               Toast toast = Toast.makeText(getApplicationContext() /* MyActivity */, message, duration);
               toast.show();
           }
       });

       NextPC.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                if (QuestionBT < 9) {
                    QuestionBT ++;
                    CurrentQ = questions [QuestionBT];
                    QuestionTV.setText(CurrentQ.getQText());
                }

                else {
                    Intent myIntent=new Intent(MainActivity.this, ScoreActivity.class);
                    myIntent.putExtra("score", finalScore);
                    startActivity(myIntent);
                }



           }
       });

    }


}