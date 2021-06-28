package com.example.appsplashscreenlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText usua, cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usua = (EditText)findViewById(R.id.usuario);
        cont = (EditText)findViewById(R.id.contraseña);
    }
    public void Ingresar(View view){

        String usuario = usua.getText().toString();
        String contraseña = cont.getText().toString();

        if (usuario.intern() != "Juan" || contraseña.intern() != "123456"){
            Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show();
        }
        if (usuario.intern()  == "Juan" && contraseña.intern()  == "123456"){
            Toast.makeText(this, "Validacion Correcta Juan", Toast.LENGTH_LONG).show();
        }


    }
}