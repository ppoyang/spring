package com.wind.component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		
		Student student = ctx.getBean("student1",Student.class);
		
		System.out.println("이름:" + student.getName());
		System.out.println("나이:" + student.getAge());

		
		Student student2 = ctx.getBean("student2",Student.class);
		System.out.println("이름:" + student2.getName());
		System.out.println("나이:" + student2.getAge());
		
		Conan student3= ctx.getBean("conan", Conan.class);
		student3.setName("코난");
		System.out.println("이름:" + student3.getName());

	}

}
