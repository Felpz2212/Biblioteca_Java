package br.com.felipe.models;

public class Pessoa {

    protected String nome;
    protected String cpf;
    protected String email;

    public Pessoa(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public static Pessoa of(String nome, String cpf, String email){
        return new Pessoa(nome, cpf, email);
    }
}
