package org.lessons.java.shop;

import java.math.BigDecimal;

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
}
