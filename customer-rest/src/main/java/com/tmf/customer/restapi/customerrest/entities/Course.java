package com.tmf.customer.restapi.customerrest.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
	@Id
	@SequenceGenerator(name="cid_seq",initialValue = 10001,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long courseId;
	private String courseName;
	private int courseDuration;
	private double courseFee;
}
