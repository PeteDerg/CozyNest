//Code is written by Petr Dergachev S103281
package com.example.lsbfapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Find the Start and Exit buttons by their IDs
        Button startButton = findViewById(R.id.start_button);
        Button exitButton = findViewById(R.id.exit_button);

        // Set an OnClickListener for the Start button to navigate to MainActivity
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start MainActivity
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
                finish();  // Close WelcomeActivity so it won't be accessible via the back button
            }
        });

        // Set an OnClickListener for the Exit button to close the app
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();  // Close all activities and exit the app
            }
        });
    }
}
