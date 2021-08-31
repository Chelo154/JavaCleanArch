package com.example.configuration;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(value = {"com.example.clientcontext.infra.springboot.endpoints",
		"com.example.productcontext.infra.springboot.endpoints"})
public class SpringStarter implements Starter {

	@Override
	public void start(String[] args) {
		SpringApplication.run(this.getClass(), args);
		
	}
	
	

}
