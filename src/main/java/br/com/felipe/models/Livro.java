package br.com.felipe.models;

import java.util.List;

public class Livro {

    private String nome;
    private List<Autor> autor;
    private boolean emprestado;

    private Livro(String nome){
        this.nome = nome;
        this.emprestado = false;
    }

    public static Livro of(String nome){
        return new Livro(nome);
    }

    public void setEmprestado() {
        this.emprestado = true;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\n" +
                "Emprestado: " + emprestado;
    }
}
