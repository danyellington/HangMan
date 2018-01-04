import models.HangMan;

import org.junit.Test;
import static org.junit.Assert.*;


public class HangManTest {
    @Test
    public void compareAndFill_seeIfGuessCharIsPartOfAnswer_ArrayList() {
        HangMan testGame = new HangMan();
        testGame.setAnswer();
        assertEquals(testGame.compare('p'), testGame.compare('s'));
    }



    //    Getters & Setters
    @Test
    public void getAnswer_getsAnswer_Null() throws Exception {
        HangMan testGame = new HangMan();
        assertEquals(null, testGame.getAnswer());
    }

    @Test
    public void setAnswer_setsNewAnswer_String() throws Exception {
        HangMan testGame = new HangMan();
        testGame.setAnswer();
        assertEquals("epicodus", testGame.getAnswer());
    }

    @Test
    public void getGuess_getsGuess_char() throws Exception {
        HangMan testGame = new HangMan();
        testGame.setGuess('1');
        char[] guessArr = {'1'};
        assertEquals(guessArr[0], testGame.getGuess());
    }

    @Test
    public void setGuess_setsGuess_char() throws Exception {
        HangMan testGame = new HangMan();
        testGame.setGuess('b');
        char[] guessArr = {'b'};
        assertEquals(guessArr[0], testGame.getGuess());
    }
}