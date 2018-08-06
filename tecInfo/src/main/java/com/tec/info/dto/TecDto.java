package com.tec.info.dto;

public class TecDto {
	private int id;
	private String name;
	private String tel;
	private int salary;
	public TecDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TecDto(int id, String name, String tel, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
