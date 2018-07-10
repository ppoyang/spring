package com.wind.sp08;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	//xml과 달리 메소드 bean을 만든다..
	@Bean
	public Student student1() {
			
			ArrayList<String> hobbys = new ArrayList<String>();
			hobbys.add("수영");
			hobbys.add("요리");
			
			Student student = new Student("오드리햅번",25,hobbys);

			student.setHeight(180);
			student.setWeight(80);
			
			return student;
		
	}
	
	@Bean
	public Student student2() {
			
			ArrayList<String> hobbys = new ArrayList<String>();
			hobbys.add("독서");
			hobbys.add("산책");
			
			Student student = new Student("김몽이",9,hobbys);

			student.setHeight(30);
			student.setWeight(2.5);
			
			return student;
		
	}
	
}
