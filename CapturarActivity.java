package com.joseluis.laboratorio;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CapturarActivity extends AppCompatActivity {

    Button btnCapturar;
    TextInputEditText txtname;
    TextView txtshowname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capturar);
        btnCapturar = (Button) findViewById(R.id.btn_adicionar);
        txtname= (TextInputEditText) findViewById(R.id.txt_name);
        txtshowname = (TextView)findViewById(R.id.txt_showname);
    }


    public void show(View view) {
        String name = "";
        name= txtname.getText().toString();
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }
}
