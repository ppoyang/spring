package com.wind.sp04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		MyInfo myInfo =  ctx.getBean("myInfo", MyInfo.class); //클래스 하나를 가지고 빈을 하나 만들기때문에 보통은 이름은 클래스명에서 맨 앞글자 소문자로만..
		ctx.close();
		
		myInfo.getInfo();
	}

}
