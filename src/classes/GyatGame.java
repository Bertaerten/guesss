package classes;

import processing.core.PApplet;
import processing.core.PVector;

import java.util.*; 
//import java.util.List;

public class GyatGame {
 
    private int guessedNumber;
    private int  secretNumber;
    private boolean correct ;


    public GyatGame(int start){
        
        secretNumber = start;
    }

    public int randomNumber (){
        secretNumber = (int)(Math.random()*10);//giver et tilfældigt tal mellem 0 og 9 inkluderende de to
        System.out.println(secretNumber);
        return secretNumber;
    }


    public boolean guess(int guess){
        
        guessedNumber = guess;

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
