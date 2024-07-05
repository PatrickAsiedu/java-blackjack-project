package org.turntabl.io;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private Deck deck;
    private List<Player> players;
    boolean gameEnded = false;


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

//        while(!gameEnded){
//            players.stream().forEach(player -> {
//                playerTurn(player);
//                if(player.getCardsValue() == 21){
//                    gameEnded=false;
//                }
//            });
//
//        }


        determineWinner();



    }

    private void playerTurn(Player player){
        if(player.getCardsValue() < 17){
            player.receiveCard(deck.dealCard());
            System.out.println(player + "hits");

        }
        else if (player.getCardsValue() >= 17){
            System.out.println(player + "sticks");

        }
        else if (player.getCardsValue() > 21){
            System.out.println(player + "went bust");
        }



    }


    private void determineWinner(){

    }
}
