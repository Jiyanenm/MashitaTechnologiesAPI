package com.mashitatechnologies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mashitatechnologies.model.City;

public interface CityRepository extends JpaRepository<City, Long>{

	List<City> findAll(); // get all cities
	City save(City city); // save and update
	void deleteBycityId(Long id); //delete a city
	City findBycityId(Long id); // find city by id
	
	
}
