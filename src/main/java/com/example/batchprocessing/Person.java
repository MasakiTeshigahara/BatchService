package com.example.batchprocessing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Person {

	private String lastName;
	private String firstName;

	private static final Logger log = LoggerFactory.getLogger(Person.class);


	public Person() {
	}

	public Person(String firstName, String lastName) {
		log.info("teshi:Name instantiation");
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		log.info("teshi:Set Name");
		this.firstName = firstName;
	}

	public String getFirstName() {
		log.info("teshi:Get first name date");
		return firstName;
	}

	public String getLastName() {
		log.info("teshi:Get last name date");
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		log.info("teshi:Set Last name");
	}

	@Override
	public String toString() {
		log.info("teshi:Show last name and first name");
		return "firstName: " + firstName + ", lastName: " + lastName;
	}

}
