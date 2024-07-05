package org.turntabl.io;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> cards ;


    public Player(String name) {
        this.name = name;
        cards =new ArrayList<>();

    }

    public Player(List<Card> cards, String name) {
        this.cards = cards;
        this.name = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void receiveCard(Card card){
        cards.add(card);
        System.out.println(cards);
    }

    public int getCardsValue(){
        int value =0;

        for (Card card : cards){
            value=value+ card.getRank().getValue();
        }

        return value;

    }



    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;

    }
}
