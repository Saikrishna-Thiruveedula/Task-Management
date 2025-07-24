package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringbootTaskManagamentSystemApplication {

	public static void main(String[] args) {
		// Generate BCrypt hash for the password "manager123"
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encoded = encoder.encode("manager123");
		System.out.println("BCrypt Hash for 'manager123' is: " + encoded);

		// Start the Spring Boot application
		SpringApplication.run(SpringbootTaskManagamentSystemApplication.class, args);
	}
}
