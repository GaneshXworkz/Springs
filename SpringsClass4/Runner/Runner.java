package com.xworkz.Maven.SpringsClass4.Runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.Maven.SpringsClass4.BeenClass.Engine;
import com.xworkz.Maven.SpringsClass4.BeenClass.Ghost;
import com.xworkz.Maven.SpringsClass4.BeenClass.NewsPaper;
import com.xworkz.Maven.SpringsClass4.BeenClass.Snake;
import com.xworkz.Maven.SpringsClass4.Configration.ConfigrationClass4;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext ref=new AnnotationConfigApplicationContext(ConfigrationClass4.class);
		System.out.println(Arrays.toString(ref.getBeanDefinitionNames()));
		
		NewsPaper news=ref.getBean(NewsPaper.class);
		System.out.println(news);
		
		
		Engine eng=ref.getBean(Engine.class);
		System.out.println(eng);
		
		
		Ghost gost=ref.getBean(Ghost.class);
		System.out.println(gost);
		
	
		
		Snake snak=ref.getBean(Snake.class);
		System.out.println(snak);
		
	}
}
