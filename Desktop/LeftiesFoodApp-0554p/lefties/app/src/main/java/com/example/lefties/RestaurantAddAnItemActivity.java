package com.example.lefties;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RestaurantAddAnItemActivity extends AppCompatActivity {

    Button addItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_add_an_item);

        addItem = findViewById(R.id.btnAddInventory);
        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToRestaurantHome();
            }
        });
    }

    public void goToRestaurantHome(){
        Intent i = new Intent(getApplicationContext(), RestaurantHomeActivity.class);
        startActivity(i);
    }
}