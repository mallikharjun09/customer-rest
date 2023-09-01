package com.tmf.customer.restapi.customerrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmf.customer.restapi.customerrest.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
