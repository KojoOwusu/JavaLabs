package com.company.Test;
import com.company.BondTrade;
import com.company.Trade;
import com.company.Trader;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class TradeTest {

    @Test
    public void testPositiveTrade(){
       // Trade newTrade = new Trade(15,"STBKS",15,0.0);

      //  newTrade.setTrade(20.5);
        //assertTrue(newTrade.getPrice()>=0.0);    //price doesnt change when price is negative
    }

    @Test
    public void testTradeList(){
        Trader newTrader = new Trader();
        BondTrade stockTrade = new BondTrade(5, "AMZN",4,12.4,10.0);
        newTrader.addTrade(stockTrade);
        newTrader.addTrade(stockTrade);
        newTrader.addTrade(stockTrade);
        newTrader.addTrade(stockTrade);
        newTrader.addTrade(stockTrade);

        newTrader.getListofTrades().stream().map(Trade::toString).forEach(System.out::println);
    }

    @Test
    public void testPrintTradesUnderValue(){
        double limit = 10.0;
        Trader newTrader = new Trader();
        BondTrade stockTrade = new BondTrade(5, "AMZN",4,12.4,10.0);
        BondTrade stockTrade2 = new BondTrade(6, "NTLIX",4,9.4,10.0);
        newTrader.addTrade(stockTrade);
        newTrader.addTrade(stockTrade2);
        newTrader.addTrade(stockTrade);
        newTrader.addTrade(stockTrade2);
        newTrader.addTrade(stockTrade);

        newTrader.getListofTrades().stream().filter(trade -> trade.getPrice()<10.0).forEach(System.out::println);
    }
}
