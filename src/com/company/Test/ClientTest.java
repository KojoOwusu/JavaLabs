package com.company.Test;

import com.company.BondTrade;
import com.company.Client;
import com.company.Trade;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

public class ClientTest {
    @Test
    public void testClientCanTrade(){
       Client newClient = new Client("Kwadwo", "Owusu" );
       Trade GOOGLtrade = new BondTrade(12,"GOOGL", 10, 50.5, 10.0);

       newClient.addTrade(GOOGLtrade);
       newClient.addTrade(GOOGLtrade);
       newClient.addTrade(GOOGLtrade);
       newClient.addTrade(GOOGLtrade);
       newClient.addTrade(GOOGLtrade);

    }
}
