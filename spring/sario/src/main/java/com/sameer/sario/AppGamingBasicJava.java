package com.sameer.sario;

import com.sameer.sario.mario.ContraGame;
import com.sameer.sario.mario.GameRunner;
import com.sameer.sario.mario.MarioGame;

public class AppGamingBasicJava {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var games = new MarioGame();
		
		var games = new ContraGame();
		var gameRunner = new GameRunner(games);
		gameRunner.run();
		
	}
}
