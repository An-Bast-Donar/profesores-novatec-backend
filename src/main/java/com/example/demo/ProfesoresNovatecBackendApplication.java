package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ProfesoresNovatecBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfesoresNovatecBackendApplication.class, args);
		System.out.println("ESTO ES UNA PRUEBA TECNICA PARA NOVATEC COLOMBIA");
	}

}
