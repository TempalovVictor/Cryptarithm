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

        int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18;

        EditText et1 = (EditText) findViewById(R.id.etn1_5);
        EditText et2 = (EditText) findViewById(R.id.etn2_2);
        EditText et3 = (EditText) findViewById(R.id.etn3_6);
        EditText et4 = (EditText) findViewById(R.id.etn4_4);
        EditText et5 = (EditText) findViewById(R.id.etn5_8);
        EditText et6 = (EditText) findViewById(R.id.etn6_5);
        EditText et7 = (EditText) findViewById(R.id.etn7_1);
        EditText et8 = (EditText) findViewById(R.id.etn8_9);
        EditText et9 = (EditText) findViewById(R.id.etn9_7);
        EditText et10 = (EditText) findViewById(R.id.etn10_4);
        EditText et11 = (EditText) findViewById(R.id.etn11_8);
        EditText et12 = (EditText) findViewById(R.id.etn12_5);
        EditText et13 = (EditText) findViewById(R.id.etn13_7);
        EditText et14 = (EditText) findViewById(R.id.etn14_2);
        EditText et15 = (EditText) findViewById(R.id.etn15_3);
        EditText et16 = (EditText) findViewById(R.id.etn16_9);
        EditText et17 = (EditText) findViewById(R.id.etn17_7);
        EditText et18 = (EditText) findViewById(R.id.etn18_0);

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
        n13 = (et13.getText() == null || et13.getText().toString().equals("")) ? 0 : Integer.parseInt(et13.getText().toString());
        n14 = (et14.getText() == null || et14.getText().toString().equals("")) ? 0 : Integer.parseInt(et14.getText().toString());
        n15 = (et15.getText() == null || et15.getText().toString().equals("")) ? 0 : Integer.parseInt(et15.getText().toString());
        n16 = (et16.getText() == null || et16.getText().toString().equals("")) ? 0 : Integer.parseInt(et16.getText().toString());
        n17 = (et17.getText() == null || et17.getText().toString().equals("")) ? 0 : Integer.parseInt(et17.getText().toString());
        n18 = (et18.getText() == null || et18.getText().toString().equals("")) ? 0 : Integer.parseInt(et18.getText().toString());

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
                (et12.getText() == null || et12.getText().toString().equals("")) ||
                (et13.getText() == null || et13.getText().toString().equals("")) ||
                (et14.getText() == null || et14.getText().toString().equals("")) ||
                (et15.getText() == null || et15.getText().toString().equals("")) ||
                (et16.getText() == null || et16.getText().toString().equals("")) ||
                (et17.getText() == null || et17.getText().toString().equals("")) ||
                (et18.getText() == null || et18.getText().toString().equals(""))) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    error, Toast.LENGTH_SHORT);
            toast.show();
        } else if (n1 == 5 & n2 == 2 & n3 == 6 & n4 == 4 & n5 == 8 & n6 == 5 & n7 == 1 & n8 == 9 & n9 == 7 & n10 == 4 & n11 == 8 & n12 == 5 & n13 == 7 & n14 == 2 & n15 == 3 & n16 == 9 & n17 == 7 & n18 == 0) {
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

        EditText et1 = (EditText) findViewById(R.id.etn1_5);
        EditText et2 = (EditText) findViewById(R.id.etn2_2);
        EditText et3 = (EditText) findViewById(R.id.etn3_6);
        EditText et4 = (EditText) findViewById(R.id.etn4_4);
        EditText et5 = (EditText) findViewById(R.id.etn5_8);
        EditText et6 = (EditText) findViewById(R.id.etn6_5);
        EditText et7 = (EditText) findViewById(R.id.etn7_1);
        EditText et8 = (EditText) findViewById(R.id.etn8_9);
        EditText et9 = (EditText) findViewById(R.id.etn9_7);
        EditText et10 = (EditText) findViewById(R.id.etn10_4);
        EditText et11 = (EditText) findViewById(R.id.etn11_8);
        EditText et12 = (EditText) findViewById(R.id.etn12_5);
        EditText et13 = (EditText) findViewById(R.id.etn13_7);
        EditText et14 = (EditText) findViewById(R.id.etn14_2);
        EditText et15 = (EditText) findViewById(R.id.etn15_3);
        EditText et16 = (EditText) findViewById(R.id.etn16_9);
        EditText et17 = (EditText) findViewById(R.id.etn17_7);
        EditText et18 = (EditText) findViewById(R.id.etn18_0);

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
        et13.setText(null);
        et14.setText(null);
        et15.setText(null);
        et16.setText(null);
        et17.setText(null);
        et18.setText(null);
    }
}