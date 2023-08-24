package com.example.day7.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fruits {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fruitsId;
	private String animals;
	private String cities;
	private String cars;
	private String bikes;
	private String flowers;
	private String colors;
	
	
	
	public int getFruitsId() {
		return fruitsId;
	}
	public void setFruitsId(int fruitsId) {
		this.fruitsId = fruitsId;
	}
	public String getAnimals() {
		return animals;
	}
	public void setAnimals(String animals) {
		this.animals = animals;
	}
	public String getCities() {
		return cities;
	}
	public void setCities(String cities) {
		this.cities = cities;
	}
	public String getCars() {
		return cars;
	}
	public void setCars(String cars) {
		this.cars = cars;
	}
	public String getBikes() {
		return bikes;
	}
	public void setBikes(String bikes) {
		this.bikes = bikes;
	}
	public String getFlowers() {
		return flowers;
	}
	public void setFlowers(String flowers) {
		this.flowers = flowers;
	}
	public String getColors() {
		return colors;
	}
	public void setColors(String colors) {
		this.colors = colors;
	}
	
	

}
