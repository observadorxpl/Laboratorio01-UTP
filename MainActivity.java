package com.joseluis.laboratorio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculadora(View view) {
        Intent intent = new Intent(this, CalculadoraActivity.class);
        startActivity(intent);
    }

    public void capturar(View view) {
        Intent intent = new Intent(this, CapturarActivity.class);
        startActivity(intent);
    }

    public void checkbox(View view) {
        Intent intent = new Intent(this, CheckBoxActivity.class);
        startActivity(intent);
    }

    public void spinner(View view) {
        Intent intent = new Intent(this, SpinerActivity.class);
        startActivity(intent);
    }

    public void activity01(View view) {
        Intent intent = new Intent(this, Intent01Activity.class);
        startActivity(intent);
    }
}
