package com.example.samplequesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class SecondActivity extends AppCompatActivity {

    String[] names = {"Amazon", "play a song", "Hertz Car Rental", "ABC Car Rental", "BC Car Rental", "V-Can Car Rental"};
    Integer[] images = {R.drawable.snack1, R.drawable.snack5, R.drawable.wonder2, R.drawable.wonder5, R.drawable.wonder6, R.drawable.wonder7};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ArrayList<HashMap<String, String>> aList = new ArrayList<HashMap<String,String>>();

        for(int i=0; i<names.length; i++){
            HashMap<String,String> hashmap = new HashMap<>();
            hashmap.put("txt", names[i]);
            hashmap.put("images", Integer.toString(images[i]));
            aList.add(hashmap);
        }
        String[] from = {"images", "txt"};
        int[] to = {R.id.imgly, R.id.txtly};

        SimpleAdapter adapter = new SimpleAdapter(SecondActivity.this, aList, R.layout.listview_layout, from, to);

        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch(position){
                    case 0:
                        startActivity(new Intent(SecondActivity.this, ThirdActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.enterprise.ca/en/home.html")));
                        break;
                    case 2:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hertz.ca/rentacar/reservation/")));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        break;
                }
            }
        });
    }
}