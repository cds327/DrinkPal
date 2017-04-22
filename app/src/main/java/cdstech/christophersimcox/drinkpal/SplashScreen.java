package cdstech.christophersimcox.drinkpal;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class SplashScreen extends AppCompatActivity {

    // Time to show splash screen in milliseconds
    private static final long SPLASHTIME = 3000;
    public CountDownTimer timer;
    Button col1;
    Button col2;
    Button col3;
    Button col4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //col1 = (Button) findViewById(R.id.col1);

        //col1.setText("HI");

        // Create the countdown timer that will transition to the login activity
        createCountDownTimer(SPLASHTIME);
    }

    // Creates the timer that will display the next page when count down finishes
    private void createCountDownTimer(long timeToSet) {
        // If timer exists already, cancel it
        if (timer != null) {
            timer.cancel();
        }

        // Initialize count down timer with the appropriate methods
        timer = new CountDownTimer(timeToSet, 1000) {
            @Override
            // Timer tick method used to update the timer with every tick
            public void onTick(long millisUntilFinished) {
                // Do nothing
            }

            @Override
            // Finish method for timer. Transitions to login activity when finished
            public void onFinish() {
                Intent intent = new Intent(SplashScreen.this, WelcomeScreen.class);
                startActivity(intent);
                finish();
            }
        }.start();
    }
}

