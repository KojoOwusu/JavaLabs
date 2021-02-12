package com.company;

import java.util.ArrayList;

public class Trader {
    private String name;
    private Account tradeAccount;

    public Trader(){
        tradeAccount = new Account();
    }

    public void addTrade(Trade trade){
        Double tradeValue = trade.getPrice()*trade.getQuantity();
        tradeAccount.setTradeValue(tradeValue);
        tradeAccount.setTrade(trade);
    }
    public Double getTradeAccountValue(){
        return tradeAccount.getTradeValue();
    }
    public ArrayList<Trade> getListofTrades(){
       return tradeAccount.getList();
    }
}
