package com.example.feedingcalc.model.calculador;

public class Ganancia {
    private int valor;
    private String cliente;
    private String descripcion;

    public Ganancia(int valor, String cliente, String descripcion) {
        this.valor = valor;
        this.cliente = cliente;
        this.descripcion = descripcion;
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
}
