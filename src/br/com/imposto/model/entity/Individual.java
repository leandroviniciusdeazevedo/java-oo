package br.com.imposto.model.entity;

public class Individual extends TaxPayer{
    protected Double healthExpenditures;

    Double deduction(){
        return healthExpenditures * 0.5;
    }

    public Double tax(){
        if (anualIncome < 20000){
            return anualIncome * 0.15 - deduction();
        } else{
            return  anualIncome * 0.25 - deduction();
        }
    }

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
}
