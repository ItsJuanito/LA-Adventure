package com.example.laadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class OCFair extends AppCompatActivity {
    private int enteredAmount;
    private double finalAmount;
    private double ticket = 12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocfair);

        final EditText value = (EditText) findViewById(R.id.txtPeople2);
        final RadioButton radHandi = (RadioButton) findViewById(R.id.RadHandicap);
        final RadioButton radWO = (RadioButton) findViewById(R.id.RadWithout);
        final TextView result = (TextView) findViewById(R.id.txtResult2);

        Button calculate = (Button)findViewById(R.id.btnCost2);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enteredAmount = Integer.parseInt(value.getText().toString());
                DecimalFormat hundredth = new DecimalFormat("#.##");
                if (radHandi.isChecked()) {
                    double temp = (enteredAmount * ticket) * .10;
                    finalAmount = enteredAmount * ticket - temp;
                    result.setText("$" + hundredth.format(finalAmount) + " for " + enteredAmount +" people with a handicaped.");



                }
                if (radWO.isChecked()) {
                    finalAmount = enteredAmount * ticket;
                    result.setText("$" + hundredth.format(finalAmount) + " for " +enteredAmount+ " people.");
                }
            }
        });
    }

}
