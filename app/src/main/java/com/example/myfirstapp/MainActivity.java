package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText var1;
    EditText var2;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        var1 = (EditText) findViewById(R.id.var1);
        var2 = (EditText) findViewById(R.id.var2);
        result = (TextView) findViewById(R.id.result1);
        calculate = (Button) findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(String.valueOf(var1.getText()));
                int y = Integer.parseInt(String.valueOf(var2.getText()));
                result.setText(String.valueOf(x+y));

                Intent i = new Intent(MainActivity.this, secondActivity.class);
                startActivity(i);
            }
        });

        //Go to Second activity


    }

}