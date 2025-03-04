package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto Prodotto = new Prodotto("Prodotto", "Prodotto", new BigDecimal(90.25), new BigDecimal(22));
        System.out.println(Prodotto.getFullName());
        System.out.println(Prodotto.getPrice());
        System.out.println(Prodotto.getPriceIVA());
        System.out.println(Prodotto.getCode());
        Prodotto.setName("Prodotto Nuovo");
        System.out.println(Prodotto.getFullName());
    }
}
