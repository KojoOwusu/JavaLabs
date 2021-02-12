package com.company;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Dealer {
    ArrayList<Card> deck = new ArrayList<>(52);
    private Table table;

    public Dealer(Table t){
        table = t;
        List<Character> suits = Arrays.asList('S','D','C','H');
        List<Character> values = Arrays.asList('2','3','4','5','6','7','8','9','T','J','Q','K','A');

        for(var s: suits){
            for(var v: values){
                deck.add(new Card(s,v));
            }
        }
       shuffleDeck();
    }
    private void shuffleDeck(){    //shuffle deck by some strategy
        Collections.sort(deck, new ShuffleComparator());
    }
    public ArrayList<Card> getCards(){
        return deck;
    }

    public void dealHands(){
        for(int i=0;i<5;i++){
            table.getPlayer(i+1).getCard(deck.get(i));
        }
       // return hands;
    }
}
