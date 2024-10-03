package Tests;

import org.junit.jupiter.api.Test;
import src.Die;
import src.Player;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getScore() {
        Player playerInstance = new Player();
        int score = playerInstance.GetScore();
        assertEquals(0, score);
    }

    @Test
    void setScore() {
        Player playerInstance = new Player();
        playerInstance.SetScore(10);
        int score = playerInstance.GetScore();
        assertEquals(10, score);
    }
}