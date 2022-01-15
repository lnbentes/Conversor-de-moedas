package br.com.lucas.test;

import br.com.lucas.model.Dados.DadosDoJson;
import br.com.lucas.model.Dados.DesserializaçãoJson;
import br.com.lucas.model.Dados.LeitorURL;
import com.google.gson.Gson;

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
        String json = "";

        try{
            LeitorURL leitorURL = new LeitorURL();
            json = leitorURL.readUrl("https://economia.awesomeapi.com.br/last/BRL-USD,BRL-EUR,BRL-JPY,USD-BRL,USD-EUR,USD-JPY,EUR-BRL,EUR-USD,EUR-JPY,JPY-BRL,JPY-USD,JPY-EUR");

        }catch (Exception e){
            System.out.println("Nao faz nada dirito, URL errada");
        }

        System.out.println(json.length());
        System.out.println(json);

        try{
            Gson gson = new Gson();
            DadosDoJson real = gson.fromJson(json, DadosDoJson.class);

            System.out.println(real.getRealEuro());
            System.out.println(real.getRealDolar());
            System.out.println(real.getRealIene());

        }catch (Exception e){
            System.out.println("Nao faz nada dirito, String errada: \n" + e);
        }

    }

}
