package src;

import java.util.ArrayList;

public class GameManager {
    private final Raffle raffle;
    private final ArrayList<Player> players;

    public GameManager(int amountOfPlayers, Raffle Inputraffle) {
        raffle = Inputraffle;

        players = new ArrayList<>();

        for (int i = 0; i < amountOfPlayers; i++) {
            players.add(new Player(i));
        }

    }


    private void RollPlayer(Player thePlayer){


        int[] score = raffle.RaffleDices();

        thePlayer.SetScore(score);
        if (thePlayer.won()){
            return;
        }


      // recursive roll if double points hit.
        int firstValue = score[0];
        if (score[1] == firstValue) {
            RollPlayer(thePlayer);
        }



    }

    public Player StartGame(){

        int currentPlayer = 0;
        while (true) {  // Infinite loop until a player wins
            RollPlayer(players.get(currentPlayer)); // Roll for the current player

            if (players.get(currentPlayer).won()) { // Check if current player won
                return players.get(currentPlayer); // Return the winner
            }

            currentPlayer++; // Move to the next player

            // If we've gone through all players, reset back to the first player
            if (currentPlayer >= players.size()) {
                currentPlayer = 0;
            }
        }

    }


}
