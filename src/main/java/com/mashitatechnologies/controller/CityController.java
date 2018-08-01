package com.mashitatechnologies.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mashitatechnologies.constants.CityURIConstants;
import com.mashitatechnologies.model.City;
import com.mashitatechnologies.model.Provinces;
import com.mashitatechnologies.service.CityService;

@RestController
@RequestMapping(value="/MashitaTechnologies")
public class CityController {
	

	@Autowired
	private CityService cityService;
	
	@RequestMapping(value = CityURIConstants.GET_ALL_CITIES, method = RequestMethod.GET)
	public @ResponseBody List<City> getAllCities() {
		List<City> allCities = new ArrayList<City>();
		try {
			return cityService.getAllCities();
			
		} catch (Exception err) {
			err.printStackTrace();
		}
		return allCities;
	}
	
	@RequestMapping(value = CityURIConstants.CREATE_CITY, method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	//public @ResponseBody String createCity(@PathVariable("provinceId") Long provinceId, @RequestBody City city) {
	public  City createCity(@RequestBody City city) {
		try {
			//return cityDAO.createCity(city,provinceId);
			return cityService.addCity(city);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value = CityURIConstants.UPDATE_CITY, method = RequestMethod.PUT)
	public @ResponseBody City updateCity(@RequestBody City city) {
		try {
			return cityService.addCity(city);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

	@RequestMapping(value = CityURIConstants.REMOVE_CITY, method = RequestMethod.DELETE)
	public @ResponseBody void removeCity(@RequestBody Long id) {
		try {
			 cityService.deleteCity(id);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	/*
	@RequestMapping(value = CityURIConstants.GET_CITIES_BY_PROVINCE_ID, method = RequestMethod.GET)
	public @ResponseBody List<Object[]> getAllCitiesByProvincyId(@PathVariable("provinceId") Long province_id) {
		List<Object[]> allcities = new ArrayList<Object[]>();
		try {
			
			allcities = cityService.get
			//allcities = cityDAO.getAllCitiesByProvincyId(province_id);
			//return cityDAO.getAllCitiesByProvincyId(province_id);
			return cityService.
			
		} catch (Exception err) {
			err.printStackTrace();
		}
		return allcities;
	}
	*/

}
