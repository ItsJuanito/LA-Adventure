package com.example.laadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Winter extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_winter);
        String[] places ={"Los Angeles", "Long Beach"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_winter, R.id.places, places));

    }
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0 :
                startActivity(new Intent(Winter.this, LAWinter.class));
                break;
            case 1 :
                startActivity(new Intent(Winter.this, LBWinter.class));
                break;
        }
    }
}
