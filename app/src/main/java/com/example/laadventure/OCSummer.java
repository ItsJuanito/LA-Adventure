package com.example.laadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class OCSummer extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_ocsummer);
        String[] places = {"DisneyLand", "OC Fair"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_ocsummer, R.id.places,  places));

    }
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0 :
                startActivity(new Intent(OCSummer.this, Disney.class));
                break;
            case 1 :
                startActivity(new Intent(OCSummer.this, OCFair.class));
                break;
        }
    }
}
