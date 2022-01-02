package br.com.lucas.test;

import br.com.lucas.model.Moedas;

import java.util.Objects;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Moedas moedas = new Moedas();

        String continuar;

        do{
            System.out.println("####################################################");
            System.out.println("Conversor de moedas:");
            System.out.println("Escolha a moeda entrada: real, euro, dolar ou iene");
            moedas.setOpcaoA(entrada.next());
            System.out.println("Escolha a moeda saida: real, euro, dolar ou iene");
            moedas.setOpcaoB(entrada.next());
            System.out.println("Quanto deseja converter?");
            moedas.setValotDeEntrada(entrada.nextDouble());
            System.out.println("####################################################");

            System.out.print(moedas.getValotDeEntrada() + " " + moedas.getOpcaoA() + " = ");
            moedas.resultado();
            System.out.println(" " + moedas.getOpcaoB());

            System.out.println("####################################################");
            System.out.println("Quer fazer outra conversão?");
            System.out.println("y - sim");
            System.out.println("n - não");
            continuar = entrada.next();

        }while(Objects.equals(continuar, "y"));

    }
}
