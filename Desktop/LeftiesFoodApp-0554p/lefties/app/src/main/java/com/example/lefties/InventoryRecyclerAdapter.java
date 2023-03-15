package com.example.lefties;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import java.lang.reflect.AccessibleObject;
import java.util.HashMap;

public class InventoryRecyclerAdapter extends RecyclerView.Adapter {
    LayoutInflater layoutInflater;
    Context context;
    String[] strArr;

    public InventoryRecyclerAdapter(@NonNull Context context, String[] strArr ) {
//        super(context);
//        this.companies = companies;
        this.context = context;
        this.strArr = strArr;
        layoutInflater = LayoutInflater.from(context);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imgCompanyLogo;
        TextView txtCompanyName;
        Button edit;

        // THIS MAPS ATTRIBUTES PER ITEM
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
//            imgCompanyLogo = itemView.findViewById(R.id.imgCompanyLogo);
//            txtCompanyName = itemView.findViewById(R.id.txtCompanyName);
//            itemView.setOnClickListener(this);
            return;
        }
        @Override
        public void onClick(View v) {
//            System.out.println("clicked");



        }
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =  layoutInflater.inflate(R.layout.recyler_food_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view); // viewHolder holds the layoutInflater

        Button edit = view.findViewById(R.id.itemBtnEdit);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context.getApplicationContext(), RestaurantAddAnItemActivity.class);
                context.startActivity(i);
            }
        });


        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return strArr.length ;
    }
}
