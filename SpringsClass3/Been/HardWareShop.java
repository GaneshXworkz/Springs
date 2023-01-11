package com.xworkz.Maven.SpringsClass3.Been;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardWareShop {
	
	@Autowired
	@Qualifier("shopId")
	private int id;
	
	@Autowired
	@Qualifier("shopName")
	private String name;
	
	@Autowired
	@Qualifier("shopGst")
	private int gstNo;
	
	@Autowired
	@Qualifier("shopOwner")
	private String OwnerName;
	
	@Autowired
	@Qualifier("shopAddress")
	private String address;
	
	
	public HardWareShop(int id, String name, int gstNo, String ownerName, String address) {
		super();
		this.id = id;
		this.name = name;
		this.gstNo = gstNo;
		OwnerName = ownerName;
		this.address = address;
	}


	public HardWareShop() {
		System.out.println("======Craeting hardWare By defalt Constructor=========");
	}


	

	@Override
	public String toString() {
		return "HardWareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", OwnerName=" + OwnerName
				+ ", address=" + address + "]";
	}
	
	
	

}
