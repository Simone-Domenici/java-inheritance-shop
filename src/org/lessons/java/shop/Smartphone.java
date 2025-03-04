package org.lessons.java.shop;

import java.math.BigDecimal;

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

}
