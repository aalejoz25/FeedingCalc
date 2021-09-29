package com.example.feedingcalc.model.calculador;

import java.util.ArrayList;

public class ListaGanancias {

    ArrayList<Ganancia> ganancias;

    public ListaGanancias() {
        ganancias = new ArrayList<>();
    }

    public ArrayList<Ganancia> getGanancias() {
        return ganancias;
    }

    public void añadirGanancia(Ganancia ganancia) {
        ganancias.add(ganancia);
    }

    public void borrarGanancia(Ganancia ganancia) {
        ganancias.remove(ganancia);
    }

    public Ganancia getGanancia(int index) {
        return ganancias.get(index);
    }

    public int getIndex(Ganancia ganancia) {
        int pos = 0;
        for (Ganancia g : ganancias) {
            if (ganancia.getId().equals(g.getId())) {
                return pos;
            }
            pos = pos + 1;
        }
        return -1;
    }

    public int obtenerGananciasTotales() {
        int gananciasTotales = 0;
        for (Ganancia g : ganancias
        ) {
            gananciasTotales += g.getValor();
        }
        return gananciasTotales;
    }

    public int getSize() {
        return ganancias.size();
    }

}
