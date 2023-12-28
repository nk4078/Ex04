package com.example.ex04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        x = 0;
    }

    public void clicked(View view) {
        x = x + 1;
        btn1.setText("This is a click number: " + x);
        if (x == 7) {
            btn1.setText("Boom !");
        }
    }
}