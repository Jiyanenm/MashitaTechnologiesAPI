package com.mashitatechnologies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mashitatechnologies.model.Course;
import com.mashitatechnologies.repository.CourseRepository;
import com.mashitatechnologies.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public List<Course> getAllCourses() {

		List<Course> courseList = courseRepository.findAll();
		
		return courseList;
		
	}

	@Override
	public Course addCourse(Course course) {

		course = courseRepository.save(course);
		
		return course;
		
	}

	@Override
	public void deleteCourse(Long id) {
		
		
		courseRepository.deleteBycourseId(id);
		
	}

	@Override
	public Course getCourse(Long id) {

		Course course = courseRepository.findBycourseId(id);
		
		return course;
		
	}

}
