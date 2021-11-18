package com.afrosoft.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button showGuess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showGuess = findViewById(R.id.button_guess);
        showGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ShowGuess.class);
                intent.putExtra("guess","Hello there....");

                startActivity(intent);
            }
        });


    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(MainActivity.this,"OnStart() called", Toast.LENGTH_LONG)
//                .show();
//    }
//
//    @Override
//    protected void onPostResume() {
//        super.onPostResume();
//        Toast.makeText(MainActivity.this,"OnResume() called", Toast.LENGTH_LONG)
//                .show();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(MainActivity.this,"OnPause() called", Toast.LENGTH_LONG)
//                .show();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(MainActivity.this,"OnStop() called", Toast.LENGTH_LONG)
//                .show();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(MainActivity.this,"OnDestroy() called", Toast.LENGTH_LONG)
//                .show();
//    }
}