package com.example.day8.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BikeModal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int bikeId;
	private String bikeName;
	private String bikeAdd;
	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public String getBikeAdd() {
		return bikeAdd;
	}
	public void setBikeAdd(String bikeAdd) {
		this.bikeAdd = bikeAdd;
	}
	
}
