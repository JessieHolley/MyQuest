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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       QuestionTB = (TextView) findViewById(R.id.QuestionBT);

       TrueTB = (Button) findViewById(R.id.TrueTB);

       FalseTB = (Button) findViewById(R.id.FalseTB);

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
    }


}