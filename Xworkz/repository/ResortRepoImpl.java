package com.Xworkz.repository;

import java.util.Iterator;

import javax.naming.NameNotFoundException;

import org.springframework.stereotype.Component;

import com.Xworkz.Eception.NameNotFountExcpection;
import com.Xworkz.dto.ResortDTO;

@Component
public class ResortRepoImpl implements ResortRepo{

	ResortDTO[] dtos= new ResortDTO[5];

	int index=0;
	
	@Override
	public boolean save(ResortDTO resDto) {
		System.out.println("Creating Save ResortRepoImpl...");
		this.dtos[index]=resDto;
		System.out.println(resDto);
		return true;
	}
@Override
	public ResortDTO getNameById(int id)throws NameNotFountExcpection{
		
		for (int i = 0; i < dtos.length; i++) {
			if (this.dtos[i].getId()==id) {
				System.out.println("id found"+id +"Name: "+this.dtos[i].getResortName());
				return this.dtos[i];
			}else {
				throw new NameNotFountExcpection();
			}
		}
		return null;
		
	}
	
	
}
