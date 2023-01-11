package com.xworkz.Maven.SpringsClass3.Configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.Maven.SpringsClass3.Been.Civil;
import com.xworkz.Maven.SpringsClass3.Been.HardWareShop;
import com.xworkz.Maven.SpringsClass3.Been.Pencil;
import com.xworkz.Maven.SpringsClass3.Been.Rubber;
import com.xworkz.Maven.SpringsClass3.Been.SoftWare;
import com.xworkz.Maven.SpringsClass3.Been.SoftWareEngineer;


@Configuration
@ComponentScan("com.xworkz.Maven.SpringsClass3")
public class Configration {

	
	
	@Bean
	public String shopName() {
		System.out.println("Registring hardWare Name...........");
		HardWareShop ref1=new HardWareShop();
		return "Ramesh  hardware";
	}
	
	@Bean
	public int shopId() {
		System.out.println("Registring hardWare ID...........");

		HardWareShop ref2=new HardWareShop();
		return 12345;
	}

	@Bean
	public int shopGst() {
		System.out.println("Registring hardWare Gst...........");

		HardWareShop ref3=new HardWareShop();
		return 456789123;
	}

	@Bean
	public String shopOwner() {
		System.out.println("Registring hardWare ShopOwner...........");

		HardWareShop ref4=new HardWareShop();
		return "Ravi";
	}

	@Bean
	public String shopAddress() {
		System.out.println("Registring hardWare Address...........");

		HardWareShop ref5=new HardWareShop();
		return "Rajajinagra";
	}

	
	//***************************************************************
	
	@Bean
	public String PencilName() {
		System.out.println("Registring  PencilName...........");
		Pencil ref5=new Pencil();
		return "Nataraja";
	}
	
	@Bean
	public String PencilType() {
		System.out.println("Registring  PencilType...........");
		Pencil ref5=new Pencil();
		return "With Rubber";
	}
	
	@Bean
	public int PencilPrize() {
		System.out.println("Registring  PencilPrize...........");
		Pencil ref5=new Pencil();
		return 50;
	}
	
	@Bean
	public String Pencilcolour() {
		System.out.println("Registring  PencilColour...........");

		Pencil ref5=new Pencil();
		return "RED";
		
	}

	@Bean
	public String PencilShape() {
		System.out.println("Registring  PencilShape...........");

		Pencil ref5=new Pencil();
		return "Round";
		
	}
	
	@Bean
	public boolean PencilStolen() {
		System.out.println("Registring  PencilStolen...........");

		Pencil ref5=new Pencil();
		return false;
		
	}
	
	//*************************************************************************

	@Bean
	public String RubberlName() {
		System.out.println("Registring  PencilName...........");
		Rubber ref5=new Rubber();
		return "Apsara";
	}
	
	@Bean
	public String RubberType() {
		System.out.println("Registring  RubberType...........");
		Rubber ref5=new Rubber();
		return "pen and Pencil Rubber";
	}
	
	@Bean
	public int RubberPrize() {
		System.out.println("Registring  RubberPrize...........");
		Rubber ref5=new Rubber();
		return 50;
	}
	
	@Bean
	public String RubberShape() {
		System.out.println("Registring  RubberShape...........");

		Rubber ref5=new Rubber();
		return "RED";
		
	}

	@Bean
	public String RubberSize() {
		System.out.println("Registring  RubberSize...........");

		Rubber ref5=new Rubber();
		return "Round";
		
	}
	
	@Bean
	public boolean RubberStolen() {
		System.out.println("Registring  RubberStolen...........");

		Rubber ref5=new Rubber();
		return false;
		
	}
	
	//********************************************************************
	@Bean
	public String SoftWareName() {
		System.out.println("Registring  SoftWareName...........");
		SoftWare ref5=new SoftWare();
		return "Apsara";
	}
	
	@Bean
	public String SoftWareVersion() {
		System.out.println("Registring  SoftWareVersion...........");
		SoftWare ref5=new SoftWare();
		return "java";
	}
	
	@Bean
	public String SoftWareDeveloper() {
		System.out.println("Registring  SoftWareDeveloper...........");
		SoftWare ref5=new SoftWare();
		return "Wipro";
	}
	
	@Bean
	public String SoftWareData() {
		System.out.println("Registring  SoftWareData...........");

		SoftWare ref5=new SoftWare();
		return "100Tb";
		
	}

	@Bean
	public boolean SoftWarefree() {
		System.out.println("Registring  SoftWarefree...........");

		SoftWare ref5=new SoftWare();
		return true;
		
	}
	
	
//*************************************************************************************
	@Bean
	public String SoftWareEngineerName() {
		System.out.println("Registring  SoftWareEngineerName...........");
		SoftWareEngineer ref5=new SoftWareEngineer();
		return "Apsara";
	}
	
	@Bean
	public double SoftWareEngineerSalaray() {
		System.out.println("Registring  SoftWareEngineerSalaray...........");
		SoftWareEngineer ref5=new SoftWareEngineer();
		return 50000;
	}
	
	@Bean
	public String SoftWareEngineerDeveloper() {
		System.out.println("Registring  SoftWareEngineerDeveloper...........");
		SoftWareEngineer ref5=new SoftWareEngineer();
		return "Wipro";
	}
	
	@Bean
	public String SoftWareEngineerData() {
		System.out.println("Registring  SoftWareEngineerData...........");

		SoftWareEngineer ref5=new SoftWareEngineer();
		return "15/01/1998";
		
	}

	@Bean
	public boolean SoftWareEngineerFree() {
		System.out.println("Registring  SoftWareEngineerFree...........");

		SoftWare ref5=new SoftWare();
		return false;
		
	}
	
//******************************************************************************************************	
	@Bean
	public String CivilName() {
		System.out.println("Registring  CivilName...........");
		Civil ref5=new Civil();
		return "RNR Construction";
	}
	
	@Bean
	public String CivilGstNo() {
		System.out.println("Registring  CivilGstNo...........");
		Civil ref5=new Civil();
		return "GST123468";
	}
	
	@Bean
	public double CivilCost() {
		System.out.println("Registring  CivilCost...........");
		Civil ref5=new Civil();
		return 2500897;
	}
	
	@Bean
	public String CivilSand() {
		System.out.println("Registring  CivilSand...........");

		Civil ref5=new Civil();
		return "100Cum";
		
	}

	@Bean
	public String  CivilCement () {
		System.out.println("Registring  CivilCement...........");

		Civil ref5=new Civil();
		return "200bags";
		
	}
	
	@Bean
	public int CivilLabours() {
		System.out.println("Registring  CivilLabours...........");
		Civil ref5=new Civil();
		return 25;
	}
	
	@Bean
	public String CivilSteel() {
		System.out.println("Registring  CivilSteel...........");
		Civil ref5=new Civil();
		return "150T";
	}
	
	@Bean
	public String CivilGrade() {
		System.out.println("Registring  CivilGrade...........");
		Civil ref5=new Civil();
		return "M40";
	}
	
	@Bean
	public int CivilDuration() {
		System.out.println("Registring  CivilDuration...........");

		Civil ref5=new Civil();
		return 150;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
