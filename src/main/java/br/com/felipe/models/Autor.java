package br.com.felipe.models;

public class Autor{

    private String nome;
    private int idade;

    private Autor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static Autor of(String nome, int idade){
        return new Autor(nome, idade);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return getNome();
    }
}
