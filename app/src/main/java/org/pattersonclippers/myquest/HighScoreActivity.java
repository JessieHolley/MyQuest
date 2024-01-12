package org.pattersonclippers.myquest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class HighScoreActivity extends AppCompatActivity {
    TextView nameTV, scoreTV;
    FirebaseDatabase database;
    DatabaseReference myRef;
    public final String TAG = "AAAAAAAAA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_score);
        nameTV = (TextView) findViewById(R.id.NewTV);
        scoreTV = (TextView) findViewById(R.id.NewTV2);
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("My score");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                HighScore value = dataSnapshot.getValue(HighScore.class);
                Log.d(TAG, "Value is: " + value);
                String name = value.getName();
                nameTV.setText(name);
                int score = value.getFinalScore();
                scoreTV.setText(""+score);
            }
            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
    }
}