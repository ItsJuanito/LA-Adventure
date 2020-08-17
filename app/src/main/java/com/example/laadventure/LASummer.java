package com.example.laadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LASummer extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_lasummer);
        String[] places = {"Santa Monica Pier", "Venice Beach", "Griffith Obvservatory"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_lasummer, R.id.places,  places));

    }
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0 :
                startActivity(new Intent(LASummer.this, Pier.class));
                break;
            case 1 :
                startActivity(new Intent(LASummer.this, Beach.class));
                break;
            case 2 :
                startActivity(new Intent(LASummer.this, Griffith.class));
                break;
        }
    }
}
