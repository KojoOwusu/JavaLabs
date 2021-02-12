package com.company;

import java.util.Comparator;

public class ShuffleComparator implements Comparator<Card> {

    public int compare(Card card1, Card card2){
        return (int)(Math.abs(card2.hashCode()-card1.hashCode()/5));
    }
}
