package com.example.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class crearusuario extends AppCompatActivity implements Button.OnClickListener {

    Button registrate;
    TextInputEditText usuario, contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crearusuario);

        usuario=(TextInputEditText)findViewById(R.id.tietUsuarioCrear);
        contrasena=(TextInputEditText)findViewById(R.id.tietContrasenaCrear);
        registrate=(Button)findViewById(R.id.btnRegistrateCrear);

        registrate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent main = new Intent(this, MainActivity.class);

        startActivity(main);
    }
}
