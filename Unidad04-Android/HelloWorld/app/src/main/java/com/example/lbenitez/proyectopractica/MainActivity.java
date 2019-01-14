package com.example.lbenitez.proyectopractica;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //VARIABLES
    Button btnLogin;
    Button btnRegister;
    EditText etEmail;
    EditText etPassword;

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buscar elemento
        btnLogin = findViewById(R.id.buttonLogin);
        btnRegister = findViewById(R.id.buttonRegister);

        etEmail = findViewById(R.id.editTextEmail);
        etPassword = findViewById(R.id.editTextPassword);

        //cambio del texto del boton
        btnLogin.setText("Iniciar sesión");

        //declaracion del metodo login sobre el boton
        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);

        //ocultar el toolbar en esta pantalla
        getSupportActionBar().hide();

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    public void onClick(View v) {
        int id =  v.getId();
        if(id == R.id.buttonLogin){
            String email = etEmail.getText().toString();
            String password = etPassword.getText().toString();

            if(email.equals("admin@admin.com") && password.equals("1234")){
                Toast.makeText(this, "Login ok", Toast.LENGTH_SHORT).show();

                //como ha sido correcto, reseteamos los campos de texto
                etEmail.setText("");
                etPassword.setText("");
            }else{
                etEmail.setError("Email y/o contraseña incorrecto");
            }
        }else{

        }
    }
}
