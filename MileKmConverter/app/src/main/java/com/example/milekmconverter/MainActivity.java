package com.example.milekmconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonToKM = findViewById(R.id.toKmButton);
        final Button buttonToMI = findViewById(R.id.toMiButton);

        final EditText textKM = findViewById(R.id.editTextKilometers);
        final EditText textMI = findViewById(R.id.editTextMiles);

        buttonToMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float val = 0;
                if(!textKM.getText().toString().matches("")){
                    val = Float.valueOf(textKM.getText().toString());
                    val = val*1.60934f;
                    textMI.setText(Float.toString(val));
                }
            }
        });

        buttonToKM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float val = 0;
                if(!textMI.getText().toString().matches("")){
                    val = Float.valueOf(textMI.getText().toString());
                    val = val/1.60934f;
                    textKM.setText(Float.toString(val));
                }
            }
        });
    }
}
