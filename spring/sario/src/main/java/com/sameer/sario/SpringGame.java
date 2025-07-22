package com.sameer.sario;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sameer.sario.mario.GameRunner;
import com.sameer.sario.mario.Gamer;

public class SpringGame {
	
	public static void main (String args[]) {
		
		try(var kk = new AnnotationConfigApplicationContext(SpringGameConfig.class);)
		{
			kk.getBean(Gamer.class).jump();
	//		kk.getBean(GameRunner.class).run();
		
		}
		
	}

}
