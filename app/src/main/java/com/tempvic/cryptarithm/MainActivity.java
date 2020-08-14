package com.tempvic.cryptarithm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openPuzzle1(View view) {
        Intent intent = new Intent(this, Puzzle1.class);
        startActivity(intent);
    }

    public void openPuzzle2(View view) {
        Intent intent = new Intent(this, Puzzle2.class);
        startActivity(intent);
    }

    public void openPuzzle3(View view) {
        Intent intent = new Intent(this, Puzzle3.class);
        startActivity(intent);
    }
}