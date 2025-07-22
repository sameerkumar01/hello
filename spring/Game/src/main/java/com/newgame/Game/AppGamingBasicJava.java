package com.newgame.Game;

import com.newgame.Game.joggle.GameRunner;
import com.newgame.Game.joggle.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var mariogame = new MarioGame();
		var gameRunner = new GameRunner(mariogame);
		gameRunner.run();
		
	}

}
