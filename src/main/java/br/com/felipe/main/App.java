package br.com.felipe.main;

import br.com.felipe.models.Autor;
import br.com.felipe.models.Cliente;
import br.com.felipe.models.Livro;

public class App {
    public static void main(String[] args) {
        Cliente felipe = Cliente.of("Felipe Araujo de Almeida", "0000000", "felipearaujodealmeida3@gmail.com");

        Autor JK = Autor.of("JK Rowlling", 41);

        System.out.println(felipe);

        Livro HP = Livro.of("Harry Potter");

        System.out.println(HP);

        HP.setEmprestado();
        HP.adicionarAutor(JK);
        HP.adicionarCategoria("Ficção").adicionarCategoria("Magia");

        System.out.println(HP);

        felipe.adicionarLivro(HP);

        System.out.println(felipe);

        HP.setDevolvido();

        System.out.println("--------------------------------------------------------");
        felipe.verificar();
        System.out.println(felipe);

        System.out.println("---------------------------------------------------------------------");
        felipe.adicionarLivro(HP);
        System.out.println(felipe);

        HP.setDevolvido();
        felipe.verificar();
        System.out.println(felipe);

        // TODO: 02/01/2022 Achar um jeito de a partir do momento em que um livro for devolvido limpar da lista do cliente automaticamente
    }
}
