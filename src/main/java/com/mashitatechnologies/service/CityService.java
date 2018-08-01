package com.mashitatechnologies.service;

import java.util.List;

import com.mashitatechnologies.model.City;

public interface CityService {

	List<City> getAllCities();
	City addCity(City city);
	void deleteCity(Long id);
	City getCity(Long id); 
	
}
