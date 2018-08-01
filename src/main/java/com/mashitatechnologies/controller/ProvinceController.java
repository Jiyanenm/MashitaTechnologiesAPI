package com.mashitatechnologies.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mashitatechnologies.constants.ProvincesURIConstants;
import com.mashitatechnologies.model.Provinces;
import com.mashitatechnologies.service.ProvinceService;

@RestController
@RequestMapping(value="/MashitaTechnologies")
public class ProvinceController {

	@Autowired
	private ProvinceService provinceService;
	
	@RequestMapping(value = ProvincesURIConstants.GET_ALL_PROVINCES, method = RequestMethod.GET)
	public @ResponseBody List<Provinces> getAllProvinces() {
		List<Provinces> allProvinces = new ArrayList<Provinces>();
		try {
			return provinceService.getAllProvinces();
		} catch (Exception err) {
			err.printStackTrace();
		}
		return allProvinces;
	}
	
	@RequestMapping(value = ProvincesURIConstants.CREATE_PROVINCE, method = RequestMethod.POST)
	public @ResponseBody Provinces createProvince(@RequestBody Provinces province) {
		try {
			return provinceService.addProvince(province);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value = ProvincesURIConstants.UPDATE_PROVINCE, method = RequestMethod.PUT)
	public @ResponseBody Provinces updateProvince(@RequestBody Provinces province) {
		try {
			return provinceService.addProvince(province);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

	@RequestMapping(value = ProvincesURIConstants.REMOVE_PROVINCE, method = RequestMethod.DELETE)
	public @ResponseBody void removeInvoiceDAO(@PathVariable("id") Long id) {
		try {
			 provinceService.deleteProvinces(id);
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}
	
	
	@RequestMapping(value = ProvincesURIConstants.GET_PROVINCE_BY_PROVINCE_ID, method = RequestMethod.GET)
	public @ResponseBody Provinces getProvinceByProvinceId(@PathVariable("provinceId") Long province_id) {


			 Provinces province = provinceService.getProvinces(province_id);
	
		return province;
	}
	
	


}
