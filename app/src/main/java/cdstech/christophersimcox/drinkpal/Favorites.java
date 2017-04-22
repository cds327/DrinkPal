package cdstech.christophersimcox.drinkpal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Favorites extends AppCompatActivity {
    Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        backButton = (Button) findViewById(R.id.mainMenu);


        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent switchMe = new Intent(Favorites.this, WelcomeScreen.class);
                startActivity(switchMe);
                finish();
            }
        });
    }

}
