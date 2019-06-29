package com.example.sampleapp;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Placeholder;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.TransitionManager;
import android.view.View;

public class ConstrainPart1Activity extends AppCompatActivity {

    private Placeholder placeholder;
    private ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_constrain_part1);
        setContentView(R.layout.constrain_layout_part1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        placeholder = findViewById(R.id.placeholder);
        layout = findViewById(R.id.layout);
    }

    public void swapView(View v)
    {
        TransitionManager.beginDelayedTransition(layout);
        placeholder.setContentId(v.getId());
    }
}
