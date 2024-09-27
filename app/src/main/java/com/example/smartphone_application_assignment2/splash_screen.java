package com.example.smartphone_application_assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Display splash screen for 3 seconds (3000 milliseconds)
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // After 3 seconds, start MainActivity
                Intent intent = new Intent(splash_screen.this, MainActivity.class);
                startActivity(intent);
                finish(); // Close SplashActivity so the user can't return to it
            }
        }, 3000); // 3000 milliseconds = 3 seconds
    }
}