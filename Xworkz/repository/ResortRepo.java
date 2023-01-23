package com.Xworkz.repository;


import com.Xworkz.Eception.NameNotFountExcpection;
import com.Xworkz.dto.ResortDTO;

public interface ResortRepo {

	boolean save(ResortDTO resDto);

	ResortDTO getNameById(int id) throws NameNotFountExcpection;
}
