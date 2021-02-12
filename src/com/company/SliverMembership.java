package com.company;

public class SliverMembership extends MembershipType{
    private boolean canTrade;

    public SliverMembership(){
        setMembership("Silver");
        setTradeLimit(10);

    }
}
