package com.example.feedingcalc.gui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.feedingcalc.R;

public class ActividadDeLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_de_login);
    }

    public void iniciarSesion(View view){
        Intent intent = new Intent(this, ActividadMenu.class);
        startActivity(intent);
    }

    public void registrar(View view){



        Intent intent = new Intent(this, ActividadDeRegistro.class);
        startActivity(intent);


    }
}