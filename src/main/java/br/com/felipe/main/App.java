package br.com.felipe.main;

import br.com.felipe.models.Autor;
import br.com.felipe.models.Cliente;
import br.com.felipe.models.Livro;
import br.com.felipe.models.Pessoa;

public class App {
    public static void main(String[] args) {
        Cliente felipe = Cliente.of("Felipe Araujo de Almeida", "0000000", "felipearaujodealmeida3@gmail.com");

        Autor JK = Autor.of("JK Rowlling", 41);


        System.out.println(felipe);


        Livro HP = Livro.of("Harry Potter");

        System.out.println(HP);

        HP.setEmprestado();
        HP.adicionarAutor(JK);

        System.out.println(HP);

        felipe.adicionarLivro(HP);

        System.out.println(felipe);

        HP.setDevolvido();

        System.out.println("--------------------------------------------------------");
        felipe.verificar();
        System.out.println(felipe);

        System.out.println("---------------------------------------------------------------------");
        felipe.adicionarLivro(HP);
        HP.setEmprestado();
        System.out.println(felipe);

        HP.setDevolvido();
        System.out.println(felipe);
        felipe.verificar();
        System.out.println(felipe);
    }
}
