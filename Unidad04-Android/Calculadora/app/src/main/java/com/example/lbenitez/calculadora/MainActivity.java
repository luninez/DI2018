package com.example.lbenitez.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    String numRecogido;
    String numAnterior;
    Button cero;
    TextView pantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla = findViewById(R.id.pantalla);
        cero = findViewById(R.id.button0);
    }

    public void numPulsado(View view) {
        numRecogido = ((Button)view).getText().toString();

        if(numRecogido.equals(cero.getText().toString())){
            pantalla.setText(numRecogido);
        }else{
            numAnterior = pantalla.getText().toString();
            pantalla.setText(numRecogido + numRecogido);
        }

    }

}
