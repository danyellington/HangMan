import models.HangMan;

import org.junit.Test;
import static org.junit.Assert.*;

public class HangManTest {
    @Test
    public void getAnswer_getsAnswer_Null() throws Exception {
        HangMan testGame = new HangMan();
        assertEquals(null, testGame.getAnswer());
    }

    @Test
    public void setAnswer_setsNewAnswer_String() throws Exception {
        HangMan testGame = new HangMan();
        testGame.setAnswer("Working");
        assertEquals("Working", testGame.getAnswer());
    }

    @Test
    public void getGuess_getsGuess_char() throws Exception {
        HangMan testGame = new HangMan();
        testGame.setGuess('1');
        assertEquals('1', testGame.getGuess());
    }

    @Test
    public void setGuess_setsGuess_char() throws Exception {
        HangMan testGame = new HangMan();
        testGame.setGuess('b');
        assertEquals('b', testGame.getGuess());
    }
}