package com.xworkz.Maven.SpringsClass4.BeenClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {

	@Autowired
	@Qualifier("newsPaperId")
	private String id;
	
	@Autowired
	@Qualifier("newsPaperName")
	private String name;
	
	@Autowired
	@Qualifier("newsPaperOwner")
	private String ownerName;
	
	@Autowired
	@Qualifier("newsPaperLanguage")
	private String langauge;
	
	@Autowired
	@Qualifier("newsPaperPrize")
	private int prize;
	
	
	
	

	public NewsPaper(String id,@Qualifier("newsPaperName") String name, @Qualifier("newsPaperOwner")
String ownerName, String langauge, int prize) {
		super();
		this.id = id;
		this.name = name;
		this.ownerName = ownerName;
		this.langauge = langauge;
		this.prize = prize;
	}


	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", langauge=" + langauge
				+ ", prize=" + prize + "]";
	}


	
	
}
