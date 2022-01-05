package br.com.lucas.model;

import java.util.Locale;
import java.util.Objects;

public class Moedas {

    private String opcaoA;
    private String opcaoB;
    private final String real;
    private final String euro;
    private final String dolar;
    private final String iene;
    private double resultado;
    private double valorDeEntrada;

    public Moedas() {
        this.real = "real";
        this.euro = "euro";
        this.dolar = "dolar";
        this.iene = "iene";
    }

    //Faz o calculo da conversao para a moeda escolhida
    public void resultado(){
        if(Objects.equals(this.opcaoA, real)){
            this.resultado = this.valorDeEntrada * real();
        } else if(Objects.equals(this.opcaoA, euro)){
            this.resultado = this.valorDeEntrada * euro();
        }else if(Objects.equals(this.opcaoA, dolar)){
            this.resultado = this.valorDeEntrada * dolar();
        }else if(Objects.equals(this.opcaoA, iene)){
            this.resultado = this.valorDeEntrada * iene();
        }else {
            System.out.println("A opções 'a' está invalida");
        }
        System.out.format(new Locale("pt", "BR"), "%.3f", this.resultado); //Aplicando a foamtacao
    }

    //Dados da cotacao do real para cada moeda escolhida
    public double real(){
        if(Objects.equals(this.opcaoB, this.real)){
            return 1; //real para real
        }else if(Objects.equals(this.opcaoB, this.euro)){
            return 0.16; //real para euro
        }else if(Objects.equals(this.opcaoB, this.dolar)){
            return 0.18; ////real para dolar
        }else if(Objects.equals(this.opcaoB, this.iene)){
            return 20.66; ////real para iene
        }
        System.out.println("A opções 'b' está invalida");
        return 0;
    }

    //Dados da cotacao do euro para cada moeda escolhida
    public double euro(){
        if(Objects.equals(this.opcaoB, this.real)){
            return 6.34; //euro para real
        }else if(Objects.equals(this.opcaoB, this.euro)){
            return 1; //euro para euro
        }else if(Objects.equals(this.opcaoB, this.dolar)){
            return 1.14; //euro para dolar
        }else if(Objects.equals(this.opcaoB, this.iene)){
            return 130.89; //euro para iene
        }
        System.out.println("A opções 'b' está invalida");
        return 0;
    }

    //Dados da cotacao do dolar para cada moeda escolhida
    public double dolar(){
        if(Objects.equals(this.opcaoB, this.real)){
            return 5.57; //dolar para real
        }else if(Objects.equals(this.opcaoB, this.euro)){
            return 0.88; //dolar para euro
        }else if(Objects.equals(this.opcaoB, this.dolar)){
            return 1; //dolar para dolar
        }else if(Objects.equals(this.opcaoB, this.iene)){
            return 115.11; //dolar para iene
        }
        System.out.println("A opções 'b' está invalida");
        return 0;
    }

    //Dados da cotacao do iene para cada moeda escolhida
    public double iene(){
        if(Objects.equals(this.opcaoB, this.real)){
            return 0.048; //iene para real
        }else if(Objects.equals(this.opcaoB, this.euro)){
            return 0.0076; //iene para euro
        }else if(Objects.equals(this.opcaoB, this.dolar)){
            return 0.0087 ; //iene para dolar
        }else if(Objects.equals(this.opcaoB, this.iene)){
            return 1; //iene para iene
        }
        System.out.println("A opções 'b' está invalida");
        return 0;
    }

    public double getValorDeEntrada() {
        return valorDeEntrada;
    }

    public String getOpcaoA() {
        return opcaoA;
    }

    public String getOpcaoB() {
        return opcaoB;
    }

    public void setOpcaoA(String opcaoA) {
        this.opcaoA = opcaoA;
    }

    public void setOpcaoB(String opcaoB) {
        this.opcaoB = opcaoB;
    }

    //Converte o valor de entrada de String para double
    public void setValorDeEntrada(String valorDeEntrada) {
        this.valorDeEntrada = Double.parseDouble(valorDeEntrada);
    }

    //Teste para saber se a String e um double valido
    public boolean testLogicoValor(String entrada){
        try{
           double teste = Double.parseDouble(entrada);
           return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public boolean testLogicoNome(String nome){
        return nome.contains("real") || nome.contains("euro") || nome.contains("dolar") || nome.contains("iene");
    }

}
