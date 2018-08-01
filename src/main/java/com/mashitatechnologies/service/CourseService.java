package com.mashitatechnologies.service;

import java.util.List;

import com.mashitatechnologies.model.Course;

public interface CourseService {

	List<Course> getAllCourses();
	Course addCourse(Course course); 
	void deleteCourse(Long id); 
	Course getCourse(Long id); 
	
}
