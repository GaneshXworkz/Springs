package com.xworkz.Maven.SpringClass1.Runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Maven.SpringClass1.Configration.SpringConfigration;
import com.xworkz.Maven.SpringClass1.Things.Application;
import com.xworkz.Maven.SpringClass1.Things.Area;
import com.xworkz.Maven.SpringClass1.Things.Bus;
import com.xworkz.Maven.SpringClass1.Things.Chocolate;
import com.xworkz.Maven.SpringClass1.Things.City;
import com.xworkz.Maven.SpringClass1.Things.Cycle;
import com.xworkz.Maven.SpringClass1.Things.Fish;
import com.xworkz.Maven.SpringClass1.Things.Girl;
import com.xworkz.Maven.SpringClass1.Things.God;
import com.xworkz.Maven.SpringClass1.Things.Mask;
import com.xworkz.Maven.SpringClass1.Things.Milk;
import com.xworkz.Maven.SpringClass1.Things.Temple;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext ref=
				new AnnotationConfigApplicationContext(SpringConfigration.class);
		
		
		
		System.out.println("************************************************");
		
		Application ref1=ref.getBean(Application.class);
		System.out.println(ref1);
		
		System.out.println("************************************************");
		Area ref2=ref.getBean(Area.class);
		System.out.println(ref2);

		
		System.out.println("************************************************");
		Bus ref3=ref.getBean(Bus.class);
		System.out.println(ref3);
		
		System.out.println("************************************************");
		Chocolate ref4=ref.getBean(Chocolate.class);
		System.out.println(ref4);
		
		System.out.println("************************************************");
		City ref5=ref.getBean(City.class);
		System.out.println(ref5);
		
		System.out.println("************************************************");
		Cycle ref6=ref.getBean(Cycle.class);
		System.out.println(ref6);
		
		System.out.println("************************************************");
		Fish ref7=ref.getBean(Fish.class);
		System.out.println(ref7);

		System.out.println("************************************************");
		Girl ref8=ref.getBean(Girl.class);
		System.out.println(ref8);
		

		System.out.println("************************************************");
		God ref9=ref.getBean(God.class);
		System.out.println(ref9);
		

		System.out.println("************************************************");
		Temple ref10=ref.getBean(Temple.class);
		System.out.println(ref10);
		
		System.out.println("************************************************");
		Milk ref11=ref.getBean(Milk.class);
		System.out.println(ref11);
		
		System.out.println("************************************************");
		Mask ref12=ref.getBean(Mask.class);
		System.out.println(ref12);
	}
}
