package com.wind.s08;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		AdminConnection connection = ctx.getBean("adminConnection",AdminConnection.class);
		
		System.out.println("admin id : "+connection.getAdminId());
		System.out.println("admin pw : "+connection.getAdminId());
		System.out.println("sub_admin id : "+connection.getSub_adminId());
		System.out.println("sub_admin pw : "+connection.getSub_adminPw());
		
		ctx.close();

	}

}
