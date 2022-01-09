package br.com.lucas.test;

import br.com.lucas.model.Dados.DadosReal;
import br.com.lucas.model.LeitorURL;
import br.com.lucas.model.Moedas;
import br.com.lucas.model.Real;
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

        LeitorURL leitorURL = new LeitorURL();
        String json = leitorURL.readUrl("https://economia.awesomeapi.com.br/last/BRL-USD");
        Gson gson = new Gson();
        DadosReal real = gson.fromJson(json, DadosReal.class);

        System.out.println(json);
        System.out.println(real.getLow());

    }

}
