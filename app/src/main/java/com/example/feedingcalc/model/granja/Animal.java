package com.example.feedingcalc.model.granja;

import java.util.UUID;

public class Animal {
    private String id;
    private String nombre;
    private int tasaMortandad;
    private int dosisComida;
    private int valor;


    public Animal(String nombre, int tasaMortandad, int dosisComida, int valor) {
        this.nombre = nombre;
        this.tasaMortandad = tasaMortandad;
        this.dosisComida = dosisComida;
        this.valor = valor;
        if (id == null){
            setId();
        } else {
            updateId(id);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTasaMortandad() {
        return tasaMortandad;
    }

    public void setTasaMortandad(int tasaMortandad) {
        this.tasaMortandad = tasaMortandad;
    }

    public int getDosisComida() {
        return dosisComida;
    }

    public void setDosisComida(int dosisComida) {
        this.dosisComida = dosisComida;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId(){
        return this.id;
    }

    public void updateId(String id){
        this.id = id;
    }

}
