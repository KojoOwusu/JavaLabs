package com.company;

import java.util.ArrayList;

public class Account {
    private Double totalTradeValue=0.0;

    private ArrayList<Trade> tradesList;

    public Account(){
        tradesList = new ArrayList<>();
    }

    public Double getTradeValue() {
        return  totalTradeValue;
        }

        void setTrade(Trade trade){
           tradesList.add(trade);
        }

     ArrayList<Trade> getList(){
        return tradesList;
     }

     void setTradeValue(double tradeValue){
        totalTradeValue += tradeValue;
        }
    }
