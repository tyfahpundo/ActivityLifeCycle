package com.afrosoft.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowGuess extends AppCompatActivity {
    private TextView showGuessTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_guess);
        showGuessTextView = findViewById(R.id.received_textView);

        if(getIntent().getStringExtra("guess")!= null){
            showGuessTextView.setText(getIntent().getStringExtra("guess"));
        }

    }
}