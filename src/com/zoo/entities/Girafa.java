package com.zoo.entities;

public class Girafa extends Animal{
    public Girafa() {

    }

    public Girafa(String nome, String especie, int idade, String sexo){
        super(nome, especie, idade, sexo);
    }

    @Override
    public void emitirSom() {
        System.out.println("Uuuuuuh");
    }

    @Override
    public boolean isAdulto(){
        return super.getIdade() >= 5;
    }
}
