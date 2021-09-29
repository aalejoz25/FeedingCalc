package com.example.feedingcalc.gui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.feedingcalc.R;
import com.example.feedingcalc.data.ListaUsuarios;
import com.example.feedingcalc.model.calculador.Usuario;

public class ActividadDeRegistro extends AppCompatActivity {


    private EditText nombres;
    private EditText apellidos;
    private EditText nickname;
    private EditText contraseña;
    private EditText repeticionContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_de_registro);
        nombres = (EditText) findViewById(R.id.txtNombres);
        apellidos = (EditText) findViewById(R.id.txtApellidos);
        contraseña = (EditText) findViewById(R.id.txtPassword);
        repeticionContraseña = (EditText) findViewById(R.id.txtPasswordAgain);
        nickname = (EditText) findViewById(R.id.txtNickname);
    }

    public void hacerRegistro(View view){
        String nombres_str = nombres.getText().toString();
        String apellidos_str = apellidos.getText().toString();
        String nickname_str = nickname.getText().toString();
        String contraseña_str = contraseña.getText().toString();
        String repeticionContraseña_str = repeticionContraseña.getText().toString();


        if (nombres_str.equals("")) {
            nombres.setError("Campo Vacio!");
            return;
        }

        if (apellidos_str.equals("")) {
            apellidos.setError("Campo Vacio!");
            return;
        }

        if (contraseña_str.equals("")) {
            contraseña.setError("Campo Vacio!");
            return;
        }

        if (repeticionContraseña_str.equals("")) {
            repeticionContraseña.setError("Campo Vacio!");
            return;
        }

        if (!repeticionContraseña_str.equals(contraseña_str)) {
            repeticionContraseña.setError("Las contraseñas no coinciden!");
            return;
        }

        if (nickname_str.equals("")) {
            nickname.setError("Campo Vacio!");
            return;
        }

        if (!ListaUsuarios.esUsuarioDisponible(nickname_str)){
            nickname.setError("Nombre de usuario no disponible");
            return;
        }

        Usuario usuario = new Usuario(nombres_str,apellidos_str,nickname_str,contraseña_str);
        ListaUsuarios.users.add(usuario);
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("Usuario Registrado");
        myAlert.setPositiveButton("Continuar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog dialog = myAlert.create();
        dialog.show();

        System.out.println(ListaUsuarios.users.size());

    }

    public void login(View view){
        Intent intent = new Intent(this, ActividadDeLogin.class);
        startActivity(intent);


    }
}