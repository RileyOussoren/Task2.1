package com.rileyoussoren.unitconverterapp;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    Button button;
    EditText entry;
    TextView result;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.convertButton);
        entry = findViewById(R.id.valueEntry);
        result = findViewById(R.id.valueDisplay);


        Spinner convertFrom=findViewById(R.id.convertFrom);
        Spinner convertTo=findViewById(R.id.convertTo);

        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.units, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        convertFrom.setAdapter(adapter);
        convertTo.setAdapter(adapter);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fromValue = String.valueOf(convertFrom.getSelectedItem());
                String toValue =  String.valueOf(convertTo.getSelectedItem());
                String entryValueString = entry.getText().toString();
                double entryValue = Double.parseDouble(entryValueString);


                if (fromValue.equals("Centimetre")){

                    if (toValue.equals("Kilometre")){
                        result.setText(((entryValue / 100000) + "KM"));
                    }
                    else if (toValue.equals("Inch")) {
                        result.setText((entryValue * 0.394) + "in");
                    }
                    else if (toValue.equals("Foot")) {
                        result.setText((entryValue * 0.033) + "ft");
                    }
                    else if (toValue.equals("Yard")) {
                        result.setText((entryValue * 0.011) + "yd");
                    }
                    else if (toValue.equals("Mile")) {
                        result.setText(((entryValue / 100000) * 0.621) + "mi");
                    }

                }
                else if (fromValue.equals("Kilometre")) {

                    if (toValue.equals("Centimetre")){
                        result.setText(((entryValue * 100000) + "cm"));
                    }
                    else if (toValue.equals("Inch")) {
                        result.setText(((entryValue * 100000) * 0.394) + "in");
                    }
                    else if (toValue.equals("Foot")) {
                        result.setText(((entryValue * 100000) * 0.033) + "ft");
                    }
                    else if (toValue.equals("Yard")) {
                        result.setText(((entryValue * 100000) * 0.011) + "yd");
                    }
                    else if (toValue.equals("Mile")) {
                        result.setText((entryValue * 0.621) + "mi");
                    }

                }
                else if (fromValue.equals("Inch")){

                    if (toValue.equals("Kilometre")){
                        result.setText((((entryValue * 2.54) / 100000) + "KM"));
                    }
                    else if (toValue.equals("Centimetre")) {
                        result.setText((entryValue * 2.54) + "cm");
                    }
                    else if (toValue.equals("Foot")) {
                        result.setText(((entryValue * 2.54) * 0.033) + "ft");
                    }
                    else if (toValue.equals("Yard")) {
                        result.setText(((entryValue * 2.54) * 0.011) + "yd");
                    }
                    else if (toValue.equals("Mile")) {
                        result.setText((((entryValue * 2.54) / 100000) * 0.621) + "mi");
                    }

                }
                else if (fromValue.equals("Foot")){

                    if (toValue.equals("Kilometre")){
                        result.setText((((entryValue * 30.48) / 100000) + "KM"));
                    }
                    else if (toValue.equals("Inch")) {
                        result.setText(((entryValue * 30.48) * 0.394) + "in");
                    }
                    else if (toValue.equals("Centimetre")) {
                        result.setText((entryValue * 30.48) + "cm");
                    }
                    else if (toValue.equals("Yard")) {
                        result.setText(((entryValue * 30.48) * 0.011) + "yd");
                    }
                    else if (toValue.equals("Mile")) {
                        result.setText((((entryValue * 30.48) / 100000) * 0.621) + "mi");
                    }

                }
                else if (fromValue.equals("Yard")) {

                    if (toValue.equals("Kilometre")) {
                        result.setText((((entryValue * 91.44) / 100000) + "KM"));
                    } else if (toValue.equals("Inch")) {
                        result.setText(((entryValue * 91.44) * 0.394) + "in");
                    } else if (toValue.equals("Foot")) {
                        result.setText(((entryValue * 91.44) * 0.033) + "ft");
                    } else if (toValue.equals("Centimetre")) {
                        result.setText((entryValue * 91.44) + "cm");
                    } else if (toValue.equals("Mile")) {
                        result.setText((((entryValue * 91.44) / 100000) * 0.621) + "mi");
                    }
                }
                else if (fromValue.equals("Mile")){

                    if (toValue.equals("Kilometre")){
                        result.setText((((entryValue * 160934) / 100000) + "KM"));
                    }
                    else if (toValue.equals("Inch")) {
                        result.setText(((entryValue * 160934) * 0.394) + "in");
                    }
                    else if (toValue.equals("Foot")) {
                        result.setText(((entryValue * 160934) * 0.033) + "ft");
                    }
                    else if (toValue.equals("Yard")) {
                        result.setText(((entryValue * 160934) * 0.011) + "yd");
                    }
                    else if (toValue.equals("Centimetre")) {
                        result.setText((entryValue * 160934) + "cm");
                    }

                }
                else if (fromValue.equals("Gram")){

                    if(toValue.equals("Kilogram")){
                        result.setText((entryValue / 1000) + "Kg");
                    }
                    else if (toValue.equals("Pound")){
                        result.setText((entryValue / 453.6) + "lbs");
                    }
                    else if (toValue.equals(("Ounce"))){
                        result.setText((entryValue / 28.35) + "oz");
                    }
                    else if (toValue.equals("Ton")){
                        result.setText((entryValue / 907200) + "tons");
                    }
                }
                else if (fromValue.equals("Kilogram")){

                    if(toValue.equals("Gram")){
                        result.setText((entryValue * 1000) + "g");
                    }
                    else if (toValue.equals("Pound")){
                        result.setText(((entryValue * 1000) / 453.6) + "lbs");
                    }
                    else if (toValue.equals(("Ounce"))){
                        result.setText(((entryValue * 1000) / 28.35) + "oz");
                    }
                    else if (toValue.equals("Ton")){
                        result.setText(((entryValue * 1000) / 907200) + "tons");
                    }
                }
                else if (fromValue.equals("Pound")){

                    if(toValue.equals("Kilogram")){
                        result.setText(((entryValue * 453.6) / 1000) + "Kg");
                    }
                    else if (toValue.equals("Gram")){
                        result.setText((entryValue * 453.6) + "g");
                    }
                    else if (toValue.equals(("Ounce"))){
                        result.setText(((entryValue * 453.6) / 28.35) + "oz");
                    }
                    else if (toValue.equals("Ton")){
                        result.setText(((entryValue * 453.6) / 907200) + "tons");
                    }
                }
                else if (fromValue.equals("Ounce")){

                    if(toValue.equals("Kilogram")){
                        result.setText(((entryValue * 28.35) / 1000) + "Kg");
                    }
                    else if (toValue.equals("Pound")){
                        result.setText(((entryValue * 28.35) / 453.6) + "lbs");
                    }
                    else if (toValue.equals(("Gram"))){
                        result.setText((entryValue * 28.35) + "g");
                    }
                    else if (toValue.equals("Ton")){
                        result.setText(((entryValue * 28.35) / 907200) + "tons");
                    }
                }
                else if (fromValue.equals("Ton")){

                    if(toValue.equals("Kilogram")){
                        result.setText(((entryValue * 907200) / 1000) + "Kg");
                    }
                    else if (toValue.equals("Pound")){
                        result.setText(((entryValue * 907200) / 453.6) + "lbs");
                    }
                    else if (toValue.equals(("Ounce"))){
                        result.setText(((entryValue * 907200) / 28.35) + "oz");
                    }
                    else if (toValue.equals("Gram")){
                        result.setText((entryValue * 907200) + "gram");
                    }
                }
                else if (fromValue.equals("Celsius")){

                    if (toValue.equals("Fahrenheit")){
                        result.setText(((entryValue * 1.8) + 32) + "F");
                    }
                    else if (toValue.equals("Kelvin")){
                        result.setText((entryValue + 273.15) + "K");
                    }
                }
                else if (fromValue.equals("Fahrenheit")){

                    if (toValue.equals("Celsius")){
                        result.setText(((entryValue - 32) / 1.8) + "C");
                    }
                    else if (toValue.equals("Kelvin")){
                        result.setText((((entryValue - 32) / 1.8) + 273.15) + "K");
                    }
                }
                else if (fromValue.equals("Kelvin")){

                    if (toValue.equals("Fahrenheit")){
                        result.setText((((entryValue - 273.15) * 1.8) + 32) + "F");
                    }
                    else if (toValue.equals("Celsius")){
                        result.setText((entryValue - 273.15) + "C");
                    }
                }



            }

        });



    }
}