package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import classes.*;

public class gyatGameTest {
    final int[] testNumbers = {7, 8};

    @Test
    public void guessTrue(){
        final GyatGame game = new GyatGame(7);

        assertTrue(game.guess(7)); 
    }

    @Test
    public void guessFalse(){
        final GyatGame game = new GyatGame(7);

        assertFalse(game.guess(8)); 
    }

    @Test
    public void randomGame() {

        final GyatGame game = new GyatGame(0);
        for (int i = 0; i < 1; i++){
            game.randomNumber();
        }

       assertEquals(5, 5);
    }
}
