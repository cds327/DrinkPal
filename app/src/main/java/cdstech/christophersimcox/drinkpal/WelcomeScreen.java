package cdstech.christophersimcox.drinkpal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

/**
 * Created by christophersimcox on 2/13/17.
 */

public class WelcomeScreen extends AppCompatActivity{
    Button searchDrinks;
    Button commonDrinks;
    Button manageFavorites;
    Button options;
    Button aboutUS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        searchDrinks = (Button) findViewById(R.id.searchDrinks);
        commonDrinks = (Button) findViewById(R.id.commonDrinks);
        manageFavorites = (Button) findViewById(R.id.favs);
        options = (Button) findViewById(R.id.options);
        aboutUS = (Button) findViewById(R.id.aboutUS);

        searchDrinks.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent switchMe = new Intent(WelcomeScreen.this, SearchDrinks.class);
                startActivity(switchMe);
                finish();
            }
        });

        commonDrinks.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent switchMe = new Intent(WelcomeScreen.this, CommonDrinks.class);
                startActivity(switchMe);
                finish();
            }
        });

        manageFavorites.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent switchMe = new Intent(WelcomeScreen.this, Favorites.class);
                startActivity(switchMe);
                finish();
            }
        });

        options.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent switchMe = new Intent(WelcomeScreen.this, Options.class);
                startActivity(switchMe);
                finish();
            }
        });

        aboutUS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent switchMe = new Intent(WelcomeScreen.this, AboutUs.class);
                startActivity(switchMe);
                finish();
            }
        });

    }


}
