package com.mashitatechnologies.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mashitatechnologies.constants.InstitutionURIConstants;
import com.mashitatechnologies.model.Institution;
import com.mashitatechnologies.service.CityService;
import com.mashitatechnologies.service.InstitutionService;

@RestController
@RequestMapping(value="/MashitaTechnologies")
public class InstitutionController {

	@Autowired
	private InstitutionService institutionService;
	
	@RequestMapping(value = InstitutionURIConstants.GET_ALL_INSTITUTIONS, method = RequestMethod.GET)
	public @ResponseBody List<Institution> getAllInstitution() {
		List<Institution> allInstitutions = new ArrayList<Institution>();
		try {
			allInstitutions = institutionService.getAllInstitutions();
			return allInstitutions;
			
		} catch (Exception err) {
			err.printStackTrace();
		}
		return allInstitutions;
	}
	
	@RequestMapping(value = InstitutionURIConstants.CREATE_INSTITUTION, method = RequestMethod.POST)
	public @ResponseBody Institution createInstitution(@RequestBody Institution institution) {
		try {
			return institutionService.addInstitution(institution);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value = InstitutionURIConstants.REMOVE_INSTITUTION, method = RequestMethod.DELETE)
	public @ResponseBody void removeInstitution(@RequestBody Long id) {
		try {
			 institutionService.deleteInstitution(id);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	@RequestMapping(value = InstitutionURIConstants.UPDATE_INSTITUTION, method = RequestMethod.PUT)
	public @ResponseBody Institution updateInstitution(@RequestBody Institution institution) {
		try {
			return institutionService.addInstitution(institution);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

