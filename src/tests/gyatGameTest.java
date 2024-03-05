package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import classes.*;

public class gyatGameTest {
    final String[] testWords = {"7", "8"};

    @Test
    public void guessTrue(){
        final GyatGame game = new GyatGame("7");

        assertTrue(game.guess("7")); 
    }

    @Test
    public void guessFalse(){
        final GyatGame game = new GyatGame("7");

        assertFalse(game.guess("8")); 
    }
}
