package com.tec.info.dto;

public class MajorDto {
	private int id;
	private String cate;
	public MajorDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MajorDto(int id, String cate) {
		super();
		this.id = id;
		this.cate = cate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCate() {
		return cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}
	
}
