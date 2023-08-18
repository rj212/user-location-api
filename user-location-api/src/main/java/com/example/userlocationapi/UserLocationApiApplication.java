package com.example.userlocationapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;

@SpringBootApplication
public class UserLocationApiApplication {

	public static Object UserLocation;

	public static void main(String[] args) {
		SpringApplication.run(UserLocationApiApplication.class, args);
	}
	@Entity
	public class UserLocation {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String name;
		private double latitude;
		private double longitude;
		private boolean excluded;

		// Constructors, getters, setters


	}

}
