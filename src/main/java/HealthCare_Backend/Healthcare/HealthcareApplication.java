package HealthCare_Backend.Healthcare;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.beans.JavaBean;

@SpringBootApplication
public class HealthcareApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthcareApplication.class, args);
	}
	// springboot will create a object for model mapper and manage the lifecycvle of this object
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
}
