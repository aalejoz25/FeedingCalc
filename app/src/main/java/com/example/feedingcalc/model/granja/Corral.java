package com.example.feedingcalc.model.granja;

import java.util.ArrayList;
import java.util.UUID;

public class Corral {
    private String id;
    private ArrayList<Animal> animales;
    private int cantidadAnimales;
    private boolean isEmpty = true;

    public Corral(int cantidadAnimales) {
        animales = new ArrayList<>();
        this.cantidadAnimales = cantidadAnimales;
        if (id == null) {
            setId();
        } else {
            updateId(id);
        }

    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void añadirAnimal(Animal animal) {
        if (getSize() < this.cantidadAnimales) {
            animales.add(animal);
            this.isEmpty = false;
        } else {
            System.out.println("No se puede añadir mas animales al corral");
        }
    }

    public void borrarAnimal(Animal animal) {
        animales.remove(animal);
        if (getSize()==0){
            this.isEmpty = true;
        }
    }

    public Animal getAnimal(int index) {
        return animales.get(index);
    }

    public int getIndex(Animal animal) {
        int pos = 0;
        for (Animal a : animales) {
            if (animal.getId().equals(a.getId())) {
                return pos;
            }
            pos = pos + 1;
        }
        return -1;
    }

    public int getSize() {
        return animales.size();
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return this.id;
    }

    public void updateId(String id) {
        this.id = id;
    }

    public boolean isEmpty() {
        return isEmpty;
    }
}
