package com.joseluis.laboratorio;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinerActivity extends AppCompatActivity {
    Spinner spinner_countries;
    String [] lista = {"PERÚ","MEXICO","ARGENTINA","COLOMBIA","BRAZIL"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiner);
        spinner_countries = (Spinner)findViewById(R.id.spinner_countries);
        llenaSpinner();
    }

    public void mostrar(View view) {
        toast(spinner_countries.getSelectedItem().toString());
    }
    void llenaSpinner(){
        spinner_countries.setAdapter(crearAdapter());
    }

    private ArrayAdapter crearAdapter() {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.spinner_countries, lista);
        return adapter;
    }
    private void toast(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
