package com.example.smartphone_application_assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.smartphone_application_assignment2.MainActivity;

public class Second_page extends AppCompatActivity {

    SeekBar seekBarVolume;
    RatingBar ratingBar;
    Switch switchHighQuality;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        seekBarVolume = findViewById(R.id.seekBarVolume);
        ratingBar = findViewById(R.id.ratingBar);
        switchHighQuality = findViewById(R.id.switchHighQuality);
        backButton = findViewById(R.id.backButton);

        // Handle SeekBar
        seekBarVolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(Second_page.this, "Volume: " + progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });

        // Handle RatingBar
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(Second_page.this, "Rating: " + rating, Toast.LENGTH_SHORT).show();
            }
        });

        // Handle Switch
        switchHighQuality.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(Second_page.this, "High Quality Mode Enabled", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Second_page.this, "High Quality Mode Disabled", Toast.LENGTH_SHORT).show();
            }
        });

        // Handle Back Button to navigate to the first activity
        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(Second_page.this, MainActivity.class);
            startActivity(intent);  // Start the MainActivity
            finish();  // Optional: Close SecondActivity
        });
    }
}