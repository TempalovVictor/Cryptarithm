package com.tempvic.cryptarithm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Puzzle3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle3);
    }

    public void checkResult(View view) {

        String wrong = "Wrong answer! Try again.";
        String correct = "Congratulations! That's the right decision.";
        String error = "Enter all numbers!";

        int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12;

        EditText et1 = (EditText) findViewById(R.id.p3_etn1_6);
        EditText et2 = (EditText) findViewById(R.id.p3_etn2_6);
        EditText et3 = (EditText) findViewById(R.id.p3_etn3_6);
        EditText et4 = (EditText) findViewById(R.id.p3_etn4_9);
        EditText et5 = (EditText) findViewById(R.id.p3_etn5_3);
        EditText et6 = (EditText) findViewById(R.id.p3_etn6_6);
        EditText et7 = (EditText) findViewById(R.id.p3_etn7_4);
        EditText et8 = (EditText) findViewById(R.id.p3_etn8_1);
        EditText et9 = (EditText) findViewById(R.id.p3_etn9_0);
        EditText et10 = (EditText) findViewById(R.id.p3_etn10_0);
        EditText et11 = (EditText) findViewById(R.id.p3_etn11_3);
        EditText et12 = (EditText) findViewById(R.id.p3_etn12_0);

        n1 = (et1.getText() == null || et1.getText().toString().equals("")) ? 0 : Integer.parseInt(et1.getText().toString());
        n2 = (et2.getText() == null || et2.getText().toString().equals("")) ? 0 : Integer.parseInt(et2.getText().toString());
        n3 = (et3.getText() == null || et3.getText().toString().equals("")) ? 0 : Integer.parseInt(et3.getText().toString());
        n4 = (et4.getText() == null || et4.getText().toString().equals("")) ? 0 : Integer.parseInt(et4.getText().toString());
        n5 = (et5.getText() == null || et5.getText().toString().equals("")) ? 0 : Integer.parseInt(et5.getText().toString());
        n6 = (et6.getText() == null || et6.getText().toString().equals("")) ? 0 : Integer.parseInt(et6.getText().toString());
        n7 = (et7.getText() == null || et7.getText().toString().equals("")) ? 0 : Integer.parseInt(et7.getText().toString());
        n8 = (et8.getText() == null || et8.getText().toString().equals("")) ? 0 : Integer.parseInt(et8.getText().toString());
        n9 = (et9.getText() == null || et9.getText().toString().equals("")) ? 0 : Integer.parseInt(et9.getText().toString());
        n10 = (et10.getText() == null || et10.getText().toString().equals("")) ? 0 : Integer.parseInt(et10.getText().toString());
        n11 = (et11.getText() == null || et11.getText().toString().equals("")) ? 0 : Integer.parseInt(et11.getText().toString());
        n12 = (et12.getText() == null || et12.getText().toString().equals("")) ? 0 : Integer.parseInt(et12.getText().toString());

        if ((et1.getText() == null || et1.getText().toString().equals("")) ||
                (et2.getText() == null || et2.getText().toString().equals("")) ||
                (et3.getText() == null || et3.getText().toString().equals("")) ||
                (et4.getText() == null || et4.getText().toString().equals("")) ||
                (et5.getText() == null || et5.getText().toString().equals("")) ||
                (et6.getText() == null || et6.getText().toString().equals("")) ||
                (et7.getText() == null || et7.getText().toString().equals("")) ||
                (et8.getText() == null || et8.getText().toString().equals("")) ||
                (et9.getText() == null || et9.getText().toString().equals("")) ||
                (et10.getText() == null || et10.getText().toString().equals("")) ||
                (et11.getText() == null || et11.getText().toString().equals("")) ||
                (et12.getText() == null || et12.getText().toString().equals(""))) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    error, Toast.LENGTH_SHORT);
            toast.show();
        } else if (n1 == 6 & n2 == 6 & n3 == 6
                & n4 == 9 & n5 == 3 & n6 == 6 & n7 == 4
                & n8 == 1 & n9 == 0 & n10 == 0 & n11 == 3 & n12 == 0) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    correct, Toast.LENGTH_SHORT);
            toast.show();
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    wrong, Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void clearNumbers(View view) {

        EditText et1 = (EditText) findViewById(R.id.p3_etn1_6);
        EditText et2 = (EditText) findViewById(R.id.p3_etn2_6);
        EditText et3 = (EditText) findViewById(R.id.p3_etn3_6);
        EditText et4 = (EditText) findViewById(R.id.p3_etn4_9);
        EditText et5 = (EditText) findViewById(R.id.p3_etn5_3);
        EditText et6 = (EditText) findViewById(R.id.p3_etn6_6);
        EditText et7 = (EditText) findViewById(R.id.p3_etn7_4);
        EditText et8 = (EditText) findViewById(R.id.p3_etn8_1);
        EditText et9 = (EditText) findViewById(R.id.p3_etn9_0);
        EditText et10 = (EditText) findViewById(R.id.p3_etn10_0);
        EditText et11 = (EditText) findViewById(R.id.p3_etn11_3);
        EditText et12 = (EditText) findViewById(R.id.p3_etn12_0);

        et1.setText(null);
        et2.setText(null);
        et3.setText(null);
        et4.setText(null);
        et5.setText(null);
        et6.setText(null);
        et7.setText(null);
        et8.setText(null);
        et9.setText(null);
        et10.setText(null);
        et11.setText(null);
        et12.setText(null);
    }
}