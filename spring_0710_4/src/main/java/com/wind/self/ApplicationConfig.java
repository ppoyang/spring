package com.wind.self;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Pencil pencil4B() {
		Pencil pencil = new Pencil("4B");
		return pencil;
	}
	
	@Bean
	public Pencil pencil6B() {
		Pencil pencil = new Pencil("6B");
		return pencil;
	}

}
