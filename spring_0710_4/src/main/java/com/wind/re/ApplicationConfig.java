package com.wind.re;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	//xml과 달리 메소드 bean을 만든다..
	@Bean
	public Student student1() {

			Student student = new Student("오드리햅번",25);
			return student;
		
	}
	
	@Bean
	public Student student2() {
		
			Student student = new Student("김몽이",9);
			return student;
		
	}
	
}
