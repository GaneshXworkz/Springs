package com.xworkz.Egg.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eggMenu_table")
public class EggMenuDto {

	@Column(name = "c_id")
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "c_foodtype")
	private String foodtype;
	@Column(name = "c_tyepOfEgg")
	private String tyepOfEgg;
	@Column(name = "c_quatity")
	private int quatity;
	@Column(name = "c_price")
	private double price;

	public EggMenuDto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EggMenuDto [id=" + id + ", foodtype=" + foodtype + ", tyepOfEgg=" + tyepOfEgg + ", quatity=" + quatity
				+ ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFoodtype() {
		return foodtype;
	}

	public void setFoodtype(String foodtype) {
		this.foodtype = foodtype;
	}

	public String getTyepOfEgg() {
		return tyepOfEgg;
	}

	public void setTyepOfEgg(String tyepOfEgg) {
		this.tyepOfEgg = tyepOfEgg;
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
