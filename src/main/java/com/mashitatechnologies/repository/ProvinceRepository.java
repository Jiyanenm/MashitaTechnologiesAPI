package com.mashitatechnologies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mashitatechnologies.model.Provinces;

public interface ProvinceRepository extends JpaRepository<Provinces, Long>{

	List<Provinces> findAll(); // get all Provinces
	Provinces save(Provinces provinces); // save and update Provinces
	void deleteByprovinceId(Long id); //delete a provinceId by id
	Provinces findByprovinceId(Long id); // find provinceId by id

	
}
