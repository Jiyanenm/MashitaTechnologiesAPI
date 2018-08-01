package com.mashitatechnologies.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="course_type")
public class CourseType implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "course_type_id", unique = true, nullable = false)
	private Long courseTypeId;
	
	@Column(name = "course_type", nullable = false)
	private String courseType;
	
	public Long getCourseTypeId() {
		return courseTypeId;
	}

	public void setCourseTypeId(Long courseTypeId) {
		this.courseTypeId = courseTypeId;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	
	@Override
	public String toString() {
		return "CourseType [courseTypeId=" + courseTypeId + ", courseType=" + courseType + "]";
	} 

}
