package com.joker.mario;

import com.joker.mario.jpmullin.GameRunner;
import com.joker.mario.jpmullin.MarioGame;

public class AppBasicGamingJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var mariogame = new MarioGame();
		var gameRunner = new GameRunner(mariogame);
		gameRunner.run();
		
	}
}
