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
		System.out.println(news.getName());
		System.out.println(news.getId());
		System.out.println(news.getLangauge());
		System.out.println(news.getOwnerName());
		System.out.println(news.getPrize());
		
		Engine eng=ref.getBean(Engine.class);
		System.out.println(eng);
		System.out.println(eng.getName());
		System.out.println(eng.getCompany());
		System.out.println(eng.getNumber());
		System.out.println(eng.getStrokes());
		System.out.println(eng.getType());
		System.out.println(eng.getVersion());
		
		Ghost gost=ref.getBean(Ghost.class);
		System.out.println(gost);
		System.out.println(gost.getAge());
		System.out.println(gost.getColour());
		System.out.println(gost.getCreamationPlace());
		System.out.println(gost.getDethPlace());
		System.out.println(gost.getGender());
		System.out.println(gost.getNailsLength());
		System.out.println(gost.getName());
		System.out.println(gost.getReason());
		System.out.println(gost.getDethDate());
		System.out.println(gost.getDethtime());
	
		
		Snake snak=ref.getBean(Snake.class);
		System.out.println(snak);
		System.out.println(snak.getName());
		System.out.println(snak.getColour());
		System.out.println(snak.getLength());
		System.out.println(snak.isPoisionous());
		System.out.println(snak.getType());

	}
}
