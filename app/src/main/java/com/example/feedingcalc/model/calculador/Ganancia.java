package com.example.feedingcalc.model.calculador;

import java.util.UUID;

public class Ganancia {
    private String id;
    private int valor;
    private String cliente;
    private String descripcion;

    public Ganancia(int valor, String cliente, String descripcion) {
        this.valor = valor;
        this.cliente = cliente;
        this.descripcion = descripcion;
        setId();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }
}
