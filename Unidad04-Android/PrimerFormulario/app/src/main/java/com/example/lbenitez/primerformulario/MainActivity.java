package com.example.lbenitez.primerformulario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnRegistro;
    RadioGroup rgSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRegistro = findViewById(R.id.buttonRegistro);
        btnRegistro.setOnClickListener(this);

        rgSexo = findViewById(R.id.RadioGroupSexo);
    }

    public void sexoSeleccionado(View view) {
        int id = view.getId();
        mostrarMensaje(id);
    }


    @Override
    public void onClick(View v) {
        rgSexo.getCheckedRadioButtonId(R.id.RadioHombre);
        mostrarMensaje();

    }

    public mostrarMensaje(int idSeleccionado){
        String seleccionado = " ";

        switch (id){
            case R.id.RadioHombre:
                seleccionado = "hombre";
                break;
            case R.id.RadioMujer:
                seleccionado = "mujer";
                break;
        }
        Toast.makeText(
                this,
                "Sexo" + seleccionado,
                Toast.LENGTH_SHORT)
                .show();
    }
}
