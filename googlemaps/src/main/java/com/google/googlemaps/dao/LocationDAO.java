package com.google.googlemaps.dao;

import java.util.Random;

public class LocationDAO 
{
	public LocationDataDTO getLocationData(String location)
	{
		/*
		 * Assume that we're getting the data from DB
		 */
		LocationDataDTO data = new LocationDataDTO();
		data.setLocation(location);
		data.setLatitude(new Random().nextDouble());
		data.setLongitude(new Random().nextDouble());
		return data;
	}
}
