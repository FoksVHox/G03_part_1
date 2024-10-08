package src;

import java.util.ArrayList;

public class Player {
    public int playerPosition;
    private int score = 0;
    private final ArrayList<int[]> results;

    public Player(int playerPosition) {
        results = new ArrayList<>();
        this.playerPosition = playerPosition;
    }

    public int GetTotalScore(){
        return score;
    }

    public void SetScore(int[] newScores){
        for (int individualScore :newScores){
            this.score += individualScore;
        }
        results.add(newScores);

        if (IsDoubleOnes(newScores)){
            this.score = 0;
        }



        // If we have more than two sets of scores, remove the oldest one
        if (results.size() > 2) {
            popOldestScores();
        }
    }

    private void popOldestScores() {
        results.remove(0);
    }

    private boolean IsDoubleOnes(int[] newScores) {
        int sum = 0;
        for (int scoreArray : newScores) {
            sum += scoreArray;

        }
        return sum == 2;


    }

    public boolean won() {

        if (DidThePlayerHitDouble6()){
            return true;
        }

        if (score>=40){
            return hitDoubleDice(results.get(1));
        }

        return false;

    }

    private boolean hitDoubleDice(int[] currentRoll) {
        int firstValue = currentRoll[0];
        return currentRoll[1] == firstValue;
    }

    private boolean DidThePlayerHitDouble6() {
        int sum = 0;
        for (int[] scoreArray : results) {
            // Sum each individual score in the array
            for (int score : scoreArray) {
                sum += score;
            }
        }

        return sum == 4 * 6;
    }
}
