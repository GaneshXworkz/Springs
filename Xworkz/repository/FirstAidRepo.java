package com.Xworkz.repository;

import com.Xworkz.Eception.ArraySizeException;
import com.Xworkz.dto.FirstAidDTO;
import com.Xworkz.dto.SoldierDTO;

public interface FirstAidRepo {

	boolean save(FirstAidDTO dto) throws ArraySizeException;
	 
	 
}
