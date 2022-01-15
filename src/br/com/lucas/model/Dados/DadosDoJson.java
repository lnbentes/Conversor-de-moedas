package br.com.lucas.model.Dados;

public class DadosDoJson {
    ValoresDinheiro BRLUSD;
    ValoresDinheiro BRLEUR;
    ValoresDinheiro BRLJPY;

    ValoresDinheiro USDBRL;
    ValoresDinheiro USDEUR;
    ValoresDinheiro USDJPY;

    ValoresDinheiro EURBRL;
    ValoresDinheiro EURUSD;
    ValoresDinheiro EURJPY;

    ValoresDinheiro JPYBRL;
    ValoresDinheiro JPYUSD;
    ValoresDinheiro JPYEUR;

    private class ValoresDinheiro {
        String code;
        String codein;
        String name;
        double high;
        double low;
        double varBid;
        double pctChange;
        double bid;
        double ask;
        String timeStamp;
        String createDate;
    }

    public double getRealDolar(){
        return BRLUSD.ask;
    }
    public double getRealEuro(){
        return BRLEUR.ask;
    }
    public double getRealIene(){
        return BRLJPY.ask;
    }

    public double getDolarReal(){
        return USDBRL.ask;
    }
    public double getDolarEuro(){
        return USDEUR.ask;
    }
    public double getDolarIene(){
        return USDJPY.ask;
    }

    public double getEuroReal(){
        return EURBRL.ask;
    }
    public double getEuroDolar(){
        return EURUSD.ask;
    }
    public double getEuroIene(){
        return EURJPY.ask;
    }

    public double getIeneReal(){
        return JPYBRL.ask;
    }
    public double getIeneDolar(){
        return JPYUSD.ask;
    }
    public double getIenEuro(){
        return JPYEUR.ask;
    }

}
