package springExample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age, Address address) {};
record Address(String firstline,String city) {};

@Configuration
public class HelloWorlddConfiguration {
	
	@Bean
	public String name()
	{
		return "Sameer";
		
	}
	@Bean
	public int Age() {
		return 21;
		
	}
	@Bean
	public Person Human() {
		return new Person("jeya",13,new Address("cooperative","colony"));
	}
	@Bean
	public Person Human1() {
		return new Person(name(),Age(), add1());
	}
	@Bean
	public Person Human3(String name,int Age,@Qualifier("sec3")Address add2) {
		return new Person(name,Age,add2);
	}
	@Bean(name = "address2")
	public Address add() {
		return new Address("sector 2D","Bokaro");
	}
	@Bean
	@Primary
	public Address add1() {
		return new Address("sector 1D","Bokaro");
	}
	
	@Bean(name="add2")
	@Qualifier("sec3")
	public Address add2() {
		return new Address("sector 3D","Bokaro");
	}
	

}
