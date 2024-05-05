package com.br.marcenaria.integrada.model.prices;

import com.br.marcenaria.integrada.model.Mdf;

public class MdfPrices {
    private double price;
    private double m2=5.04;

    private double calculatedPrice(Mdf mdf){
        double finalPrice = mdf.getPrice_acabamento() / m2;
        return finalPrice;
    }

}
