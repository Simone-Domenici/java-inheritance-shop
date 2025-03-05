package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Smartphone extends Prodotto{
    public String IMEICode;
    public int memory;

    public Smartphone(String name, String brand, BigDecimal price, BigDecimal iva, String IMEICode, int memory){
        super(name,brand,price,iva);
        this.IMEICode = IMEICode;
        this.memory = memory;
    }

    public String getIMEICode() {
        return this.IMEICode;
    }

    public void setIMEICode(String iMEICode) {
        this.IMEICode = iMEICode;
    }

    public int getMemory() {
        return this.memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public BigDecimal getDiscountedPrice() {
        if (this.memory < 32) {
            return getPriceIVA().multiply(new BigDecimal(0.95).setScale(2,RoundingMode.DOWN));
        }
        return super.getDiscountedPrice();
    }

    @Override
    public String toString() {
        return "Smartphone: " + this.name + " - Prezzo: " + this.getPriceIVA() + " - Memoria: " + this.memory + "GB";
    }
}
