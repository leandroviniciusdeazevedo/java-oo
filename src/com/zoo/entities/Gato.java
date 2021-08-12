package com.zoo.entities;

public class Gato extends Animal{
    public Gato() {

    }

    public Gato(String nome, String especie, int idade, String sexo){
        super(nome, especie, idade, sexo);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    @Override
    public boolean isAdulto(){
        return super.getIdade() >= 1;
    }
}
