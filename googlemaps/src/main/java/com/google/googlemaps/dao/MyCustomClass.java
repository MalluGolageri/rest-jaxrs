package com.google.googlemaps.dao;

public class MyCustomClass 
{
	private String location;

	public MyCustomClass(String location){
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "MyCustomClass [location=" + location + "]";
	}
	
}
