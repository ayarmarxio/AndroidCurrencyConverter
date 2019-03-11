package com.example.currencyconverter;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import android.widget.AdapterView.OnItemSelectedListener;
import android.view.View.OnClickListener;
import android.app.Activity;



public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    private Spinner spinner, spinner4;

    private EditText editText;
    private TextView textView;

    private Button convertBtn;
    private String fromCurrency;
    private String toCurrency;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            spinner = findViewById(R.id.spinner);
            spinner4 = findViewById(R.id.spinner4);
            convertBtn = findViewById(R.id.button);
            editText = findViewById(R.id.editText);

            spinner.setOnItemSelectedListener(this);
            spinner4.setOnItemSelectedListener(this);


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            if (parent.getId() == R.id.spinner){
                String fromCurrency = spinner.getSelectedItem().toString();
                String toCurrency = spinner4.getSelectedItem().toString();
                Float fromValue = Float.parseFloat(editText.getText().toString());

                Double result;


                if (fromCurrency == "DKK" && toCurrency == "Dolar"){
                    result = fromValue * 0.15;

                    Context context = getApplicationContext();
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, result.toString(), duration);
                    toast.show();

                }
                else if (fromCurrency == "DKK" && toCurrency == "Euro"){
                    result = fromValue * 0.13;

                    editText.setText(result.toString());
                }
                else if (fromCurrency == "DKK" && toCurrency == "DKK"){
                    result = Double.parseDouble(fromValue.toString());

                    editText.setText(result.toString());
                }
                else if (fromCurrency == "Dolar" && toCurrency == "DKK"){
                    result = fromValue * 6.64;

                    editText.setText(result.toString());
                }
                else if (fromCurrency == "Dolar" && toCurrency == "Euro"){
                    result = fromValue * 0.89;

                    editText.setText(result.toString());
                }
                else if (fromCurrency == "Dolar" && toCurrency == "Dolar"){
                    result = Double.parseDouble(fromValue.toString());

                    editText.setText(result.toString());
                }
                else if (fromCurrency == "Euro" && toCurrency == "DKK"){
                    result = fromValue * 7.46;

                    editText.setText(result.toString());
                }
                else if (fromCurrency == "Euro" && toCurrency == "Dolar"){
                    result = fromValue * 1.12;

                    editText.setText(result.toString());
                }
                else if (fromCurrency == "Euro" && toCurrency == "Euro"){
                    result = Double.parseDouble(fromValue.toString());

                    editText.setText(result.toString());
                }
                else{

                }
            }
            else if (parent.getId() == R.id.spinner4){

            }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        String fromCurrency = "DKK";


    }
}
