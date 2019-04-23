package com.joseluis.laboratorio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {
    CheckBox checkbox01;
    CheckBox checkbox02;
    CheckBox checkbox03;
    CheckBox checkbox04;
    CheckBox checkbox05;
    CheckBox checkbox06;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        checkbox01 = (CheckBox)findViewById(R.id.checkbox01);
        checkbox02 = (CheckBox)findViewById(R.id.checkbox02);
        checkbox03 = (CheckBox)findViewById(R.id.checkbox03);
        checkbox04 = (CheckBox)findViewById(R.id.checkbox04);
        checkbox05 = (CheckBox)findViewById(R.id.checkbox05);
        checkbox06 = (CheckBox)findViewById(R.id.checkbox06);
    }

    public void mostrar(View view) {
        String msg = "";
        if (checkbox01.isChecked()) {
            msg = msg + checkbox01.getText().toString() + " ";
        }
        if (checkbox02.isChecked()) {
            msg = msg + checkbox02.getText().toString() + " ";
        }
        if (checkbox03.isChecked()) {
            msg = msg + checkbox03.getText().toString() + " ";
        }
        if (checkbox04.isChecked()) {
            msg = msg + checkbox04.getText().toString()+ " ";
        }
        if (checkbox05.isChecked()) {
            msg = msg + checkbox05.getText().toString()+ " ";
        }
        if (checkbox06.isChecked()) {
            msg = msg + checkbox06.getText().toString()+ " ";
        }
        if(!checkbox01.isChecked() && !checkbox02.isChecked() && !checkbox03.isChecked() &&
                !checkbox05.isChecked() && !checkbox06.isChecked()){
            msg= "Seleccione un plato";
        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
