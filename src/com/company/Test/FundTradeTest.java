package com.company.Test;

import com.company.BondTrade;
import com.company.FundTrade;
import org.junit.Assert;
import org.junit.Test;

public class FundTradeTest {
    @Test

    public void testDividend(){
        FundTrade bondTrade1 = new FundTrade(14, "GOOGL", 20, 10.52, 15.0);
        Double dividend = (15.0/100)*10.52;
        Assert.assertEquals(dividend, bondTrade1.calcDividend(),0.001);
    }
}
