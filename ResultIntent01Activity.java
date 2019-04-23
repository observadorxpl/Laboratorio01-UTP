package com.joseluis.laboratorio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultIntent01Activity extends AppCompatActivity {
    double n3 = 0;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_intent01);
        result = (TextView) findViewById(R.id.result);
        captureExtra();
    }

    private void captureExtra() {
        n3 = getIntent().getDoubleExtra("n3", 0);
        result.setText(result.getText() + " " + String.valueOf(n3));

    }

    public void returnIntent01(View view) {
        Intent intent = new Intent(this, Intent01Activity.class);
        startActivity(intent);
    }
}
