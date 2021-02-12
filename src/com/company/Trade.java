package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Trade {
    private Integer ID;
    private String Symbol;
    private Integer quantity;
    private Double price;
    private LocalDate tradeDate;
    private LocalTime tradeTime;

   public Trade(Integer Id, String symbol, Integer quantity, Double price) {

        this.ID = Id;
        this.Symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        tradeDate = LocalDate.now();
        tradeTime = LocalTime.now();
    }

    public Trade(Integer Id, String symbol, Integer quantity){
        this.ID = Id;
        this.Symbol = symbol;
        this.quantity = quantity;
        tradeDate = LocalDate.now();
        tradeTime = LocalTime.now();
        price = 0.0;
    }

    public Double getPrice(){
        return price;
    }
    public Integer getQuantity(){
        return quantity;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "ID=" + ID +
                ", Symbol='" + Symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", tradeDate=" + tradeDate +
                ", tradeTime=" + tradeTime +
                '}';
    }
    public void setTrade(Double price){
        if(price > 0.0){
            this.price = price;
        }
        else{
            System.err.println("Price has to be more than $0.0");
        }
    }
    public LocalTime getTradeTime(){
       return tradeTime;
    }
    public abstract Double calcDividend();    //abstract method to calculate Dividend;

}
