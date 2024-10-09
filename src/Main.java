package src;

public class Main {
    public static void main(String[] args) {

        Raffle ProductionRaffle = new Raffle();

        GameManager currentGame = new GameManager(2,ProductionRaffle);

        int PlayerWhoWon = currentGame.StartGame().playerPosition + 1;

        System.out.println("Congratulation, Player :"+PlayerWhoWon +" Won");

    }
}
