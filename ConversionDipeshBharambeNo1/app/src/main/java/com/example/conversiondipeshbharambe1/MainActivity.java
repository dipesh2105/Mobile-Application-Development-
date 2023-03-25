package com.example.conversiondipeshbharambe1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     //Declaring Widgets
    EditText editText;
    TextView textView, textView2, textView4, valueinKm;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Initiating Widgets
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        valueinKm = findViewById(R.id.valueofKm);

        editText = findViewById(R.id.editTextNumber);
        button = findViewById(R.id.button);

        //Adding a click event for button (Executing the convert method when clicked)
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Calling ConvertFromMilesToKm Method

                ConvertFromMilesToKm();

            }
        });

    }

    private void ConvertFromMilesToKm() {
        // This method will convert the values entered in editTextNumber
        // From Miles to Km

        String valueEnteredinMiles = editText.getText().toString();

        //converting string to number

        double miles = Double.parseDouble(valueEnteredinMiles);

        // converting miles to km formula

        double Km = miles * 1.609 ;

        // Displaying the value resulted in textView

        valueinKm.setText("" + Km );




    }
}