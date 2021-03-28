package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intentThatStartedThis = getIntent();
        int result = intentThatStartedThis.getIntExtra("result", 0);
        resultTxt = (TextView) findViewById(R.id.result1);
        resultTxt.setText(String.valueOf(result));

    }
}