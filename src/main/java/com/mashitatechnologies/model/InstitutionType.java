package com.mashitatechnologies.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="institution_type")
public class InstitutionType implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "institution_type_id", unique = true, nullable = false)
	private Long institutionTypeId;
	
	@Column(name = "institution_type", nullable = false)
	private String institutionType;
	
	public Long getInstitutionTypeId() {
		return institutionTypeId;
	}

	public void setInstitutionTypeId(Long institutionTypeId) {
		this.institutionTypeId = institutionTypeId;
	}

	public String getInstitutionType() {
		return institutionType;
	}

	public void setInstitutionType(String institutionType) {
		this.institutionType = institutionType;
	}
	
	@Override
	public String toString() {
		return "InstitutionTypeId [institutionTypeId=" + institutionTypeId + ", institutionType=" + institutionType + "]";
	} 


}
