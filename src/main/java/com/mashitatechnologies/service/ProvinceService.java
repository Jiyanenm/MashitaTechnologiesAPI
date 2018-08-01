package com.mashitatechnologies.service;

import java.util.List;

import com.mashitatechnologies.model.Provinces;

public interface ProvinceService {

	List<Provinces> getAllProvinces(); // get all Provinces
	Provinces addProvince(Provinces province); // save and update Provinces
	void deleteProvinces(Long id); //delete a provinceId by id
	Provinces getProvinces(Long id); // find provinceId by id
	
}
