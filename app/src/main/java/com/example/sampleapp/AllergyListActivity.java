package com.example.sampleapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class AllergyListActivity extends AppCompatActivity {


    String [] Allergy_item = {"Egg Allergy","A Allergy","B Allergy","C Allergy"};
    String [] FemaleOrMale_item = {"Male","Female"};

    ArrayAdapter<String> FemaleOrMale_adaptor;

    Spinner FemaleOrMale, Age;
    TextView textViewInst;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner);

        FemaleOrMale = findViewById(R.id.spinnerInSpinner);
        textViewInst = findViewById(R.id.textViewInSpinner);

        FemaleOrMale_adaptor = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,FemaleOrMale_item);
        FemaleOrMale_adaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        FemaleOrMale.setAdapter(FemaleOrMale_adaptor);
    }
}
