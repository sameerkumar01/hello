package springExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sameer.sario.mario.ContraGame;
import com.sameer.sario.mario.GameRunner;
import com.sameer.sario.mario.MarioGame;

public class AppGamingBasicJava2 {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(HelloWorlddConfiguration.class);
//		System.out.println(context.getBean("name"));
//		System.out.println(context.getBean("Age"));
//		System.out.println(context.getBean("Human"));
//		System.out.println(context.getBean("Human1"));
	System.out.println(context.getBean("Human3"));
//		System.out.println(context.getBean("address2"));
//		System.out.println(context.getBean(Address.class));
		
		
}
}
