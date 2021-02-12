package com.company;

import java.time.LocalTime;

public enum MembershipTypeEnum {
    BRONZE(5),SILVER(10),GOLD(20);

    int id;

    MembershipTypeEnum(int id){
        this.id=id;
    }
    //public int getValue(){
       // return id;
   // }
    public boolean canTradeBefore10(){
       return LocalTime.now().getHour()<10?false:true;
    }
}

