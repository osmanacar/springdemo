package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {
			Student osman = new Student("Osman Acar", "osmanacar1903@gmail.com", LocalDate.of(1996, Month.AUGUST, 24));
			Student anil = new Student("Anil Acar", "anilacar1919@gmail.com", LocalDate.of(2001, Month.JULY, 24));

			studentRepository.saveAll(List.of(osman, anil));
		};
	}
}
