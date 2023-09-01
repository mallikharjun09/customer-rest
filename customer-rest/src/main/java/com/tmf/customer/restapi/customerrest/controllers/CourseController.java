package com.tmf.customer.restapi.customerrest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmf.customer.restapi.customerrest.entities.Course;
import com.tmf.customer.restapi.customerrest.services.CourseServices;

import ch.qos.logback.core.model.Model;

@RequestMapping("/courses")
@RestController
public class CourseController {
	@Autowired
	private CourseServices service;
	
	@GetMapping({"/","/AllCourses"})
	public List<Course> getCourses() {
		return service.allCourses();
	}
	
	@PostMapping("/addCourse")
	public Course addCourse(@RequestBody Course course) {
		return service.addCourse(course);
	}
	
	@GetMapping("/displayCourse/{id}")
	public Course displayCourse(@PathVariable("id")long id) {
		return service.displayCourse(id);
	}
	
	@PutMapping("/updateCourse/{id}")
	public Course updateCourse(@PathVariable("id")long id,@RequestBody Course course) {
		Course c = service.displayCourse(id);
		c.setCourseDuration(course.getCourseDuration());
		c.setCourseFee(course.getCourseFee());
		c.setCourseName(course.getCourseName());
		return service.updateCourse(c);
	}
}
