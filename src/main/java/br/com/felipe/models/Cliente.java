package br.com.felipe.models;

import java.util.List;

public class Cliente extends Pessoa{

    private List<Livro> livros;

    public Cliente(String nome, String cpf, String email) {
        super(nome, cpf, email);
    }
}
