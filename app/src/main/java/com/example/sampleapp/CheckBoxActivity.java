package com.example.sampleapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {


    // declare checkboxes
    CheckBox breakfast,dinner,lunch, salad;
    Button ok, swapbtn;
    Switch dietConfirm;
    String tempCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox);

//        increment = findViewById(R.id.incre_id);
//        reset = findViewById(R.id.reset_id);
//
//        show = findViewById(R.id.textView3);
//        setNumber = findViewById(R.id.editText);
//
//        temp = 0;
//        number = 0;
//
//        setNumber.setText("1");


        // find view by id for checkbox
        dietConfirm = findViewById(R.id.switch1);
        dietConfirm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked)
                {

                }else{

                }
            }
        });


        breakfast = findViewById(R.id.checkBox2);
        breakfast.setOnCheckedChangeListener(this);
        dinner = findViewById(R.id.checkBox3);
        dinner.setOnCheckedChangeListener(this);
        lunch = findViewById(R.id.checkBox4);
        lunch.setOnCheckedChangeListener(this);
        salad = findViewById(R.id.checkBox5);
        salad.setOnCheckedChangeListener(this);


        ok = findViewById(R.id.button3);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CheckBoxActivity.this,tempCheck,Toast.LENGTH_LONG).show();
            }
        });

        swapbtn = findViewById(R.id.swapbutton);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if(isChecked)
        {
            tempCheck = tempCheck + buttonView.getText()+ ",";
        }else{
            tempCheck = tempCheck.replace(buttonView.getText()," ");
        }
    }
}
