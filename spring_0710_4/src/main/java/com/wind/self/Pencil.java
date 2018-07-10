package com.wind.self;

public class Pencil {
	private String name;
	
	public Pencil(String name) {
		this.name = name;
	}
	public void use() {
		System.out.println(this.name +"굵기로 씁니다.");
	}
}
