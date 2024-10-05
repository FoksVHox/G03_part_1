package src;

import java.util.ArrayList;

public class GameManager {
    private Raffle raffle;
    private ArrayList<Player> players;

    public GameManager(int amountOfPlayers, Raffle Inputraffle) {

        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        int amountOfPlayers = scanner.nextInt();

        raffle = Inputraffle;
        throw new UnsupportedOperationException("not implemented yet");

    }

    private void setPlayerScore(){
        throw new UnsupportedOperationException("not implemented yet");
        int currentScore = GetScore();


    }
    public Player StartGame(){
        throw new UnsupportedOperationException("not implemented yet");
        //While loop to keep the game running
        while () {
            // Win condition 1 player
            if (score == 40) {
                System.out.println(player + "wins");
            // Win condition 2
            } else if () {

            }

        }
    }
}