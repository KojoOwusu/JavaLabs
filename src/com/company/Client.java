package com.company;

import java.time.LocalTime;
import java.util.ArrayList;

public class Client {
    private String firstName;
    private ArrayList<Trade> tradesList = new ArrayList<>();
    private String lastName;
    private Boolean exceededMaxTradeValue = false;
    private Integer points=0;
    private MembershipTypeEnum membershipStatus;    //Bronze membership less than 10 points, Silver between 10 and 19 and Gold is 20>

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //membershipStatus = new MembershipType();
        System.out.println("Created Client");
    }

    public void addTrade(Trade trade) {
        if(canTrade(trade)){
            switch(points){
                case 0:
                    membershipStatus = MembershipTypeEnum.BRONZE;
                    points++;
                    System.out.println("You are now a Bronze Member");
                    break;
                case 9:
                    membershipStatus = MembershipTypeEnum.SILVER;
                    points++;
                    System.out.println("You are now a Silver Member");
                    break;
                case 19:
                    membershipStatus = MembershipTypeEnum.GOLD;
                    points++;
                    System.out.println("You are now a Gold Member");
                    break;
                default:
                    points++;
            }
        }
        else
            System.out.println("Sorry you have reached your limit");
    }

    private boolean canTrade(Trade trade) {

        if (membershipStatus.name().equals("Bronze") && (points.equals(membershipStatus.ordinal()) || membershipStatus.canTradeBefore10())) {
            return false;
        }
        else if (membershipStatus.name().equals("Gold") && (points.equals(membershipStatus.ordinal()))){
            return false;
        }else if (membershipStatus.name().equals("Silver") && ( points.equals(membershipStatus.ordinal()) || exceededMaxTradeValue)){
            return false;
        }
        else
            return true;
    }
    public MembershipTypeEnum getMembershipStatus(){
        return membershipStatus;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", points=" + points +
                ", membershipStatus=" + membershipStatus.name() +
                '}';
    }
}
