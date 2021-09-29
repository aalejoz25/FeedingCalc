package com.example.feedingcalc.model.calculador;

import com.example.feedingcalc.model.granja.ListaDeCorrales;

public class FeedingCalc {
    private int balance;
    private ListaGanancias listaGanancias;
    private ListaGastos listaGastos;
    private ListaDeCorrales corrales;

    public FeedingCalc() {
        listaGanancias = new ListaGanancias();
        listaGastos = new ListaGastos();
        corrales = new ListaDeCorrales();
    }

    public int getBalance() {
        return balance;
    }

    public ListaGanancias getGanancias() {
        return listaGanancias;
    }

    public ListaGastos getGastos() {
        return listaGastos;
    }

    public void calcularBalance() {
        balance=listaGanancias.obtenerGananciasTotales()- listaGastos.obtenerGastosTotales();
    }


}
