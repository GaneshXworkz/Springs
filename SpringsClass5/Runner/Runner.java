package com.xworkz.Maven.SpringsClass5.Runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Maven.SpringsClass5.BeenClass.Battery;
import com.xworkz.Maven.SpringsClass5.BeenClass.Movie;
import com.xworkz.Maven.SpringsClass5.BeenClass.Producer.Producer;
import com.xworkz.Maven.SpringsClass5.Configration.ConfigrtaionSpringClass5;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext ref=new AnnotationConfigApplicationContext(ConfigrtaionSpringClass5.class);
		System.out.println(Arrays.toString(ref.getBeanDefinitionNames()));
		
		
		Movie mov=ref.getBean(Movie.class);
		System.out.println(mov);
		
		System.out.println("------------------------------------");
		
		Producer pro=ref.getBean(Producer.class);
		System.out.println(pro);
		
		System.out.println("------------------Battry---------------------");
		Battery bat=ref.getBean(Battery.class);
		bat.checkPropertyRef();
		System.out.println(bat);
	
	}
}
