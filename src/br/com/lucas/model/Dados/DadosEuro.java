package br.com.lucas.model.Dados;

public class DadosEuro {
    String code;
    String codein;
    String name;
    double high;
    double low;
    double varBid;
    double pctChange;
    double bid;
    double ask;
    String timestamp;
    String create_date;

    public double getHigh() {
        return high;
    }

    public double getLow() {
        return low;
    }
}
