package br.com.lucas.test;

import br.com.lucas.model.Moedas;

import java.util.Objects;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Moedas moedas = new Moedas();

        String continuar, valor, opcaoA, opcaoB;

        do{
            System.out.println("####################################################");
            System.out.println("Conversor de moedas:");

            System.out.println("Escolha a moeda entrada: real, euro, dolar ou iene");
            do {
                System.out.print("Entre com nome valido: ");
                opcaoA = entrada.next();
            }while( ! moedas.testLogicoNome(opcaoA) );
            moedas.setOpcaoA(opcaoA);

            System.out.println("Escolha a moeda saida: real, euro, dolar ou iene");
            do {
                System.out.print("Entre com nome valido: ");
                opcaoB = entrada.next();
            }while( ! moedas.testLogicoNome(opcaoB) );
            moedas.setOpcaoB(opcaoB);

            System.out.println("Quanto deseja converter?");
            do {
                System.out.print("Valor numerico valido: ");
                valor = entrada.next();
            }while( ! moedas.testLogicoValor(valor));
            moedas.setValotDeEntrada(valor);

            System.out.println("####################################################");

            System.out.print(moedas.getValotDeEntrada() + " " + moedas.getOpcaoA() + " = ");
            moedas.resultado();
            System.out.println(" " + moedas.getOpcaoB());

            System.out.println("####################################################");
            System.out.println("Quer fazer outra conversão?");
            System.out.println("s - sim");
            System.out.println("n - não");
            continuar = entrada.next();

        }while(Objects.equals(continuar, "y"));

    }
}
