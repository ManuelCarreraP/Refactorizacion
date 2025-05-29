import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void scoresAreEqualReturnsLoveAll() {
        Assertions.assertEquals("Love-All", Main.getScore(0, 0));
    }

    @Test
    public void scoresAreEqualReturnsFifteenAll() {
        Assertions.assertEquals("Fifteen-All", Main.getScore(1, 1));
    }

    @Test
    public void scoresAreEqualReturnsThirtyAll() {
        Assertions.assertEquals("Thirty-All", Main.getScore(2, 2));
    }

    @Test
    public void scoresAreEqualReturnsFortyAll() {
        Assertions.assertEquals("Forty-All", Main.getScore(3, 3));
    }

    @Test
    public void scoresAreEqualReturnsDeuce() {
        Assertions.assertEquals("Deuce", Main.getScore(4, 4));
    }

    @Test
    public void deuceAtFiveFive() {
        Assertions.assertEquals("Deuce", Main.getScore(5, 5));
    }

    @Test
    public void deuceAtSixSix() {
        Assertions.assertEquals("Deuce", Main.getScore(6, 6));
    }

    @Test
    public void playerOneHasAdvantage() {
        Assertions.assertEquals("Advantage player1", Main.getScore(5, 4));
    }

    @Test
    public void playerTwoHasAdvantage() {
        Assertions.assertEquals("Advantage player2", Main.getScore(4, 5));
    }

    @Test
    public void playerOneHasAdvantageAtSevenSix() {
        Assertions.assertEquals("Advantage player1", Main.getScore(7, 6));
    }

    @Test
    public void playerTwoHasAdvantageAtEightNine() {
        Assertions.assertEquals("Advantage player2", Main.getScore(8, 9));
    }

    @Test
    public void playerOneWins() {
        Assertions.assertEquals("Win for player1", Main.getScore(6, 4));
    }

    @Test
    public void playerTwoWins() {
        Assertions.assertEquals("Win for player2", Main.getScore(4, 6));
    }

    @Test
    public void playerOneWinsAfterExtendedPlay() {
        Assertions.assertEquals("Win for player1", Main.getScore(10, 8));
    }

    @Test
    public void playerTwoWinsAfterExtendedPlay() {
        Assertions.assertEquals("Win for player2", Main.getScore(10, 12));
    }

    @Test
    public void playerOneScoresFifteenPlayerTwoScoresLove() {
        Assertions.assertEquals("Fifteen-Love", Main.getScore(1, 0));
    }

    @Test
    public void playerOneScoresThirtyPlayerTwoScoresFifteen() {
        Assertions.assertEquals("Thirty-Fifteen", Main.getScore(2, 1));
    }

    @Test
    public void playerOneScoresFortyPlayerTwoScoresThirty() {
        Assertions.assertEquals("Forty-Thirty", Main.getScore(3, 2));
    }

    @Test
    public void playerOneLovePlayerTwoFifteen() {
        Assertions.assertEquals("Love-Fifteen", Main.getScore(0, 1));
    }

    @Test
    public void playerOneThirtyPlayerTwoLove() {
        Assertions.assertEquals("Thirty-Love", Main.getScore(2, 0));
    }
}
