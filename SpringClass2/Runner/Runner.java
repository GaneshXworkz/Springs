package com.xworkz.Maven.SpringClass2.Runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Maven.SpringClass2.Configration.Configration;
import com.xworkz.Maven.SpringClass2.Things.Actor;
import com.xworkz.Maven.SpringClass2.Things.Rocket;
import com.xworkz.Maven.SpringClass2.Things.Season;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(Configration.class);

		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));

		Rocket rocketref = spring.getBean("rocket", Rocket.class);
		System.out.println(rocketref);
		System.out.println(rocketref.getCountry());
		System.out.println(rocketref.getName());
		System.out.println(rocketref.getBudget());
		
		Rocket rocketref1 = spring.getBean("jetRocket", Rocket.class);
		System.out.println(rocketref1);
		
		rocketref1.setName("ARAB");
		rocketref1.setCountry("UAE");
		rocketref1.sevoidtBudget(748);
		System.out.println(rocketref1.getCountry());
		System.out.println(rocketref1.getName());
		System.out.println(rocketref1.getBudget());
		
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));

		
		Actor actor=spring.getBean("actor",Actor.class);
		System.out.println(actor);
		System.out.println(actor.getName());
		System.out.println(actor.getLanguage());
		System.out.println(actor.getAge());
		
		
		Actor actor1=spring.getBean("DHARSHAN",Actor.class);
		System.out.println(actor1);
		System.out.println(actor1.getName());
		System.out.println(actor1.getLanguage());
		System.out.println(actor1.getAge());

		
		Season season=spring.getBean("Summer",Season.class);
		System.out.println(season);
		System.out.println(season.getName());
		System.out.println(season.getDuration());
		System.out.println(season.getStartingMonth());
		
		Season season1=spring.getBean("Winter",Season.class);
		System.out.println(season1);
		System.out.println(season1.getName());
		System.out.println(season1.getDuration());
		System.out.println(season1.getStartingMonth());
	}
	

}
