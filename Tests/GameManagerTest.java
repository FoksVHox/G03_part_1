package Tests;

import Tests.GameManagerMockClasses.MockRaffleClassReturnDoubleSix;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import src.GameManager;
import src.Player;
import src.Raffle;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GameManagerTest {

    @Test
    void StartGame() {


        String simulatedInput = "\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());

    }

    @Test
    void Player1Wins(){
        Raffle mockRaffle = new MockRaffleClassReturnDoubleSix();
        GameManager sut = new GameManager(2,mockRaffle);

        Player playerWhoWon = sut.StartGame();

        assertTrue(playerWhoWon.playerPosition == 1);



    }

    @Test
    void gameEndIfDouble6TwoTimesInARow(){


    }


    @Test
    void playerResetPointsIfDouble1(){

    }


    @Test
    void playerRollGetOneMoreRollIfDoubleRoll(){

    }


    @Test
    void toWinPlayerHaveTooRollDoubleAfter40PointsToWin(){
        //
    }


}


