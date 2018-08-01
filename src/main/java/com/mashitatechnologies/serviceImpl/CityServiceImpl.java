package com.mashitatechnologies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mashitatechnologies.model.City;
import com.mashitatechnologies.repository.CityRepository;
import com.mashitatechnologies.service.CityService;

@Service
public class CityServiceImpl implements CityService{
	
	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<City> getAllCities() {
	
		 List<City> cityList = cityRepository.findAll();
		
		 return cityList;
	}

	@Override
	public City addCity(City city) {

		return cityRepository.save(city);
		
		
	}

	@Override
	public void deleteCity(Long id) {
		
		cityRepository.deleteBycityId(id);
		
	}

	@Override
	public City getCity(Long id) {

		
		City city = cityRepository.findBycityId(id);
		
		return city;
	}

}
