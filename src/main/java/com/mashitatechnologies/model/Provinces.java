package com.mashitatechnologies.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.mashitatechnologies.model.Institution;
import com.mashitatechnologies.model.Investigator;
import com.mashitatechnologies.model.ReportInstitution;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@Entity
@Table(name="provinces")
public class Provinces implements Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "province_id", unique = true, nullable = false)
	private Long provinceId;
	
	@Column(name = "province_name", nullable = false)
	private String provinceName;
	
	

	
	 @OneToMany(mappedBy="provinces")
	protected Set<Institution> institutions = new HashSet<Institution>();
	
	 @OneToMany(mappedBy="provinces")
	private Set<Investigator> investigators = new HashSet<Investigator>();
	
	 @OneToMany(mappedBy="provinces")
	private Set<ReportInstitution> reportinstitution = new HashSet<ReportInstitution>();
	
	 @OneToMany(mappedBy="provinces")
	public Set<City> city;
	

	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	
	
	public Set<Institution> getInstitutions() {
		return institutions;
	}

	public void setInstitutions(Set<Institution> institutions) {
		this.institutions = institutions;
	}
	
	public Set<Investigator> getInvestigators() {
		return investigators;
	}

	public void setInvestigators(Set<Investigator> investigators) {
		this.investigators = investigators;
	}
	
	public Set<ReportInstitution> getReportInstitution() {
		return reportinstitution;
	}

	public void setReportInstitution(Set<ReportInstitution> reportinstitution) {
		this.reportinstitution = reportinstitution;
	}
	
	public Set<City> getCity() {
		return city;
	}

	public void setCity(Set<City> city) {
		this.city = city;
	}
	
	
	
	@Override
	public String toString() {
		return "Provinces [provinceId=" + provinceId + ", provinceName=" + provinceName + ", institutions=" + institutions 
				+ ", investigators=" + investigators + ", reportinstitution=" + reportinstitution 
				+ ", city=" + city + "]";
		
	}
}
