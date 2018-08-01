package com.mashitatechnologies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mashitatechnologies.model.Institution;

public interface InstitutionRepository extends JpaRepository<Institution, Long>{

	
	List<Institution> findAll(); // get all institution
	Institution save(Institution institution); // save and update institution
	void deleteByinstitutionId(Long id); //delete a institution bt id
	Institution findByinstitutionId(Long id); // find institution by id
	Institution findByaccreditationNumber(Long id); // find institution by id
}
