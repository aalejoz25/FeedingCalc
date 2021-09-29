package com.example.feedingcalc.gui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.feedingcalc.R;

public class ActividadDeRegistro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_de_registro);
    }

    public void login(View view){
        Intent intent = new Intent(this, ActividadDeLogin.class);
        startActivity(intent);


    }
}