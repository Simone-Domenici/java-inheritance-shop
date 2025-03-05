package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Televisore extends Prodotto{
    public boolean isItSmart;
    public int size;

    public Televisore(String name, String brand, BigDecimal price, BigDecimal iva, boolean isItSmart, int size){
        super(name,brand,price,iva);
        this.isItSmart = isItSmart;
        this.size = size;
    }

    public boolean getisItSmart() {
        return this.isItSmart;
    }

    public void setisItSmart(boolean isItSmart) {
        this.isItSmart = isItSmart;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public BigDecimal getDiscountedPrice() {
        if (!this.isItSmart) {
            return getPriceIVA().multiply(new BigDecimal(0.90).setScale(2,RoundingMode.DOWN));
        }
        return super.getDiscountedPrice();
    }

    @Override
    public String toString() {
        return "Televisore: " + this.name + " - Prezzo: " + this.getPriceIVA() + " - Smart: " + (this.isItSmart ? "Si" : "No");
    }
}
