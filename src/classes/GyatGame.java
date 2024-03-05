package classes;

import processing.core.PApplet;
import java.util.ArrayList; 
//import java.util.List;

public class GyatGame {
 
    private int guessedNumber;
    private int  secretNumber;


    public GyatGame(int start){
        
        secretNumber = start;
    }

    public int randomNumber (){
        
        return secretNumber;
    }

    public boolean guess(int guess){
        guessedNumber = guess;

        if(guessedNumber== secretNumber){
            secretNumber= randomNumber();
            return true;
        }
        else{
            secretNumber= randomNumber();
            return false;
        }

        
    }

 



}
