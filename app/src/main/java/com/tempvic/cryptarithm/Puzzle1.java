package com.tempvic.cryptarithm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class Puzzle1 extends AppCompatActivity {

    private int seconds = 0;
    private boolean running;
    private boolean wasRunning;
    private boolean isTimerOn = false;
    private int count = 0;
    ArrayList<EditText> emptyList = new ArrayList<>();
    ArrayList<EditText> startList = new ArrayList<>();

    ImageButton clearIb;
    ImageButton checkIb;
    ImageButton startIb;
    ImageButton resetIb;
    boolean isPressed = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle1);

        if (savedInstanceState != null) {
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }
        runTimer();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (wasRunning) {
            running = true;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        wasRunning = running;
        running = false;
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.putBoolean("running", running);
        savedInstanceState.putBoolean("wasRunning", wasRunning);
    }

    public void onClickStartPause(View view) {
        startIb = (ImageButton)findViewById(R.id.startPause);
        startIb.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {

                    case MotionEvent.ACTION_DOWN:
                        startIb.setImageResource(R.drawable.start_pause);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.performClick();
                        startIb.setImageResource(R.drawable.start_pause_shadow);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        if (!isTimerOn) {
            running = true;
            isTimerOn = true;
        } else {
            running = false;
            isTimerOn = false;
        }
    }

    public void onClickReset(View view) {
        running = false;
        isTimerOn = false;
        seconds = 0;

        resetIb = (ImageButton)findViewById(R.id.resetNew);
        resetIb.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {

                    case MotionEvent.ACTION_DOWN:
                        resetIb.setImageResource(R.drawable.reset);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.performClick();
                        resetIb.setImageResource(R.drawable.reset_shadow);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    }

    private void runTimer() {
        final TextView timeView = (TextView) findViewById(R.id.time_view);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds / 3600;
                int minutes = (seconds % 3600) / 60;
                int secs = seconds % 60;
                String time = String.format(Locale.getDefault(),
                        "%d:%02d:%02d", hours, minutes, secs);
                timeView.setText(time);
                if (running) {
                    seconds++;
                }
                handler.postDelayed(this, 0);
            }
        });
    }

    public void checkResult(View view) {

        String wrong = "Wrong answer! Try again.";
        String correct = "Congratulations! That's the right decision.";
        String error = "Enter all numbers!";

        int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18;

        EditText et1 = findViewById(R.id.etn1_5);
        EditText et2 = findViewById(R.id.etn2_2);
        EditText et3 = findViewById(R.id.etn3_6);
        EditText et4 = findViewById(R.id.etn4_4);
        EditText et5 = findViewById(R.id.etn5_8);
        EditText et6 = findViewById(R.id.etn6_5);
        EditText et7 = findViewById(R.id.etn7_1);
        EditText et8 = findViewById(R.id.etn8_9);
        EditText et9 = findViewById(R.id.etn9_7);
        EditText et10 = findViewById(R.id.etn10_4);
        EditText et11 = findViewById(R.id.etn11_8);
        EditText et12 = findViewById(R.id.etn12_5);
        EditText et13 = findViewById(R.id.etn13_7);
        EditText et14 = findViewById(R.id.etn14_2);
        EditText et15 = findViewById(R.id.etn15_3);
        EditText et16 = findViewById(R.id.etn16_9);
        EditText et17 = findViewById(R.id.etn17_7);
        EditText et18 = findViewById(R.id.etn18_0);

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

        checkIb = (ImageButton)findViewById(R.id.check);
        checkIb.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {

                    case MotionEvent.ACTION_DOWN:
                        checkIb.setImageResource(R.drawable.check);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.performClick();
                        checkIb.setImageResource(R.drawable.check_shadow);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    }

    public void clearNumbers(View view) {

        EditText et1 = findViewById(R.id.etn1_5);
        EditText et2 = findViewById(R.id.etn2_2);
        EditText et3 = findViewById(R.id.etn3_6);
        EditText et4 = findViewById(R.id.etn4_4);
        EditText et5 = findViewById(R.id.etn5_8);
        EditText et6 = findViewById(R.id.etn6_5);
        EditText et7 = findViewById(R.id.etn7_1);
        EditText et8 = findViewById(R.id.etn8_9);
        EditText et9 = findViewById(R.id.etn9_7);
        EditText et10 = findViewById(R.id.etn10_4);
        EditText et11 = findViewById(R.id.etn11_8);
        EditText et12 = findViewById(R.id.etn12_5);
        EditText et13 = findViewById(R.id.etn13_7);
        EditText et14 = findViewById(R.id.etn14_2);
        EditText et15 = findViewById(R.id.etn15_3);
        EditText et16 = findViewById(R.id.etn16_9);
        EditText et17 = findViewById(R.id.etn17_7);
        EditText et18 = findViewById(R.id.etn18_0);

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

        clearIb = (ImageButton)findViewById(R.id.clear);
        clearIb.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {

                    case MotionEvent.ACTION_DOWN:
                        clearIb.setImageResource(R.drawable.clear);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.performClick();
                        clearIb.setImageResource(R.drawable.clear_shadow);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    }

    public void takeHint(View view) {

        String er1 = "Колличество подсказок закончилось :(";
        String er2 = "Ошибка. Все поля заполнены!";

        int[] res = {5, 2, 6, 4, 8, 5, 1, 9, 7, 4, 8, 5, 7, 2, 3, 9, 7, 0};

        //ArrayList<EditText> emptyList = new ArrayList<>();

        //ArrayList<EditText> startList = new ArrayList<>();
        startList.add((EditText) findViewById(R.id.etn1_5));
        startList.add((EditText) findViewById(R.id.etn2_2));
        startList.add((EditText) findViewById(R.id.etn3_6));
        startList.add((EditText) findViewById(R.id.etn4_4));
        startList.add((EditText) findViewById(R.id.etn5_8));
        startList.add((EditText) findViewById(R.id.etn6_5));
        startList.add((EditText) findViewById(R.id.etn7_1));
        startList.add((EditText) findViewById(R.id.etn8_9));
        startList.add((EditText) findViewById(R.id.etn9_7));
        startList.add((EditText) findViewById(R.id.etn10_4));
        startList.add((EditText) findViewById(R.id.etn11_8));
        startList.add((EditText) findViewById(R.id.etn12_5));
        startList.add((EditText) findViewById(R.id.etn13_7));
        startList.add((EditText) findViewById(R.id.etn14_2));
        startList.add((EditText) findViewById(R.id.etn15_3));
        startList.add((EditText) findViewById(R.id.etn16_9));
        startList.add((EditText) findViewById(R.id.etn17_7));
        startList.add((EditText) findViewById(R.id.etn18_0));

        if (count <= 2) {
            for (EditText et : startList) {
                if (et.getText() == null || et.getText().toString().equals("")) {
                    emptyList.add(et);
                }
            }
            if (emptyList.isEmpty()) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        er2, Toast.LENGTH_SHORT);
                toast.show();
            } else {
                final int min = 0;
                final int max = 17;
                final int random = new Random().nextInt((max - min) + 1) + min;
                if (startList.get(random).getText() == null ||
                        startList.get(random).getText().toString().equals("")) {
                    startList.get(random).setText(Integer.toString(res[random]));
                    count++;
                }
            }
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    er1, Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}