package com.ex2.entities;

import java.util.Date;

public class UsedProduct extends Product{
    private Date manufactureDate;

    @Override
    public String priceTag(){
        System.out.print(name+" (used)");
        System.out.printf(" $ %.2f ", price);
        System.out.printf("(Manufacture date: %tD)", manufactureDate);
        return "";
    }

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}