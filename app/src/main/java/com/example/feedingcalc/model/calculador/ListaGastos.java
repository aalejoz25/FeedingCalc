package com.example.feedingcalc.model.calculador;

import java.util.ArrayList;

public class ListaGastos {
    ArrayList<Gasto> gastos;

    public ListaGastos() {
        gastos = new ArrayList<>();
    }

    public ArrayList<Gasto> getGastos() {
        return gastos;
    }

    public void añadirGasto(Gasto gasto) {
        gastos.add(gasto);
    }

    public void borrarGasto(Gasto gasto) {
        gastos.remove(gasto);
    }

    public Gasto getGasto(int index) {
        return gastos.get(index);
    }

    public int getIndex(Gasto gasto) {
        int pos = 0;
        for (Gasto g : gastos) {
            if (gasto.getId().equals(g.getId())) {
                return pos;
            }
            pos = pos + 1;
        }
        return -1;
    }

    public int obtenerGastosTotales() {
        int gastosTotales = 0;
        for (Gasto g : gastos
        ) {
            gastosTotales += g.getValor();
        }
        return gastosTotales;
    }

    public int getSize() {
        return gastos.size();
    }


}
