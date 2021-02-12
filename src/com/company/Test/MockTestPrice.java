package com.company.Test;

import com.company.FundTrade;
import com.company.MallonExchange;
import com.company.Trade;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockTestPrice {

    @Mock
    MallonExchange mallonApi;

    @Before
    public void setUp(){
        Mockito.when(mallonApi.getPrice(Mockito.anyString(), Mockito.anyInt())).thenReturn(50.0);
    }

  //  @After
    @Test
    public void testGetTradePrice(){
        String TradeName = "Airbnb";
        Integer quantity = 5;
        FundTrade stock1 = new FundTrade(1, TradeName,quantity,mallonApi.getPrice(TradeName,quantity));

        Assert.assertEquals(50.0, stock1.getPrice(),0.001);
    }
}
