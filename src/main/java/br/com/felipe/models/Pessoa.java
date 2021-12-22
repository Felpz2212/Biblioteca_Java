package br.com.felipe.models;

public class Pessoa {

    private String nome;
    private String cpf;
    private String email;

    private Pessoa(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public static Pessoa of(String nome, String cpf, String email){
        return new Pessoa(nome, cpf, email);
    }

    @Override
    public String toString() {
        return "nome= " + nome + '\n' +
                "cpf= " + cpf + '\n' +
                "email= " + email + '\n';
    }
}
