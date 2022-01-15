package br.com.lucas.model.Dados;

import com.google.gson.Gson;

public class DesserializaçãoJson {

    LeitorURL leitorURL;
    Gson gson;
    String json;
    DadosDoJson moeda;

    public DesserializaçãoJson(){
        leitorURL = new LeitorURL();
        gson = new Gson();
    }

    public DadosDoJson getDados() throws Exception {
        try{
            json = leitorURL.readUrl("https://economia.awesomeapi.com.br/last/" +
                    "BRL-USD,BRL-EUR,BRL-JPY,USD-BRL,USD-EUR,USD-JPY,EUR-BRL,EUR-USD,EUR-JPY,JPY-BRL,JPY-USD,JPY-EUR");
        }catch (Exception e){
            System.out.println("URL errada");
        }


        try{
            moeda = gson.fromJson(json, DadosDoJson.class);
        }catch (Exception e){
            System.out.println("String Json errada: \n" + e);
        }

        return moeda;
    }


}
