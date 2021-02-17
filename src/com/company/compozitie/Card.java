package com.company.compozitie;

public class Card {
    private String operator;
    private String numeFrecventa;

    public Card(int frecventa, String operator) {
        this.operator = operator;
        this.numeFrecventa = frecventa + "G";
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setNumeFrecventa(int frecventa) {
        this.numeFrecventa = frecventa + "G";
    }

    public String getOperator() {
        return this.operator;
    }

    public String getNumeFrecventa() {
        return this.numeFrecventa;
    }
}
