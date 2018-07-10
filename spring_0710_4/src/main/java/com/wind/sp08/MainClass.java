package com.wind.sp08;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx 
			= new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Student student = ctx.getBean("student1",Student.class);
		
		System.out.println("이름:" + student.getName());
		System.out.println("나이:" + student.getAge());
		System.out.println("취미:" + student.getHobbys());
		
		Student student2 = ctx.getBean("student2",Student.class);
		System.out.println("이름:" + student2.getName());
		System.out.println("나이:" + student2.getAge());
		System.out.println("취미:" + student2.getHobbys());
		System.out.println("몸무게:" + student2.getWeight());
	}

}
