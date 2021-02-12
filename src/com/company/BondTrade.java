package com.company;

public class BondTrade extends Trade{
    private Double dividend;

    public BondTrade(Integer Id, String symbol, Integer quantity, Double price, Double dividend){
        super(Id, symbol, quantity, price);
        this.dividend = dividend;
    }
    public Double calcDividend(){
        return dividend;
    }
}
