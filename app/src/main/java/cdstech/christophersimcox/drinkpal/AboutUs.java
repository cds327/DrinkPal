package cdstech.christophersimcox.drinkpal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AboutUs extends AppCompatActivity {
    Button backToMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        backToMenu = (Button) findViewById(R.id.mainMenu);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Email: cds327@nau.edu", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        backToMenu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent switchMe = new Intent(AboutUs.this, WelcomeScreen.class);
                startActivity(switchMe);
                finish();
            }
        });
    }

}
