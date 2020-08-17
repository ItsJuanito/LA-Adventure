package com.example.laadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Disney extends AppCompatActivity {
    private int enteredAmount;
    private double finalAmount;
    private double ticket = 120;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disney);

        final EditText value = (EditText) findViewById(R.id.txtPeople);
        final RadioButton radKids = (RadioButton) findViewById(R.id.RadKids);
        final RadioButton radAdults = (RadioButton) findViewById(R.id.RadAdults);
        final TextView result = (TextView) findViewById(R.id.txtResult1);

        Button calculate = (Button)findViewById(R.id.btnPeople);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enteredAmount = Integer.parseInt(value.getText().toString());
                DecimalFormat hundredth = new DecimalFormat("#.##");
                if (radKids.isChecked()) {
                    if (enteredAmount >= 4) {
                        double temp = (enteredAmount * ticket) * .20;
                        finalAmount = enteredAmount * ticket - temp;
                        result.setText("$" + hundredth.format(finalAmount) + " for " + enteredAmount +" people with 3 kids.");
                    } else {
                        result.setText("You need to have an adult with your kids!!");
                    }


                }
                if (radAdults.isChecked()) {
                    finalAmount = enteredAmount * ticket;
                    result.setText("$" + hundredth.format(finalAmount) + " for " +enteredAmount+ " adults.");
                }
            }
        });
    }

}
