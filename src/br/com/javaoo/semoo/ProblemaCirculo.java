package br.com.javaoo.semoo;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaCirculo {
    public static void main(String[] args) {
        /*
        area do circulo
         */
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double r1, r2;

        System.out.println("Entre com o valor do raio do primeiro circulo");
        r1 = scanner.nextDouble();

        System.out.println("Entre com o valor do raio do segundo circulo");
        r2 = scanner.nextDouble();

        double area1 = Math.PI * Math.pow(r1,2);
        double area2 = Math.PI * Math.pow(r2,2);

        System.out.printf("Area do circulo 1 %.2f%n", area1);
        System.out.printf("Area do circulo 2 %.2f%n", area2);

        if (area1 > area2) {
            System.out.println("Circulo 1 é o maior");

        } else {
            System.out.println("Circulo 2 é o maior");
        }

        scanner.close();

    }
}
