package classes;

import processing.core.PApplet;
import java.util.ArrayList; 
//import java.util.List;

public class GyatGame {
 
    private int guessedNumber;
    private int  secretNumber;
    private boolean correct ;


    public GyatGame(int start){
        
        secretNumber = start;
    }

    public int randomNumber (){
        
        return secretNumber;
    }

    public boolean guess(int guess){
        
        guessedNumber = guess;
        System.out.println(guessedNumber);

        if(guessedNumber== secretNumber){
            secretNumber= randomNumber();
            correct = true;
            return correct;
        }
        else{
            secretNumber= randomNumber();
            correct = false;
            return correct;
        }

        
    }

 
    public boolean isWon() {
        return correct;
    }


}
