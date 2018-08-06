package com.tec.info.dto;

public class TecMajorDto {
	private int tec_id;
	private int major_id;
	public TecMajorDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TecMajorDto(int tec_id, int major_id) {
		super();
		this.tec_id = tec_id;
		this.major_id = major_id;
	}
	public int getTec_id() {
		return tec_id;
	}
	public void setTec_id(int tec_id) {
		this.tec_id = tec_id;
	}
	public int getMajor_id() {
		return major_id;
	}
	public void setMajor_id(int major_id) {
		this.major_id = major_id;
	}
}
