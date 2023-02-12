package com.example.samplequesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    double packageprice = 0.0;
    int numOfDays;
    double price;
    String types;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        EditText edtxtdays = findViewById(R.id.edtxtdays);
        Spinner cartype = findViewById(R.id.spnrtype);
        Button btncal = findViewById(R.id.btncalc);
        TextView result = findViewById(R.id.txtresult);

        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(edtxtdays.getText().toString())){
                    edtxtdays.setError("Please enter number of days to rent a car!!");
                }
                else{
                    numOfDays = Integer.parseInt(edtxtdays.getText().toString());
                    types = cartype.getSelectedItem().toString();
                    calculateCost calculateCost = new calculateCost(numOfDays,types);
                    result.setText(calculateCost.toString());
                    Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
                    intent.putExtra("Type", types);
                    intent.putExtra("Package Cost", calculateCost.toString());
                    startActivity(intent);
                }
            }
        });

    }
}