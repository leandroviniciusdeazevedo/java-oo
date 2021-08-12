package br.com.javaoo.comoo;

public class Circulo {

    public double raio;

    public void calculaArea(){
        double area = Math.PI * Math.pow(raio,2);
        System.out.printf("Area do circulo %.2f%n", area);
    }

}
