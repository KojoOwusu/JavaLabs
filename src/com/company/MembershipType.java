package com.company;

public class MembershipType {
    private String value;
   private Integer tradeLimit=0;
   private Boolean canTrade= true;

    public MembershipType(){
        value="None";
    }

    public void setMembership(String value){
        this.value=value;
    }
    public String getMembershipStatus(){
        return value;
    }
    public void setTradeLimit(Integer tradeLimit) {
        this.tradeLimit = tradeLimit;
    }

    public Integer getTradeLimit() {
        return tradeLimit;
    }
    public Boolean getCanTrade(){
        return canTrade;
    }
}


