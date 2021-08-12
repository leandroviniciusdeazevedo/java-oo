package com.zoo.entities;

public abstract class Animal {

    protected String sexo;
    private String nome;
    private String especie;
    private int idade;

    //metodo construtor default
    public Animal(){}

    //metodo construtor nodefault
    public Animal(String nome, String especie, int idade, String sexo){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.sexo = sexo;
    }

    //metodos acessor
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract void emitirSom();

    public abstract boolean isAdulto();

}