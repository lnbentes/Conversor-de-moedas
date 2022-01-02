package br.com.lucas.test;

import br.com.lucas.model.Moedas;

public class Test {
    public static void main(String[] args) {

        Moedas moedas = new Moedas();

        moedas.setOpcaoA("real");
        moedas.setOpcaoB("dolar");
        moedas.setValotDeEntrada(250.55);

        moedas.resultado();

    }

}
