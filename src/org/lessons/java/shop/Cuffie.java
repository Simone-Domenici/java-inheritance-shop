package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{
    public boolean areCabled;
    public String color;

    public Cuffie(String name, String brand, BigDecimal price, BigDecimal iva, boolean areCabled, String color){
        super(name,brand,price,iva);
        this.areCabled = areCabled;
        this.color = color;
    }

    public boolean getareCabled() {
        return this.areCabled;
    }

    public void setAreCabled(boolean areCabled) {
        this.areCabled = areCabled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
