package com.company.compozitie;

public class Main {
    public static void main(String[] args) {
    Telefon primulTelefon = new Telefon("Iphone X");
    primulTelefon.setDiagonala(10);
    primulTelefon.setMemorie(8);
    Telefon alDoileaTelefon = new Telefon("Samsung S9");
    alDoileaTelefon.setDiagonala(6);
    alDoileaTelefon.setMemorie(4);
    Card card1 = new Card(3,"Orange");
    Card card2 = new Card(4,"Vodafone");
    primulTelefon.setSim(card1);
    alDoileaTelefon.setSim(card2);
    }
}
