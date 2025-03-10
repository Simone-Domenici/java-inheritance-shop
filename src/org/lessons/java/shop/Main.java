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


        Smartphone Pixel = new Smartphone("Google Pixel 8 Pro", "Google", new BigDecimal(900), new BigDecimal(22), "345987756345009", 256);
        System.out.println(Pixel.getFullName());
        System.out.println(Pixel.getPriceIVA());
        System.out.println(Pixel.getDiscountedPrice());
        System.out.println(Pixel);

        Televisore Samsung = new Televisore("Samsung OLED Max", "Samsung", new BigDecimal(499.99), new BigDecimal(22), true, 32);
        System.out.println(Samsung.getFullName());
        System.out.println(Samsung.getPriceIVA());
        System.out.println(Samsung.getDiscountedPrice());
        System.out.println(Samsung);

        Cuffie Logitech = new Cuffie("Logitech G Pro-X", "Logitech", new BigDecimal(250.99), new BigDecimal(22), false, "black");
        System.out.println(Logitech.getFullName());
        System.out.println(Logitech.getPriceIVA());
        System.out.println(Logitech.getDiscountedPrice());
        System.out.println(Logitech);

    }
}
