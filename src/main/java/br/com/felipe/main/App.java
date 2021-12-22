package br.com.felipe.main;

import br.com.felipe.models.Pessoa;

public class App {
    public static void main(String[] args) {
        Pessoa felipe = Pessoa.of("Felipe Araujo de Almeida", "0000000", "felipearaujodealmeida3@gmail.com");

        System.out.println(felipe);

    }
}
