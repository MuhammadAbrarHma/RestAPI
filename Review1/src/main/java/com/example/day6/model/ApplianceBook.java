package com.example.day6.model;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ApplianceBook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int appId;
	//@Column(name="appcode")
	private int appCode;
	private String appName;
	private int appPrice;
	private int appQty;
	private String appCity;
	private int appWarren;
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	public int getAppCode() {
		return appCode;
	}
	public void setAppCode(int appCode) {
		this.appCode = appCode;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public int getAppPrice() {
		return appPrice;
	}
	public void setAppPrice(int appPrice) {
		this.appPrice = appPrice;
	}
	public int getAppQty() {
		return appQty;
	}
	public void setAppQty(int appQty) {
		this.appQty = appQty;
	}
	public String getAppCity() {
		return appCity;
	}
	public void setAppCity(String appCity) {
		this.appCity = appCity;
	}
	public int getAppWarren() {
		return appWarren;
	}
	public void setAppWarren(int appWarren) {
		this.appWarren = appWarren;
	}
	
	
	
	
	
}
