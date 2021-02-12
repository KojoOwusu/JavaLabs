package com.company;

public class FundTrade extends Trade{
    private Double dividend;
    private Double dividendPercent;

   public FundTrade(Integer id, String Symbol, Integer quantity, Double price, Double percent){
        super(id, Symbol,quantity,price);
        this.dividendPercent = percent;
    }

    public FundTrade(Integer id, String Symbol, Integer quantity, Double price){
       super(id, Symbol,quantity,price);
    }

    public FundTrade(Integer Id, String Symbol, Integer quantity){
       super(Id, Symbol, quantity);
    }

    public Double calcDividend(){
        return (dividendPercent/100)*getPrice();
    }
}
