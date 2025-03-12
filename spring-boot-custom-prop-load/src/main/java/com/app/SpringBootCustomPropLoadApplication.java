package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootCustomPropLoadApplication {

	@Autowired
	private TestConfig testConfig;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCustomPropLoadApplication.class, args);
	}

	@GetMapping
	public void test() {
		String name = testConfig.getName();
		String firstName = testConfig.getFirstName();
		String lastName = testConfig.getLastName();

		System.out.println("Name: " + name + " FirstName: " + firstName + " LastName: " + lastName);
	}

}
