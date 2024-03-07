import processing.core.*;

import classes.*;

public class App  extends PApplet{
   GyatGame game;

    public static void main(String[] args) {
        String[] processingArgs = {"MySketch"};
		App mySketch = new App();
		PApplet.runSketch(processingArgs, mySketch);
    }

    public void settings(){
        size(600, 400);
    }

    public void setup(){
     game = new GyatGame(10);
    }

    public void draw(){
        background(0);
        if (game.isWon()) {
            background(0,255,0);
        }
    }

    

    public void keyPressed(){
        if (key != CODED){
            game.guess(key-48);//minus 48, da det er 0 i Ascii, derfor bliver vores tal rigtige
        }
    }
}
