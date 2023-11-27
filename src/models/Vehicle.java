package models;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    private String name;
    private int qtd_lugares;

    public Vehicle() {
    }

    public Vehicle(String name, int qtd_lugares) {
        this.name = name;
        this.qtd_lugares = qtd_lugares;
    }

    public String getName() {
        return name;
    }

    public int getQtd_lugares() {
        return qtd_lugares;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQtd_lugares(int qtd_lugares) {
        this.qtd_lugares = qtd_lugares;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", qtd_lugares=" + qtd_lugares +
                '}';
    }
}
