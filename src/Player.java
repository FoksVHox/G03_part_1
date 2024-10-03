package src;

public class Player {
    public int playerPosition;
    private int score = 0;
    public Player(int playerPosition) {
        this.playerPosition = playerPosition;
    }
    public int GetScore(){
        throw new UnsupportedOperationException("not implemented yet");
    }

    public void SetPlayerPosition(int position){
        this.playerPosition = position;
    }
    public void SetScore(int score){
        throw new UnsupportedOperationException("not implemented yet");
    }

}
