package com.example.feedingcalc.data;

import com.example.feedingcalc.model.calculador.Usuario;

import java.util.ArrayList;

public class ListaUsuarios {

    public static ArrayList<Usuario> users = new ArrayList<>();
    public static Usuario currentUser = new Usuario("","","","");

    public static boolean esUsuarioDisponible(String nickname) {
        for (Usuario u : users
        ) {
            if (u.getNickname().equals(nickname)) {
                return false;
            }
        }
        return true;
    }
}
