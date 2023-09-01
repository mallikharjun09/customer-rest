package com.tmf.customer.restapi.customerrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmf.customer.restapi.customerrest.entities.Course;
import com.tmf.customer.restapi.customerrest.repository.CourseRepository;

@Service
public class CourseServicesImpl implements CourseServices{

	@Autowired
	private CourseRepository dao;
	
	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return dao.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		return dao.save(course);
	}

	@Override
	public void deleteCourse(Course course) {
		// TODO Auto-generated method stub
		dao.delete(course);
	}

	@Override
	public List<Course> allCourses() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Course displayCourse(long courseId) {
		// TODO Auto-generated method stub
		return dao.findById(courseId).get();
	}

}
