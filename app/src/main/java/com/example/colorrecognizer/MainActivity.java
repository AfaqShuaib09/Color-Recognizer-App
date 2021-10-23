package com.example.colorrecognizer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView colName;
    Button button;
    Button btn_red, btn_blue, btn_dgreen, btn_purple, btn_yellow, btn_orange, btn_pink, btn_sblue, btn_brown, btn_green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colName=(TextView) findViewById(R.id.colName);
        btn_red = (Button) findViewById(R.id.button2);
        btn_blue = (Button) findViewById(R.id.button3);
        btn_dgreen = (Button) findViewById(R.id.button4);
        btn_purple = (Button) findViewById(R.id.button5);
        btn_yellow = (Button) findViewById(R.id.button6);
        btn_orange = (Button) findViewById(R.id.button7);
        btn_pink = (Button) findViewById(R.id.button8);
        btn_sblue = (Button) findViewById(R.id.button9);
        btn_brown = (Button) findViewById(R.id.button10);
        btn_green = (Button) findViewById(R.id.button11);

        btn_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colName.setBackgroundResource(R.color.red);
                colName.setText("Red");
            }
        });

        btn_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colName.setBackgroundResource(R.color.blue);
                colName.setText("Blue");
            }
        });

        btn_dgreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colName.setBackgroundResource(R.color.green);
                colName.setText("Green");

            }
        });

        btn_purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colName.setBackgroundResource(R.color.purple);
                colName.setText("Purple");
            }
        });

        btn_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colName.setBackgroundResource(R.color.yellow);
                colName.setText("Yellow");
            }
        });

        btn_orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colName.setBackgroundResource(R.color.orange);
                colName.setText("Orange");
            }
        });

        btn_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colName.setBackgroundResource(R.color.pink);
                colName.setText("Pink");
            }
        });

        btn_sblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colName.setBackgroundResource(R.color.lightblue);
                colName.setText("Sky Blue");
            }
        });

        btn_brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colName.setBackgroundResource(R.color.brown);
                colName.setText("Brown");
            }
        });

        btn_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colName.setBackgroundResource(R.color.lightgreen);
                colName.setText("Light Green");
            }
        });

    }
}