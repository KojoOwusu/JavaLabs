package com.company.Test;

import com.company.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class CardTest {
    @Test

    public void testCardEquals(){
        Card card1 = new Card('S', 'T');
        Card card2 = new Card('S', 'T');

        Assert.assertTrue(card1.equals(card2));    //test if cards are equal by checking value
        Assert.assertEquals(card1.hashCode(), card2.hashCode());
    }

    @Test

    public void testCardOrdering(){
        Card card1 = new Card('D','J');
        Card card2 = new Card('D','A');
        Card card3 = new Card('C','2');
        Card card4 = new Card('D','K');
        Card card5 = new Card('D','7');
        ArrayList<Card> hand = new ArrayList<>();
        hand.add(card5);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        hand.add(card1);

        Collections.sort(hand, new CardComparator());

        for(var card: hand){
            System.out.println(card.toString());
        }
        //hand.stream().forEach(card-> System.out.println(card.toString()+" "+card.hashCode()));
    }

    @Test
    public void testDealer(){


        Player player1 = new Player("Kwadwo");
        Player player2 = new Player("Kwame");
        Player player3 = new Player("Kofi");
        Player player4 = new Player("Ama");
        Player player5 = new Player("Yaa");

        Table game1 = new Table(player1, player2, player3, player4, player5);  //creating table and seating 5 players
        Dealer dealer = new Dealer(game1);

       // dealer.getCards().stream().forEach(card -> System.out.println(card.toString()));
        dealer.dealHands();
        System.out.println(player1.showCard(0));

    }



}
