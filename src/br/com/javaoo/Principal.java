package br.com.javaoo;

//import br.com.javaoo.entities.Product;
import br.com.javaoo.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        /*Product p = new Product();

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        p.setName(scanner.nextLine());

        System.out.print("Price: ");
        p.setPrice(scanner.nextDouble());

        System.out.print("Quantity in stock: ");
        p.setQuantity(scanner.nextInt());

        System.out.println();

        System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n%n", p.getName(), p.getPrice(),
                p.getQuantity(), p.totalValueInStock());

        System.out.print("Enter the number of products to be added in stock: ");

        p.addProducts(scanner.nextInt());

        System.out.printf("%nUpdated data: %s, $ %.2f, %d units, Total: $ %.2f%n%n", p.getName(), p.getPrice(),
                p.getQuantity(), p.totalValueInStock());

        System.out.print("Enter the number of products to be removed from stock: ");

        p.removeProducts(scanner.nextInt());

        System.out.printf("%nUpdated data: %s, $ %.2f, %d units, Total: $ %.2f%n%n", p.getName(), p.getPrice(),
                p.getQuantity(), p.totalValueInStock());

         */

        Student s1 = new Student();
        System.out.println("Digite o nome do estudante");
        s1.setName(scanner.nextLine());
        System.out.println("Digite a primeira nota (entre 0 e 30)");
        s1.setGrade1(scanner.nextDouble());
        System.out.println("Digite a primeira nota (entre 0 e 35)");
        s1.setGrade2(scanner.nextDouble());
        System.out.println("Digite a primeira nota (entre 0 e 35)");
        s1.setGrade3(scanner.nextDouble());

        System.out.printf("FINAL GRADE = %.2f%n",s1.resultado());
        s1.statusAluno();

        scanner.close();
    }
}
