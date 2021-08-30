package com.kompellaaditya.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button incrementButton;
    TextView greetingDisplay;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        incrementButton = findViewById(R.id.increment_button);
        greetingDisplay = findViewById(R.id.greeting_textview);
    }
    public void increment(View view) {
        greetingDisplay.setText("Too bad buddy there are no hints");
    }

    public void decrement(View view) {
        System.out.println("decrementing: " + --count);
        greetingDisplay.setText("I don't have time to prove you wrong :(");
    }

    public void congrats(View view) {
        greetingDisplay.setText("Congratulations You Won!");
    }

    public void wrong(View view) {
        greetingDisplay.setText("Wow you're bad at this!");
    }



}