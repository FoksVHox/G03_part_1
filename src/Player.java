package src;

public class Player {
    public int playerPosition;
    private int score = 0;
    public Player(int playerPosition) {
        this.playerPosition = playerPosition;
    }
    public int GetScore(){
        return score;
    }

    public void SetScore(int score){
        this.score = score;
    }

}
