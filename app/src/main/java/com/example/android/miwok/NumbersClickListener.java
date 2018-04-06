package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

public class NumbersClickListener implements View.OnClickListener{
    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(), "This toast message appeared because you clicked the screen", Toast.LENGTH_SHORT).show();
    }
}