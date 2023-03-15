package com.example.lefties;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;
import java.util.HashMap;

public class Cart extends AppCompatActivity {

//    Integer[] images = {};
//    String[] restName = {"PH", "UB", "TJ"};
//    String[] item = {};
//    String[] itemPrice = {};
    CartAdapterClass adapter;
    String[] food = {"Paasta With Seafood", "Bruschetta"};
    int[] images = {R.drawable.placeholder, R.drawable.bgimg};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        Button btnBack = findViewById(R.id.btnBack);
        ChipGroup chipGroup = findViewById(R.id.chipGroup);
        Chip chipDelivery = findViewById(R.id.chipDelivery);
        Chip chipPickup = findViewById(R.id.chipPickup);
        TextView address = findViewById(R.id.txtAddress);
        TextView totalAmount = findViewById(R.id.txtAmount);
        Button btnPlaceOrder = findViewById(R.id.btnPlaceOrder);
        Button btnOrderMoreFood = findViewById(R.id.btnOrderMore);

////        RecyclerView recyclerView = findViewById(R.id.recyclerView);
//        int numOfCol = 1;
//        recyclerView.setLayoutManager(new GridLayoutManager(this, numOfCol));
//        adapter = new CartAdapterClass(this); //images, item, itemPrice, restName
//        recyclerView.setAdapter(adapter);
        applyList();
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cart.this, MainActivity.class));
            }
        });

    }

    public void applyList(){


        ArrayList<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for(int i=0; i<food.length; i++)
        {
            HashMap<String, String> hashMap =new HashMap<>();
            hashMap.put("txt", food[i]);
            hashMap.put("images", Integer.toString(images[i]));
            aList.add(hashMap);
        }

        String[] from ={"images", "txt"};
        int[] to ={R.id.imageFood, R.id.FoodText};


        SimpleAdapter adapter = new SimpleAdapter(Cart.this,
                aList,R.layout.cart_recycler_layout,from,to);

        ListView listView = findViewById(R.id.listViewCart);
        listView.setAdapter(adapter);
    }
}