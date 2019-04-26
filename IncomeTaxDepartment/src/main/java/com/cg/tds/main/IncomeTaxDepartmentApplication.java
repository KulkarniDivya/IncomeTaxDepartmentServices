package com.cg.tds.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.cg.tds.controller")
@ComponentScan("com.cg.tds.dao")
@ComponentScan("com.cg.tds.service")
@ComponentScan("com.cg.tds.exception")
@EntityScan(basePackages= {"com.cg.tds.model"})
@SpringBootApplication
public class IncomeTaxDepartmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(IncomeTaxDepartmentApplication.class, args);
	}

}
