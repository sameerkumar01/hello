package com.joker.mario.jpmullin;

public class GameRunner {
    MarioGame game;
    public GameRunner(MarioGame game)
    {
 	   this.game=game;
 	   
    }
    public void run()
    {
 	   System.out.println("runing game"+ game);
    }

}
