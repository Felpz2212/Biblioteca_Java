package br.com.felipe.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{

    private List<Livro> livros;

    private Cliente(String nome, String cpf, String email) {
        super(nome, cpf, email);
    }

    public static Cliente of(String nome, String cpf, String email){
        return new Cliente(nome, cpf, email);
    }

    public void adicionarLivro(Livro livro){
        if(livros == null){
            livros = new ArrayList<>();
        }
        livros.add(livro);
    }

    public List<Livro> getLivros(){
        return this.livros;
    }

  /* public void verificar(){
        for (Livro livroT : livros){
            if(!livroT.isEmprestado()){
                livros.remove(livroT);
            }
        }
    }*/

    @Override
    public String toString() {
        return "nome: " + nome +
                "\n" +
                "cpf: " + cpf +
                "\n" +
                "Email: " + email +
                "\n" +
                "Livros: " + livros;
    }
}
