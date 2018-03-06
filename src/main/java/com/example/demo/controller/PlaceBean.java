package com.example.demo.controller;

public class PlaceBean {

	public String name;
	String src;
	String city;
	String category;
	String location;
	
	public PlaceBean(String name,String src,String city,String category,String location)
	{
		this.city=city;
		this.category=category;
		this.src=src;
		this.location=location;
		this.name=name;
		
		
		
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	
	
	
}
