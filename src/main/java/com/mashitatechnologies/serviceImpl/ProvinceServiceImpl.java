package com.mashitatechnologies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mashitatechnologies.model.Provinces;
import com.mashitatechnologies.repository.ProvinceRepository;
import com.mashitatechnologies.service.ProvinceService;

@Service
public class ProvinceServiceImpl implements ProvinceService{

	@Autowired
	private ProvinceRepository provinceRepository;
	
	
	@Override
	public List<Provinces> getAllProvinces() {

		List<Provinces> provincesList = provinceRepository.findAll();
		
		return provincesList;
		
	}

	@Override
	public Provinces addProvince(Provinces province) {

		province = provinceRepository.save(province);
		
		return province;
		
	}

	@Override
	public void deleteProvinces(Long id) {
	
		
		provinceRepository.deleteByprovinceId(id);
		
	}

	@Override
	public Provinces getProvinces(Long id) {

		Provinces province = provinceRepository.findByprovinceId(id);
		
		return province;
	}

}
