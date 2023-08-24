package com.example.day7.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class TransModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int transId;
	private String transName;
	private String transFood;
	@jakarta.persistence.Transient
	private String transJuices;
	private String transColors;
	private String transTeams;
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public String getTransName() {
		return transName;
	}
	public void setTransName(String transName) {
		this.transName = transName;
	}
	public String getTransFood() {
		return transFood;
	}
	public void setTransFood(String transFood) {
		this.transFood = transFood;
	}
	public String getTransJuices() {
		return transJuices;
	}
	public void setTransJuices(String transJuices) {
		this.transJuices = transJuices;
	}
	public String getTransColors() {
		return transColors;
	}
	public void setTransColors(String transColors) {
		this.transColors = transColors;
	}
	public String getTransTeams() {
		return transTeams;
	}
	public void setTransTeams(String transTeams) {
		this.transTeams = transTeams;
	}
	
	
}
