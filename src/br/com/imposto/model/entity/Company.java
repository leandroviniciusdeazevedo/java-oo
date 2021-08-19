package br.com.imposto.model.entity;

public class Company extends TaxPayer{
    protected int numberOfEmployees;

    public Double tax(){
        if (numberOfEmployees > 10){
            return 0.14 * anualIncome;
        } else{
            return 0.16 * anualIncome;
        }
    }

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
