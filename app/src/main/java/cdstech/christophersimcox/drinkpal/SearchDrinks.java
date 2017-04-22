package cdstech.christophersimcox.drinkpal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class SearchDrinks extends AppCompatActivity {
    Button backToMenu;
    EditText searchBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_drinks);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        backToMenu = (Button) findViewById(R.id.mainMenu);
        searchBox = (EditText) findViewById(R.id.searchBox);
        searchBox.setCompoundDrawables(null, null, getResources().getDrawable(R.drawable.ic_search_black_24dp), null);

        backToMenu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent switchMe = new Intent(SearchDrinks.this, WelcomeScreen.class);
                startActivity(switchMe);
                finish();
            }
        });

    }

}
