package com.example.laadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LBWinter extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_lbwinter);
        String[] places = {"2nd Street", "The Pike"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_lbwinter, R.id.places, places));
    }
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0 :
                startActivity(new Intent(LBWinter.this, SecondStreet.class));
                break;
            case 1 :
                startActivity(new Intent(LBWinter.this, Pike.class));
                break;
        }
    }
}
