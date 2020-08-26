package com.example.batchprocessing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Person {

	private String lastName;
	private String firstName;

	private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);


	public Person() {
	}

	public Person(String firstName, String lastName) {
		log.info("teshi 名前インスタンス化");
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		log.info("teshi 名前をセット");
		this.firstName = firstName;
	}

	public String getFirstName() {
		log.info("teshi 名前データ取得");
		return firstName;
	}

	public String getLastName() {
		log.info("teshi 苗字データ取得");
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		log.info("teshi 苗字をセット");
	}

	@Override
	public String toString() {
		log.info("teshi 名前と苗字を表示");
		return "firstName: " + firstName + ", lastName: " + lastName;
	}

}
