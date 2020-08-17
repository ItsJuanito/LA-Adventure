package com.example.laadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LAWinter extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_lawinter);
        String[] places = {"Los Angeles", "Los Angeles Zoo"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_lawinter, R.id.places, places));
    }
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0 :
                startActivity(new Intent(LAWinter.this, LALive.class));
                break;
            case 1 :
                startActivity(new Intent(LAWinter.this, LAZoo.class));
                break;
        }
    }
}
