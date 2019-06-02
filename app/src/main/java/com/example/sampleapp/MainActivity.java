package com.example.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button increment,reset;
    TextView show;
    EditText setNumber;

    int temp; // store the current number
    int number; // store value od edit text

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        increment = findViewById(R.id.incre_id);
        reset = findViewById(R.id.reset_id);

        show = findViewById(R.id.textView3);
        setNumber = findViewById(R.id.editText);

        temp = 0;
        number = 0;

        setNumber.setText("1");
    }

    public void increment (View v)
    {
        number = Integer.parseInt(setNumber.getText().toString());
        temp = number + temp;
        show.setText(temp + "");
    }

    public void reset (View v)
    {
        show.setText("1");
    }
}
