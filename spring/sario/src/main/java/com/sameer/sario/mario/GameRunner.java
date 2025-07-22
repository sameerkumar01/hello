package com.sameer.sario.mario;

public class GameRunner {
    Gamer game;
    public GameRunner(Gamer gae)
    {
 	   this.game=gae;
 	   
    }
    public void run()
    {
 	   System.out.println("runing game \n "+ game);
 	   game.jump();
 	   game.down();
 	   game.left();
 	   game.right();
 	   
    }
    
}
