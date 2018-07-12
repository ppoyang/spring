package com.wind.s08;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		AdminConnection connection = ctx.getBean("adminConfig", AdminConnection.class);
		
		System.out.println(connection.getAdminId());
		System.out.println(connection.getAdminPw());
		System.out.println(connection.getSub_adminId());
		System.out.println(connection.getSub_adminPw());
		

	}

}
