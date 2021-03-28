package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText var1;
    EditText var2;
    EditText address;
    ImageButton search;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        var1 = (EditText) findViewById(R.id.var1);
        var2 = (EditText) findViewById(R.id.var2);
        result = (TextView) findViewById(R.id.result1);
        calculate = (Button) findViewById(R.id.calculate);
        address  = (EditText) findViewById(R.id.address);
        search = (ImageButton) findViewById(R.id.search);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(String.valueOf(var1.getText()));
                int y = Integer.parseInt(String.valueOf(var2.getText()));
                int z = x+y;
                result.setText(String.valueOf(x+y));

                Intent i = new Intent(MainActivity.this, secondActivity.class);
                i.putExtra("result", z);
                startActivity(i);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = address.getText().toString();
                Uri uri = Uri.parse(url);

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        //Go to Second activity


    }

}