package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    private int code;
    public String name;
    public String brand;
    public BigDecimal price;
    public BigDecimal iva;


    // costruttori
    public Prodotto(){
        this.name = "";
        this.brand = "";
        this.price = new BigDecimal(0);
        this.iva = new BigDecimal(0);
        this.code = getRandomNumber();
    }

    public Prodotto(String name,String brand,BigDecimal price, BigDecimal iva){
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.code = getRandomNumber();
        this.iva = iva;
    }

    // getter & setter

    public BigDecimal getPrice(){
        return this.price;
    }

    public void setPrice(BigDecimal price){
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getIva() {
        return this.iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCode() {
        return this.code;
    }

    private void setCode(int code){
        this.code = code;
    }


    // metodi aggiuntivi
    public BigDecimal getPriceIVA(){
        return this.price.add(this.price.multiply(this.iva.divide(new BigDecimal(100)))).setScale(2,RoundingMode.DOWN);
    }

    private int getRandomNumber(){
        Random random = new Random();
        int randomNumber = 100000000 + random.nextInt(900000000);
        return randomNumber;
    }

    public String getFullName(){
        String fullName = this.code + "-" + this.name;
        return fullName;
    }

    public BigDecimal getDiscountedPrice(){
        return getPriceIVA().multiply(new BigDecimal(0.98)).setScale(2,RoundingMode.DOWN);
    }

    @Override
    public String toString() {
        return "Prodotto: " + this.name + " - Prezzo: " + this.getPriceIVA();
    }
}
