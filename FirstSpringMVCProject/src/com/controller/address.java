package com.controller;

import org.springframework.stereotype.Controller;

@Controller
public class address {
	
	private int housenumber;
	private String city;
	private String state;
	private long pincode;
	private long phonenumber;

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public int getHousenumber() {
		return housenumber;
	}
	public void setHousenumber(int housenumber) {
		this.housenumber = housenumber;
	}
	

}
 