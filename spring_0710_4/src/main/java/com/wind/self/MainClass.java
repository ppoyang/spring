package com.wind.self;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Pencil pencil1  = ctx.getBean("pencil4B",Pencil.class);
		pencil1.use();
		Pencil pencil2  = ctx.getBean("pencil6B",Pencil.class);
		pencil2.use();

	}

}
