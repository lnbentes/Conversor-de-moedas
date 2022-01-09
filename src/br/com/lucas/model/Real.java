package br.com.lucas.model;

import br.com.lucas.model.Dados.DadosReal;
import com.google.gson.Gson;

public class Real {

    LeitorURL leitorURL;
    DadosReal dadosReal;
    Gson gson;

    public Real(){
        leitorURL = new LeitorURL();
        dadosReal = new DadosReal();
        gson = new Gson();
    }

    public double getRealDolar() throws Exception {
        String json = leitorURL.readUrl("https://economia.awesomeapi.com.br/last/BRL-USD");
        //Tenho que fazer um filtro para ficar som com um json
        DadosReal real = gson.fromJson(json, DadosReal.class);

        //Posso manipular a informacao
        return real.getHigh();
    }


}
