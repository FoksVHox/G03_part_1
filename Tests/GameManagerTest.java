package Tests;

import Tests.GameManagerMockClasses.*;
import org.junit.jupiter.api.Test;
import src.GameManager;
import src.Player;
import src.Raffle;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GameManagerTest {



    @Test
    void Player1Wins(){
        Raffle mockRaffle = new MockRaffleClassReturnDoubleSix();
        GameManager sut = new GameManager(2,mockRaffle);

        Player playerWhoWon = sut.StartGame();

        assertEquals(0, playerWhoWon.playerPosition);



    }

    @Test
    void gameEndIfDouble6TwoTimesInARow(){
        Raffle mockRaffle = new MockRafflePlayer2Wins();
        GameManager sut = new GameManager(2,mockRaffle);

        Player playerWhoWon = sut.StartGame();

        assertEquals(1, playerWhoWon.playerPosition);
    }


    @Test
    void playerResetPointsIfDouble1(){

        //This mocks allocates 33 points to player 1 then double 1 and SUT should
        // handle not awarding victory afterwards
        Raffle mockRaffle = new MockRaffleDoubleOnes();
        GameManager sut = new GameManager(2,mockRaffle);

        Player playerWhoWon = sut.StartGame();

        assertEquals(1, playerWhoWon.playerPosition);

    }


    @Test
    void playerRollGetOneMoreRollIfDoubleRoll(){
        Raffle mockRaffle = new MockRaffleDouble_extraTurn();
        GameManager sut = new GameManager(2,mockRaffle);

        Player playerWhoWon = sut.StartGame();

        assertEquals(0, playerWhoWon.playerPosition);
    }


    @Test
    void toWinPlayerHaveTooRollDoubleAfter40PointsToWin(){

        Raffle mockRaffle = new MockRaffleDouble_extraTurn();
        GameManager sut = new GameManager(2,mockRaffle);

        Player playerWhoWon = sut.StartGame();

        assertEquals(0, playerWhoWon.playerPosition);

    }


}


