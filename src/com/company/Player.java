package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player {
    private String playerName;
    private ArrayList<Card> handOfCards = new ArrayList<>(6);

    public Player(String name, Card hand){
        this.playerName = name;
        handOfCards.add(hand);
    }
    public Player(String name){
        this.playerName = name;

    }
    public Card showCard(Integer position){
        return handOfCards.get(position);
    }
    public void getCard(Card c){
        handOfCards.add(c);
    }

    @Override
    public String toString() {
        return
                "playerName='" + playerName +"'"
                ;

    }
}
