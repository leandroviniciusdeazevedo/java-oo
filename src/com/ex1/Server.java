package com.ex1;

import com.ex1.entities.Employee;
import com.ex1.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        System.out.println("Quantos funcionários deseja cadastrar?");
        int n = s.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Nome: ");
            String nome = s.next();
            System.out.println("Horas trabalhadas: ");
            int horas = s.nextInt();
            System.out.println("Valor por hora: ");
            double valorHora = s.nextDouble();

            char ter = 'a';
            while (ter != 'S' & ter != 's' & ter != 'N' & ter != 'n'){
                System.out.println("É terceirizado (S/N)?");
                ter = s.next().charAt(0);
            }
            if (ter == 'S' | ter == 's'){
                System.out.println("Despesa Adicional: ");
                double adic = s.nextDouble();
                employeeList.add(new OutsourcedEmployee(nome, horas, valorHora, adic));
            } else {
                employeeList.add(new Employee(nome, horas, valorHora));
            }


        }

        System.out.println();
        System.out.println("Pagamentos: ");

        for (Employee employee : employeeList){
            System.out.println(employee.getName() + " - R$ " + String.format("%.2f", employee.payment()));
        }
        System.out.println(n+" funcionário(s) cadastrado(s)");

        s.close();
    }
}
