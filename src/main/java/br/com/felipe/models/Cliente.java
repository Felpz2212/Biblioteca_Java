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
        livro.setEmprestado();
    }

    public List<Livro> getLivros(){
        return this.livros;
    }

  public void verificar(){ //verifica se na lista de livros do cliente existe algum livro cujo status emprestado seja falso e retira
        for(int cont = 0; cont < livros.toArray().length; cont++){
            Livro livroT = livros.get(cont);
            if(!livroT.isEmprestado()){
                livros.remove(livroT);
            }
        }
    }

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
