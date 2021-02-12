package com.company;
import java.util.Objects;

public class Card implements Comparable<Card>{
    private Character suit;
    private Character value;

    public Card(Character suit, Character value){
        this.suit=suit;
        this.value=value;
    }

    @Override
    public String toString() {
        return "Card{" +value + suit + '}';
    }
    @Override
    public boolean equals(Object card) {
        Card otherCard = (Card)card;
        return (this.suit.charValue()==otherCard.suit.charValue()&&this.value.charValue()==otherCard.value.charValue());
    }

    @Override
    public int hashCode() {
       // return Objects.hash(value,suit);

        //int hashCodeSum =0;
        int newSuitValue=0;
        int newValue=0;
        switch(this.value.charValue()) {
            case 50:
                newValue = 250;
                break;
            case 51:
                newValue = 245;
                break;
            case 52:
                newValue = 235;
                break;
            case 53:
                newValue = 220;
                break;
            case 54:
                newValue = 210;
                break;
            case 55:
                newValue = 190;
                break;
            case 56:
                newValue = 180;
                break;
            case 57:
                newValue = 170;
                break;
            case 74:
                newValue = (int) this.value.charValue() + 8;
                break;
            default:
                newValue = this.value.charValue();
        }
        switch(this.suit.charValue()){
            case 83:
                  newSuitValue =1;
                  break;
            case 68:
                newSuitValue =2;
                break;
            case   67:
                newSuitValue =3;
                 break;
            case 72:
                newSuitValue =4;
                break;
        }
           return newSuitValue+newValue;
    }

    @Override
    public int compareTo(Card card) {
          return this.hashCode()-card.hashCode();

                //J   -   K  = -           AS   AH   AD   AC   KS KH KD KC QS QH QD QC JS JH JD JC TS TH TD TC 9S 9H 9D 9C .....
                               //         97   137  133  132
    }
}
