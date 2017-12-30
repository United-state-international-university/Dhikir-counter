package com.example.android.courtcounter;

import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Vibrator vibrator;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
    }
    int dhikirA = 0;
    int scoreTeamB = 0;
    public void resetScore(View view) {
        dhikirA = 0;
        displayForTeamA(dhikirA);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.count);
        scoreView.setText(String.valueOf(score));
    }



    public void b3(View view)
    {
        if (dhikirA == 32 || dhikirA == 62 ||dhikirA == 98 ||dhikirA == 99 )
        {
            vibrator.vibrate(100);

        }
        dhikirA = dhikirA + 1;
        displayForTeamA(dhikirA);
    }
    /** second botton */


    public void a3(View view)
    {

        if (dhikirA <= 0)
        {
            Toast.makeText(this,"Cant do less than 1 Dhikr",Toast.LENGTH_SHORT).show();
            return;
        }

        dhikirA = dhikirA - 1;
        displayForTeamA(dhikirA);
    }

}
