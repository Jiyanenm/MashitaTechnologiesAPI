package com.mashitatechnologies.service;

import java.util.List;

import com.mashitatechnologies.model.Institution;

public interface InstitutionService {

	List<Institution> getAllInstitutions(); 
	Institution addInstitution(Institution institution); 
	void deleteInstitution(Long id); 
	Institution getInstitution(Long id);
	Institution searchInstitution(Long id); // search institution by id
	
}
