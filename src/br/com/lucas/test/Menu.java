package br.com.lucas.test;

import br.com.lucas.model.Moedas;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(new Locale("pt", "BR"));
        Moedas moedas = new Moedas();

        String continuar, valor, opcaoA, opcaoB;

        do{
            System.out.println("####################################################");
            System.out.println("Conversor de moedas:");

            //Moeda A
            System.out.println("Escolha a moeda entrada: real, euro, dolar ou iene");
            do {
                System.out.print("Entre com nome valido: ");
                opcaoA = entrada.next();
            }while( ! moedas.testLogicoNome(opcaoA) );
            moedas.setOpcaoA(opcaoA);

            //Moeda B
            System.out.println("Escolha a moeda saida: real, euro, dolar ou iene");
            do {
                System.out.print("Entre com nome valido: ");
                opcaoB = entrada.next();
            }while( ! moedas.testLogicoNome(opcaoB) );
            moedas.setOpcaoB(opcaoB);

            //Valor que deseja converter
            System.out.println("Quanto deseja converter?");
            do {
                System.out.print("Valor numerico valido: ");
                valor = entrada.next();
            }while( ! moedas.testLogicoValor(valor));
            moedas.setValorDeEntrada(valor);

            System.out.println("####################################################");

            //Resultado
            System.out.print(moedas.getValorDeEntrada() + " " + moedas.getOpcaoA() + " = ");
            moedas.resultado();
            System.out.println(" " + moedas.getOpcaoB());

            System.out.println("####################################################");

            //Pergunta para permanecer no laco ou nao
            System.out.println("Quer fazer outra conversão?");
            System.out.println("s - sim");
            System.out.println("n - não");
            continuar = entrada.next();

        }while(Objects.equals(continuar, "y"));

    }
}
