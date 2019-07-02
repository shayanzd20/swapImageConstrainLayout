package com.example.sampleapp;

import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.animation.OvershootInterpolator;

public class ChangeLayout extends AppCompatActivity {

    private ConstraintLayout layout;
    private ConstraintSet constraintSetOld =  new ConstraintSet();
    private ConstraintSet constraintSetNew =  new ConstraintSet();
    private boolean altLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_layout_old);

        layout = findViewById(R.id.change_layout);
        constraintSetOld.clone(layout);
        constraintSetNew.clone(this,R.layout.activity_change_layout);
    }

    public void swapView(View view)
    {
        Transition changeBounds = new ChangeBounds();
        changeBounds.setInterpolator(new OvershootInterpolator());

        TransitionManager.beginDelayedTransition(layout);
        if(!altLayout)
        {
            constraintSetNew.applyTo(layout);
            altLayout = true;
        }else {
            constraintSetOld.applyTo(layout);
            altLayout = false;
        }
    }
}
