package com.xworkz.Maven.SpringsClass4.BeenClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {

	@Autowired
	@Qualifier("newsPaperId")
	private String id;

	private String name;

	private String ownerName;

	@Autowired
	@Qualifier("newsPaperLanguage")
	private String langauge;

	private int prize;

	@Autowired
	public NewsPaper(@Qualifier("newsPaperName") String name, @Qualifier("newsPaperOwner") String ownerName) {
		super();

		this.name = name;
		this.ownerName = ownerName;

		
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getLangauge() {
		return langauge;
	}

	public int getPrize() {
		return prize;
	}

	@Autowired
	@Qualifier("newsPaperPrize")
	public void setPrize(int prize) {
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", langauge=" + langauge
				+ ", prize=" + prize + "]";
	}

}
