package br.com.felipe.models;

import java.util.ArrayList;
import java.util.List;

public class Livro {

    private String nome;
    private List<Autor> autor;
    private boolean emprestado;
    private List<String> categoria;

    private Livro(String nome){
        this.nome = nome;
        this.emprestado = false;
        this.autor = new ArrayList<>();
        this.categoria = new ArrayList<>();
    }

    public static Livro of(String nome){
        return new Livro(nome);
    }

    public void setEmprestado() {
        this.emprestado = true;
    }

    public void setDevolvido(){
        this.emprestado = false;
    }

    public void adicionarAutor(Autor autor){
        this.autor.add(autor);
    }

    public Livro adicionarCategoria(String categoria){
        this.categoria.add(categoria);

        return this;
    };

    public List<String> getCategoria() {
        return this.categoria;
    }

    public List<Autor> getAutor() {
        return this.autor;
    }

    public String getNome() {
        return nome;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\n" +
                "Emprestado: " + emprestado +
                "\n" +
                "Autores: " + getAutor() +
                "\n" +
                "Categorias: " + getCategoria();
    }
}
