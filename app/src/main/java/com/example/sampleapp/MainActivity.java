package com.example.sampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    // declare checkboxes
    Button  swapbtn,checkboxbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Main Training");
        setContentView(R.layout.activity_main);
        swapbtn = findViewById(R.id.swapbutton);
        checkboxbtn = findViewById(R.id.checkboxbutton);
    }

    public void goToSwapImage(View view)
    {
        Intent intent = new Intent(this,ConstrainPart1Activity.class);
        startActivity(intent);
    }

    public void goToCheckBox(View view)
    {
        Intent intent = new Intent(this,CheckBoxActivity.class);
        startActivity(intent);
    }

    public void goToFloatingImage(View view)
    {
        Intent intent = new Intent(this,FloatingImage.class);
        startActivity(intent);
    }

    public void goToChangeLayout(View view)
    {
        Intent intent = new Intent(this,ChangeLayout.class);
        startActivity(intent);
    }




}
