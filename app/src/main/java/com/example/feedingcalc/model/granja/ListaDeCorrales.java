package com.example.feedingcalc.model.granja;

import java.util.ArrayList;

public class ListaDeCorrales {

    private ArrayList<Corral> corrales;

    public ListaDeCorrales() {
        corrales = new ArrayList<>();
    }

    public ArrayList<Corral> getCorrales() {
        return corrales;
    }

    public void añadirCorral(Corral corral) {
        corrales.add(corral);
    }

    public void borrarCorral(Corral corral) {
        corrales.remove(corral);
    }

    public Corral getCorral(int index) {
        return corrales.get(index);
    }

    public int getIndex(Corral corral) {
        int pos = 0;
        for (Corral c : corrales) {
            if (corral.getId().equals(c.getId())) {
                return pos;
            }
            pos = pos + 1;
        }
        return -1;
    }

    public int getSize() {
        return corrales.size();
    }

}
