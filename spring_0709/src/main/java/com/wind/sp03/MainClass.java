package com.wind.sp03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
			//MyCalculator myCalculator = new MyCalculator(); 이방법사용하지 않고 아래 방법
			String configLocation = "classpath:applicationCTX.xml"; //classpath는 src.main.java 와 src.main.resource가 등록되어있어 여기를 먼저 찾는다.
			AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
			//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(configLocation); 이렇게 써도 된다.
			
			MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
			/* 객체 생성이 아니라 applicationCTX.xml에서 스프링에 요청했던 myCalculator bean을  스프링에게 전달받아 변수에 저장*/
			ctx.close();
			
			myCalculator.add();
			myCalculator.sub();
			myCalculator.mul();
			myCalculator.div();
			
	}

}
