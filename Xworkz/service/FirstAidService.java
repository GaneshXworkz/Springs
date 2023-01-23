package com.Xworkz.service;

import com.Xworkz.Eception.ArraySizeException;
import com.Xworkz.dto.FirstAidDTO;

public interface FirstAidService {

	boolean validateAndSave(FirstAidDTO dto) throws ArraySizeException;
}
