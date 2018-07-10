package com.wind.component;

import org.springframework.stereotype.Component;

@Component  
//Component 이노테이션을 통해 자동으로 Bean 등록
public class Conan {
		private String name;
		private int age;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
}
