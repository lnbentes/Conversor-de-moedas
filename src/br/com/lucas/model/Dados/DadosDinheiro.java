package br.com.lucas.model.Dados;

import com.google.gson.Gson;

public class DadosDinheiro{

    LeitorURL leitorURL;
    Gson gson;

    public DadosDinheiro(){
        leitorURL = new LeitorURL();
        gson = new Gson();
    }

    //https://economia.awesomeapi.com.br/last/BRL-USD

    public double getDados(String URL) throws Exception {
        String json = leitorURL.readUrl(URL);
        //Tenho que fazer um filtro para ficar som com um json




        AtributosDinheiro real = gson.fromJson(json, AtributosDinheiro.class);

        //Posso manipular a informacao
        return real.getHigh();
    }


}
