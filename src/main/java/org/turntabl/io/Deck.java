package org.turntabl.io;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Deck {
    private Stack<Card> cards;


    public Deck() {
        cards = new Stack<>();
        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                cards.push(new Card(suit,rank));
            }

        }
        shuffle();
//        System.out.println(cards);



    }


    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card dealCard(){
//        System.out.println(cards.size());
        return cards.pop();

    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }
}
