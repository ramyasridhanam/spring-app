package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

public class TourAppBean {
	private List<PlaceBean>  places=new ArrayList<>();
	private String message;
	public List<PlaceBean> getPlaces() {
		return places;
	}
	public void setPlaces(List<PlaceBean> places) {
		this.places = places;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
