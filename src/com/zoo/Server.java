package com.zoo;

import com.zoo.entities.Animal;
import com.zoo.entities.Cachorro;
import com.zoo.entities.Girafa;
import com.zoo.entities.Gato;

import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal animal = new Gato();
        animal.setNome("Zico");
        animal.setEspecie("Gato vira lata");
        animal.setIdade(2);
        animal.emitirSom();

        System.out.println("Olá, seu animal é um " + animal.getEspecie() +
                " O nome dele é " + animal.getNome() + " e Tem "
                + animal.getIdade() +  " Anos");

        if (animal.isAdulto()){
            System.out.println("É adulto");
        }
        else {
            System.out.println("É filhote");
        }



        Animal animal2 = new Cachorro(scanner.next(), scanner.next(), scanner.nextInt(), scanner.next());

        System.out.println("Olá, seu animal é um " + animal2.getEspecie() +
                " O nome dele é " + animal2.getNome() + " e Tem "
                + animal2.getIdade() +  " Anos");

        if (animal2.isAdulto()){
            System.out.println("É adulto");
        }
        else {
            System.out.println("É filhote");
        }

        Animal animal3 = new Girafa();
        animal3.setNome("Eli");
        animal3.setEspecie("Girafa");
        animal3.setIdade(10);
        animal3.emitirSom();

        System.out.println("Olá, seu animal é um " + animal3.getEspecie() +
                " O nome dele é " + animal3.getNome() + " e Tem "
                + animal3.getIdade() +  " Anos");

        if (animal3.isAdulto()){
            System.out.println("É adulto");
        }
        else {
            System.out.println("É filhote");
        }
    }
}
