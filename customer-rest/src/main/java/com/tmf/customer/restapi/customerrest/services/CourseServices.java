package com.tmf.customer.restapi.customerrest.services;

import java.util.List;

import com.tmf.customer.restapi.customerrest.entities.Course;

public interface CourseServices {
	Course addCourse(Course course);
	Course updateCourse(Course course);
	void deleteCourse(Course course);
	List<Course> allCourses();
	Course displayCourse(long courseId);
}
