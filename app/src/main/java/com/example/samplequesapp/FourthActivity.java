package com.example.samplequesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        TextView result2 = findViewById(R.id.txtresult2);

        Intent intent = getIntent();
        if(intent != null){
            String types = intent.getStringExtra("Type");
            Double calculateCost = intent.getDoubleExtra("Price", 0);
            DecimalFormat currency = new DecimalFormat("$###,###.##");
            result2.setText(String.format("The package price is %s for %s", currency.format(calculateCost), types));
        }
    }
}