package com.joseluis.laboratorio;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CalculadoraActivity extends AppCompatActivity {
    TextInputEditText number1;
    TextInputEditText number2;
    TextView resultado;
    double n1;
    double n2;
    double n3 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calculadora);
        number1 = (TextInputEditText) findViewById(R.id.txt_number01);
        number2 =(TextInputEditText)findViewById(R.id.txt_number02);
        resultado =(TextView) findViewById(R.id.txt_number03);

    }

    private void captureNumbers() {
        n1 = Double.parseDouble(number1.getText().toString());
        n2 = Double.parseDouble(number2.getText().toString());
        n3 = Double.parseDouble(resultado.getText().toString());
    }

    /*
        private void procesar(View view) {
            try {
                n1 = Double.parseDouble(number1.getText().toString());
                n2= Double.parseDouble(number2.getText().toString());
                switch (i){
                    case 1: resta(view);
                    case 2: suma(view);
                    case 3: mult(view);
                    case 4: div(view);
                }
            }
            catch (Exception e){
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    */
    public void resta(View view) {
        captureNumbers();
        n3 = n1 - n2;
        resultado.setText(String.valueOf(n3));
    }

    public void suma(View view) {
        captureNumbers();
        try {
            n3 = n1 + n2;
            resultado.setText(String.valueOf(n3));
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }


    public void mult(View view) {
        captureNumbers();
        try {
            n3 = n1 * n2;
            resultado.setText(String.valueOf(n3));
        }catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }


    }

    public void div(View view) {
        captureNumbers();
        try {
            n3 = n1/n2;
            resultado.setText(String.valueOf(n3));
        }catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }


    }
}
