package com.mashitatechnologies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mashitatechnologies.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

	List<Course> findAll(); // get all courses
	Course save(Course course); // save and update course
	void deleteBycourseId(Long id); //delete a course
	Course findBycourseId(Long id); // find couese by id
	
}
