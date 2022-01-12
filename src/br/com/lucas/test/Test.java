package br.com.lucas.test;

import br.com.lucas.model.Dados.AtributosDinheiro;
import br.com.lucas.model.Dados.LeitorURL;
import com.google.gson.Gson;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws Exception {

//        Moedas moedas = new Moedas();
//
//        moedas.setOpcaoA("real");
//        moedas.setOpcaoB("dolar");
//        moedas.setValorDeEntrada("250.55");
//
//        moedas.resultado();

        /*
        Testando o isolamento do json
         */
        char[] quebrandoJson = new char[300];
        char[] isolarJason = new char[224];
        int interacoes = 0;
        String json = "";

        try{
            LeitorURL leitorURL = new LeitorURL();
            json = leitorURL.readUrl("https://economia.awesomeapi.com.br/last/BRL-USD");

        }catch (Exception e){
            System.out.println("Nao faz nada dirito, URL errada");
        }

        System.out.println(json.length());

        //Quebrando a String num array
        for(int i = 0; i < json.length(); i++){
            quebrandoJson[i] = json.charAt(i);
        }

        // Pegando so a secao quero da Sting
        for(int i = 10; i < (json.length() - 1); i++){
            System.out.print(quebrandoJson[i]);
            isolarJason[interacoes] = quebrandoJson[i];
            interacoes += 1;
        }

        System.out.println("");
        String jsonIsolado = new String(isolarJason);
        System.out.println(jsonIsolado);

        try{
            Gson gson = new Gson();
            AtributosDinheiro real = gson.fromJson(jsonIsolado, AtributosDinheiro.class);

            System.out.println(real.getLow());

        }catch (Exception e){
            System.out.println("Nao faz nada dirito, String errada");
        }


    }

}
