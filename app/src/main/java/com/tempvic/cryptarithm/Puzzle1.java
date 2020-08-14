package com.tempvic.cryptarithm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Puzzle1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle1);
    }

    public void checkResult(View view) {

        String wrong = "Wrong answer! Try again.";
        String correct = "Congratulations! That's the right decision.";
        String error = "Enter all numbers!";

        int n1, n2, n3, n4, n5, n6, n7, n8, n9;

        EditText et1 = (EditText) findViewById(R.id.etn1);
        EditText et2 = (EditText) findViewById(R.id.etn2);
        EditText et3 = (EditText) findViewById(R.id.etn3);
        EditText et4 = (EditText) findViewById(R.id.etn4);
        EditText et5 = (EditText) findViewById(R.id.etn5);
        EditText et6 = (EditText) findViewById(R.id.etn6);
        EditText et7 = (EditText) findViewById(R.id.etn7);
        EditText et8 = (EditText) findViewById(R.id.etn8);
        EditText et9 = (EditText) findViewById(R.id.etn9);

        n1 = (et1.getText() == null || et1.getText().toString().equals("")) ? 0 : Integer.parseInt(et1.getText().toString());
        n2 = (et2.getText() == null || et2.getText().toString().equals("")) ? 0 : Integer.parseInt(et2.getText().toString());
        n3 = (et3.getText() == null || et3.getText().toString().equals("")) ? 0 : Integer.parseInt(et3.getText().toString());
        n4 = (et4.getText() == null || et4.getText().toString().equals("")) ? 0 : Integer.parseInt(et4.getText().toString());
        n5 = (et5.getText() == null || et5.getText().toString().equals("")) ? 0 : Integer.parseInt(et5.getText().toString());
        n6 = (et6.getText() == null || et6.getText().toString().equals("")) ? 0 : Integer.parseInt(et6.getText().toString());
        n7 = (et7.getText() == null || et7.getText().toString().equals("")) ? 0 : Integer.parseInt(et7.getText().toString());
        n8 = (et8.getText() == null || et8.getText().toString().equals("")) ? 0 : Integer.parseInt(et8.getText().toString());
        n9 = (et9.getText() == null || et9.getText().toString().equals("")) ? 0 : Integer.parseInt(et9.getText().toString());

        if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0 || n6 == 0 || n7 == 0 || n8 == 0 || n9 == 0) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    error, Toast.LENGTH_SHORT);
            toast.show();
        } else if (n1 == 1 & n2 == 2 & n3 == 3 & n4 == 4 & n5 == 5 & n6 == 6 & n7 == 7 & n8 == 8 & n9 == 9) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    correct, Toast.LENGTH_SHORT);
            toast.show();
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    wrong, Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}