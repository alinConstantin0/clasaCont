package com.company.compozitie;

public class Telefon {
    private String model;
    private int memorie;
    private int diagonala;
    private Card sim;

    public Telefon(String model) {
        this.model = model;
    }

    public Card getSim() {
        return this.sim;
    }

    public void setSim(Card sim) {
        this.sim = sim;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemorie() {
        return this.memorie;
    }

    public void setMemorie(int memorie) {
        this.memorie = memorie;
    }

    public int getDiagonala() {
        return this.diagonala;
    }

    public void setDiagonala(int diagonala) {
        this.diagonala = diagonala;
    }


}
