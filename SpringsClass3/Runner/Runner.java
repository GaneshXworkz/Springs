package com.xworkz.Maven.SpringsClass3.Runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Maven.SpringsClass3.Been.Civil;
import com.xworkz.Maven.SpringsClass3.Been.HardWareShop;
import com.xworkz.Maven.SpringsClass3.Been.Pencil;
import com.xworkz.Maven.SpringsClass3.Been.Rubber;
import com.xworkz.Maven.SpringsClass3.Been.SoftWare;
import com.xworkz.Maven.SpringsClass3.Been.SoftWareEngineer;
import com.xworkz.Maven.SpringsClass3.Configration.Configration;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext ref1=new AnnotationConfigApplicationContext(Configration.class);
		
		
		HardWareShop hard = ref1.getBean(HardWareShop.class);
		System.out.println(hard);
		
		Pencil pencil=ref1.getBean(Pencil.class);
		System.out.println(pencil);
		
		Civil civil=ref1.getBean(Civil.class);
		System.out.println(civil);
		
		Rubber rub=ref1.getBean(Rubber.class);
		System.out.println(rub);
		
		SoftWare soft=ref1.getBean(SoftWare.class);
		System.out.println(soft);
		
		SoftWareEngineer engineering=ref1.getBean(SoftWareEngineer.class);
		System.out.println(engineering);
	}
}
