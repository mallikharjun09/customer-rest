package com.tmf.customer.restapi.customerrest.entities;

import java.sql.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {
	private int customerId;
	private String customerName;
	private String customerAddress;
	private String customerEmail, customerGender;
	private long customerPhoneNumber;
	private Date customerDOB;
}
