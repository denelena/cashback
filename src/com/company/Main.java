package com.company;

public class Main {
    public static void main(String[] args) {
        int startBalance = 155;
        int depositAmount = 544;
        int bonusAmount = 0;

        if (depositAmount >= 1000) {
            bonusAmount = depositAmount / 100;
        }

        int finalBalance = startBalance + depositAmount + bonusAmount;

        System.out.println("Конечный баланс: " + finalBalance);
        System.out.println("Бонус: " + (bonusAmount > 0 ? bonusAmount : "Как-нибудь в другой раз, жадина"));
    }
}
