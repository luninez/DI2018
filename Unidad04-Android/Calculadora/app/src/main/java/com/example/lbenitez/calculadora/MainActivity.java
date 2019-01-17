package com.example.lbenitez.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.String;

public class MainActivity extends AppCompatActivity {

    String numRecogido;
    String numAnterior;
    String operRecogido;
    Button multiplicar;
    Button cero;
    TextView pantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla = findViewById(R.id.pantalla);
        cero = findViewById(R.id.button0);
        multiplicar = findViewById(R.id.buttonMultiplicar);
    }

    public void numPulsado(View view) {
        numRecogido = ((Button)view).getText().toString();

        if(numRecogido.equals(cero.getText().toString())){
            pantalla.setText(numRecogido);
        }else{
            numAnterior = pantalla.getText().toString();
            pantalla.setText(numAnterior + numRecogido);
        }

    }

    public void pulsarDelete(View view) {
        char[] operacion = pantalla.getText().toString().toCharArray();
        int u = Math.max(0, operacion.length - 1);
        String textoNuevo = new String(operacion, 0, u);

    }

    public void pulsarC(View view) {
        pantalla.setText("0");
    }

    /*public void operacionPulsada(View view){
        operRecogido = ((Button)view).getText().toString();
        String primeraParte;

        if(operRecogido.equals(multiplicar)){
            operRecogido = "*";
        }
    }*/

}
