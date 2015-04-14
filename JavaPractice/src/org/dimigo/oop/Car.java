package org.dimigo.oop;

/**
 * org.dimigo.oop.Car
 *
 * 1. Scheme 	: 자동차 관련 클래스.
 * 2. Date 		: 2015. 4. 14.
 *
 * @author		: ryusim
 * @version		: 1.0 
 */

public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public int getPrice() {
		return price;
	}

	public void setCompany(String ucompany) {
		company = ucompany;
	}
	
	public void setModel(String umodel) {
		model = umodel;
	}
	
	public void setColor(String ucolor) {
		color = ucolor;
	}
	
	public void setMaxSpeed(int umaxSpeed) {
		maxSpeed = umaxSpeed;
	}
	
	public void setPrice(int uprice) {
		price = uprice;
	}
}
