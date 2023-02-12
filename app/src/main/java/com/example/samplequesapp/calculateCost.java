package com.example.samplequesapp;

import androidx.annotation.NonNull;

import java.text.DecimalFormat;

public class calculateCost {
    private final String types;
    private int numOfDays;

    public calculateCost(int numOfDays, String type){
        this.numOfDays = numOfDays;
        types = type;
    }

    public double cal(){
        double packageprice = 0.0;

        if(numOfDays>6) {
            switch (types) {
                case "SUV":
                    packageprice = 55.99;
                    break;
                case "Economy":
                    packageprice = 35.99;
                    break;
                case "Minivan":
                    packageprice = 30.99;
                    break;
                case "Convertible":
                    packageprice = 65.99;
                    break;
            }

            return packageprice * numOfDays *0.85;
        }
        else{
            switch (types) {
                case "SUV":
                    packageprice = 55.99;
                    break;
                case "Economy":
                    packageprice = 35.99;
                    break;
                case "Minivan":
                    packageprice = 30.99;
                    break;
                case "Convertible":
                    packageprice = 65.99;
                    break;
            }
            return packageprice * numOfDays;
        }
    }

    @NonNull
    @Override
    public String toString(){
        DecimalFormat currency = new DecimalFormat("$###,###.##");
        return "The package price is " + currency.format(cal()) + " for " + types;
    }
}
