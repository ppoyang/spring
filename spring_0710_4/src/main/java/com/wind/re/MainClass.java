package com.wind.re;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx 
			= new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Student student = ctx.getBean("student1",Student.class);
		
		System.out.println("이름:" + student.getName());
		System.out.println("나이:" + student.getAge());

		
		Student student2 = ctx.getBean("student2",Student.class);
		System.out.println("이름:" + student2.getName());
		System.out.println("나이:" + student2.getAge());

	}

}
