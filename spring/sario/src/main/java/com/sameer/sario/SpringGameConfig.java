package com.sameer.sario;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.sameer.sario.mario.GameRunner;
import com.sameer.sario.mario.Gamer;
import com.sameer.sario.mario.MarioGame;
import com.sameer.sario.mario.Pacman;

@Configuration
public class SpringGameConfig {

	@Bean
	@Qualifier("help")
	public Gamer game()
	{
		var game= new MarioGame();
		return game;
	}
	@Bean
	public GameRunner runner(Gamer game)
	{
		var hero = new GameRunner(game);
		return hero;
	}
	@Bean
	@Primary
	public Gamer Pgame()
	{
		var game = new Pacman();
		return game;
		
		
		
	}

}
