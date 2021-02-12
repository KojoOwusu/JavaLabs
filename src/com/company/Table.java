package com.company;

import java.util.*;

public class Table {
    Queue<Player> players = new LinkedList<Player>();
    private Dealer dealer;
    Map<Integer, Player>seatedPlayers = new HashMap<>(5);

    public Table(Player... players){
        Arrays.stream(players).forEach(player -> this.players.offer(player));   //add players to table
        //seat first 5 players
        seatPlayers();
    }

    private void seatPlayers(){
        Integer seatNumber = 1;
            try {
                for (int i = 0; i < 5; i++) {
                    seatedPlayers.put(seatNumber, players.remove());
                    seatNumber++;
                }
            }catch(Exception e){
                System.err.println(e.getMessage());
            }
    }

    public Player getPlayer(Integer seatPosition){
        return seatedPlayers.get(seatPosition);
    }
}
