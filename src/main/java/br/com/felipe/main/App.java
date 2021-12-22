package br.com.felipe.main;

import br.com.felipe.models.Livro;
import br.com.felipe.models.Pessoa;

public class App {
    public static void main(String[] args) {
        Pessoa felipe = Pessoa.of("Felipe Araujo de Almeida", "0000000", "felipearaujodealmeida3@gmail.com");

        System.out.println(felipe);


        Livro HP = Livro.of("Harry Potter");

        System.out.println(HP);

        HP.setEmprestado();

        System.out.println(HP);
    }
}
