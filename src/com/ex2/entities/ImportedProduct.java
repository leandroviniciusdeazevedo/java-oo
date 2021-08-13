package com.ex2.entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    Double totalPrice(){
        return price+customsFee;
    }

    @Override
    public String priceTag(){
        System.out.print(name);
        System.out.printf(" $ %.2f ", totalPrice());
        System.out.printf("(Custom fee: $ %.2f)", customsFee);
        return "";
    }

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
}