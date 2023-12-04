package org.pattersonclippers.myquest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView QuestionTB;

    Button  TrueTB;

    Button  FalseTB;

    Button NextPC;

    Question q1,q2,q3,q4,q5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       QuestionTB = (TextView) findViewById(R.id.QuestionBT);

       TrueTB = (Button) findViewById(R.id.TrueTB);

       FalseTB = (Button) findViewById(R.id.FalseTB);

       NextPC = (Button) findViewById(R.id.NextPC);

       q1 = new Question("Are all fruits Sweet?", false);
       q2 = new Question("Do fruits come from animals?",false);
       q3 = new Question("Do all fruits come from seeds", true);
       q4 = new Question("Can fruits be cooked?", true);
       q5 = new Question("Can fruits be modified?", true);

       TrueTB.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               CharSequence incorrect = "Your a fool XD";
               int duration = Toast.LENGTH_SHORT;
               Toast toast = Toast.makeText(getApplicationContext() /* MyActivity */, incorrect, duration);
               toast.show();
           }
       });
       FalseTB.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               CharSequence correct = "Your a smart person";
               int duration = Toast.LENGTH_SHORT;
               Toast toast = Toast.makeText(getApplicationContext() /* MyActivity */, correct, duration);
               toast.show();
           }
       });

       NextPC.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

           }
       });
    }


}