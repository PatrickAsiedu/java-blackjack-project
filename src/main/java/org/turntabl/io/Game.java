package org.turntabl.io;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private Deck deck;
    private List<Player> players;


    public Game(List<Player> players){
        deck = new Deck();
        this.players = players;
//        System.out.println(players);

    }


    public void start(){
        players.stream().forEach(player -> {
            player.receiveCard(deck.dealCard());
            player.receiveCard(deck.dealCard());
        });

        players.stream().forEach(player -> System.out.println(player.getCardsValue()));






    }
}
