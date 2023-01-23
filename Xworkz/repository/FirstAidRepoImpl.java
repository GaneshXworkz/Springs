package com.Xworkz.repository;

import org.springframework.stereotype.Component;

import com.Xworkz.Eception.ArraySizeException;
import com.Xworkz.dto.FirstAidDTO;

@Component
public class FirstAidRepoImpl implements FirstAidRepo {

	int i=0;
	FirstAidDTO[] dto=new FirstAidDTO[1];
	
	
	@Override
	public boolean save(FirstAidDTO Aiddto) throws ArraySizeException {
	System.out.println("Creating Save In First Aid Repo");	
	if(this.dto.length>1)
	{
		dto[i++]=Aiddto;
		System.out.println("data is saved to array");
		for (int i = 0; i < dto.length; i++) {
			System.out.println(dto[i]);
		}
	}
	else
	{
		ArraySizeException excep=new ArraySizeException();
		throw excep;
	}
	System.out.println(Aiddto);
		return true;
	}

	
	
}
