package com.company.basic;

import java.util.Date;

public class Cont {
    private int id = 0;
    private double sold = 0;
    private double anualInterestRate = 0;
    private Date dateCreated;

    public Cont() {

    }

    public Cont(int id, double sold) {
        this.id = id;
        this.sold = sold;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public void setAnualInterestRate(double anualInterestRate) {
        this.anualInterestRate = anualInterestRate;
    }

    public Date getDateCreated(Date data) {
        return this.dateCreated;
    }

    public int getId() {
        return this.id;
    }

    public double getSold() {
        return this.sold;
    }

    public double getAnualInterestRate() {
        return this.anualInterestRate;
    }

    public double getMonthlyInterestRate() {
        double monthlyInterestRate = (((this.anualInterestRate / 100) / 12) * 100);
        return monthlyInterestRate;
    }

    public void retragere(double sumaRetrasa) {
        this.sold = this.sold - sumaRetrasa;
    }

    public void depozitare(double sumaDepozitata) {
        this.sold = this.sold + sumaDepozitata;
    }

}
