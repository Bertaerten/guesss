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
    public void testRandomNumber() {
        final int antal = 100;
        final int ForventetTalMængde = 10;
        int hvorMange1 = 0;
        GyatGame game = new GyatGame(5);

        for (int i = 0; i < antal; i++) {
            int randomNumber = game.randomNumber();
            if (randomNumber == 1) {
                hvorMange1++;
            }
        }
        
        assertEquals(ForventetTalMængde, hvorMange1);
    }
}
