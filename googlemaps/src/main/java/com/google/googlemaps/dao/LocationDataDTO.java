package com.google.googlemaps.dao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="location-data")
@XmlAccessorType(XmlAccessType.FIELD)
public class LocationDataDTO 
{
	@XmlElement
	private String location;
	
	@XmlElement
	private double longitude;
	
	@XmlElement
	private double latitude;
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	@Override
	public String toString() {
		return "LocationDataDTO [location=" + location + ", longitude=" + longitude + ", latitude=" + latitude + "]";
	}
}
