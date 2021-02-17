package com.company;

public class Main {

    public static void main(String[] args) {
        Cont cont1 = new Cont(1, 2000);
        Cont cont2 = new Cont();
        cont1.setAnualInterestRate(36);
        System.out.println("Rata dobanzii anuala a contului 1 este de " + cont1.getAnualInterestRate());
        System.out.println("Rata dobanzii lunara a contului 1 este de " + cont1.getMonthlyInterestRate());
        cont1.depozitare(400);
        System.out.println(cont1.getSold());
        cont1.retragere(1567);
        System.out.println(cont1.getSold());
    }
}
