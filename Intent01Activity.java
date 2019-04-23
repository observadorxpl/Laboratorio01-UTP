package com.joseluis.laboratorio;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Transition;
import android.view.View;
import android.widget.Toast;

public class Intent01Activity extends AppCompatActivity {
    TextInputEditText number1;
    TextInputEditText number2;
    double n1;
    double n2;
    double n3 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent01);
        number1 = (TextInputEditText) findViewById(R.id.txt_number01);
        number2 =(TextInputEditText)findViewById(R.id.txt_number02);
    }

    public void mostrar(View view) {
        captureNumbers();
        try {
            n3 = n1 * n2;
            Intent intent = new Intent(this, ResultIntent01Activity.class);
            intent.putExtra("n3", n3);
            startActivity(intent);
        }catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }
    private void captureNumbers() {
        n1 = Double.parseDouble(number1.getText().toString());
        n2 = Double.parseDouble(number2.getText().toString());
    }
}
