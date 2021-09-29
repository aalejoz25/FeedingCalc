package com.example.feedingcalc.gui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.feedingcalc.R;
import com.example.feedingcalc.data.ListaUsuarios;
import com.example.feedingcalc.model.calculador.Usuario;

import java.util.ArrayList;

public class ActividadDeLogin extends AppCompatActivity {

    private EditText nickname;
    private EditText contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_de_login);

        nickname = (EditText) findViewById(R.id.txtUsuario);
        contraseña = (EditText) findViewById(R.id.txtContrasena);
    }

    public void iniciarSesion(View view) {

        String nickname_str = nickname.getText().toString();
        String contraseña_str = contraseña.getText().toString();
        ArrayList<Usuario> usuarios = ListaUsuarios.users;
        for (Usuario u : usuarios
        ) {
            if (u.getNickname().equals(nickname_str) && u.getContraseña().equals(contraseña_str)) {
                ListaUsuarios.currentUser = u;

                Intent intent = new Intent(this, ActividadMenu.class);
                startActivity(intent);


            }
        }
        finish();

    }

    public void registrar(View view) {


        Intent intent = new Intent(this, ActividadDeRegistro.class);
        startActivity(intent);


    }
}