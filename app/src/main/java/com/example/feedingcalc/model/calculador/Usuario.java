package com.example.feedingcalc.model.calculador;

import java.util.UUID;

public class Usuario {

    private String id;
    private String nombres;
    private String apellidos;
    private String nickname;
    private String contraseña;
    private FeedingCalc calculador;


    public Usuario(String nombres, String apellidos, String nickname, String contraseña) {
        setId();
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nickname = nickname;
        this.contraseña = contraseña;
        calculador = new FeedingCalc();
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public FeedingCalc getCalculador() {
        return calculador;
    }

    public void setCalculador(FeedingCalc calculador) {
        this.calculador = calculador;
    }
}
