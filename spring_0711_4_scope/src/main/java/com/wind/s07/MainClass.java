package com.wind.s07;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
			AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
			Student student1 = ctx.getBean("student", Student.class);
			System.out.println(student1.getName());
			System.out.println(student1.getAge());
			
			Student student2 = ctx.getBean("student", Student.class);
			student2.setName("햅번");
			System.out.println(student1.getName()); //singleton으로 만들어진 bean은 한 번 만들어진걸로 계속 사용됨
			if(student1.equals(student2)) {
				System.out.println("같다");
			}
			
			Student act1 = ctx.getBean("act",Student.class);  //prototype은 호출할때마다 bean을 만듦
			System.out.println("act1이름:"+act1.getName());
			
			Student act2 = ctx.getBean("act",Student.class);
			act2.setName("레이첼");
			System.out.println("act2이름:"+act2.getName());
			System.out.println("act1이름:"+act1.getName());
			
			if(act1.equals(act2)) {
				System.out.println("같다");
			}else {
				System.out.println("다르다");
			}
	}

}
