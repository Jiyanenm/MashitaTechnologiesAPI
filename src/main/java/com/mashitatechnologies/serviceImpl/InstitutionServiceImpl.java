package com.mashitatechnologies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mashitatechnologies.model.Institution;
import com.mashitatechnologies.repository.InstitutionRepository;
import com.mashitatechnologies.service.InstitutionService;

@Service
public class InstitutionServiceImpl implements InstitutionService{

	@Autowired
	private InstitutionRepository instiRepository;
	
	@Override
	public List<Institution> getAllInstitutions() {

		List<Institution> listInstitution = instiRepository.findAll();
		
		return listInstitution;
		
	}

	@Override
	public Institution addInstitution(Institution institution) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInstitution(Long id) {

		instiRepository.deleteByinstitutionId(id);
		
	}

	@Override
	public Institution getInstitution(Long id) {

		
		Institution institution = instiRepository.findByinstitutionId(id);
		
		return institution;
	}

	@Override
	public Institution searchInstitution(Long id) {

		Institution institution = instiRepository.findByaccreditationNumber(id);
		
		return institution;
		
	}

	
	
}
