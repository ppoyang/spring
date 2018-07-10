package com.wind.sp06;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String configLocation1 = "classpath:ApplicationCTX1.xml";
		String configLocation2 = "classpath:ApplicationCTX2.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation1,configLocation2);
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println("student1의 name : " + student1.getName());
		
		StudentInfo studentInfo = ctx.getBean("studentInfo1",StudentInfo.class);
		Student student3 = studentInfo.getStudent();
		System.out.println("student3의 name : " + student3.getName());
		
		if(student1.equals(student3)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		Student student2 = ctx.getBean("student2", Student.class);
		System.out.println("student2의 name : " + student2	.getName());
	}

}
