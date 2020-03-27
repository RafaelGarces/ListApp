package com.example.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener{

    TextInputEditText usuario, contrasena;
    Button login, registrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario=(TextInputEditText)findViewById(R.id.tietUsuarioRegistro);
        contrasena=(TextInputEditText)findViewById(R.id.tietContrasenaRegistro);
        login=(Button)findViewById(R.id.btnLoginRegistro);
        registrarse=(Button)findViewById(R.id.btnRegistrarseRegistro);

        login.setOnClickListener(this);
        registrarse.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnLoginRegistro:

                break;

            case R.id.btnRegistrarseRegistro:

                break;
        }
    }
}
