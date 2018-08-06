package com.wind.web.dto;

public class VetspecialtiesDto {
	private int vet_id;
	private int spcialty_id;
	
	public VetspecialtiesDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VetspecialtiesDto(int vet_id, int spcialty_id) {
		super();
		this.vet_id = vet_id;
		this.spcialty_id = spcialty_id;
	}

	public int getVet_id() {
		return vet_id;
	}

	public void setVet_id(int vet_id) {
		this.vet_id = vet_id;
	}

	public int getSpcialty_id() {
		return spcialty_id;
	}

	public void setSpcialty_id(int spcialty_id) {
		this.spcialty_id = spcialty_id;
	}
	
}
