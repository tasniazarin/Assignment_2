package com.example.smartphone_application_assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    CheckBox checkBoxBass, checkBoxTreble;
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        checkBoxBass = findViewById(R.id.checkBoxBass);
        checkBoxTreble = findViewById(R.id.checkBoxTreble);
        nextButton = findViewById(R.id.nextButton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Radio Button Selection
                int selectedRadioId = radioGroup.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = findViewById(selectedRadioId);
                String musicType = (selectedRadioButton != null) ? selectedRadioButton.getText().toString() : "None";

                // Handle Checkbox Selection
                boolean addBass = checkBoxBass.isChecked();
                boolean addTreble = checkBoxTreble.isChecked();

                // Show selected options (optional)
                Toast.makeText(MainActivity.this, "Music Type: " + musicType + "\nAdd Bass: " + addBass + "\nAdd Treble: " + addTreble, Toast.LENGTH_SHORT).show();

                // Navigate to the second activity
                Intent intent = new Intent(MainActivity.this,Second_page.class);
                startActivity(intent);
            }
        });
    }
}