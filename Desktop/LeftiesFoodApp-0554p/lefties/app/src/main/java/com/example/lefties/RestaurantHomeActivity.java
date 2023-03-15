package com.example.lefties;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;

public class RestaurantHomeActivity extends AppCompatActivity {
    RecyclerView inventoryList;
    String[] someArray = {"hello", "there", "hi", "again", "once more"};
    ArrayList<HashMap<String, String>> inventoryMapper = new ArrayList<>();
    Button addItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_home);

        inventoryList = findViewById(R.id.recyclerInventory);
//        listCompanies = findViewById(R.id.listviewCompanies);

        int columnCount = 2;
        inventoryList.setLayoutManager(
                new GridLayoutManager(this, columnCount));
//        companies = prepareCompanies(companiesStringArr);
//
        InventoryRecyclerAdapter adapter = new InventoryRecyclerAdapter(this, someArray);
        inventoryList.setAdapter(adapter);
//        setupListView(inventoryMapper);

        addItem = findViewById(R.id.btnAddItem);

        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToAddItem();
            }
        });


    }

    public void goToAddItem(){
        Intent i = new Intent(getApplicationContext(), RestaurantAddAnItemActivity.class);
        startActivity(i);
    }
}
