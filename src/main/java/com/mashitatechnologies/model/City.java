package com.mashitatechnologies.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.mashitatechnologies.model.Provinces;
import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
@Table(name="city")

public class City implements Serializable{
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "city_id", unique = true, nullable = false)
	private Long cityId;
	
	@Column(name = "city_name", nullable = false)
	private String cityName;
	
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "province_id", nullable = false)
	private Provinces provinces;
	
	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
	public Provinces getProvinces() {
		return provinces;
	}

	public void setProvinces(Provinces provinces) {
		this.provinces = provinces;
	}
	
	@Override
	public String toString() {
		return "Cities [cityId=" + cityId + ", cityName=" + cityName + ", provinces=" + provinces + "]";
	}

}
