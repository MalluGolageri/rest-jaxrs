package com.google.googlemaps.rest;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;

import javax.ws.rs.CookieParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.googlemaps.dao.LocationDAO;
import com.google.googlemaps.dao.LocationDataDTO;
import com.google.googlemaps.dao.MyCustomClass;

@Path("/mapsapi")
public class GoogleMapsRestServices 
{
	//@GET
	@POST
	@Path("/text/{location}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getLocationDataInString(
				@PathParam("location") MyCustomClass myclass,
				@QueryParam("state") boolean state,
				@QueryParam("country") Set<Byte> country_Code,
				@FormParam("knownFor") @DefaultValue("1") short known,
				@CookieParam("myName") String name,
				@CookieParam("myLocation") String myLoc,
				@MatrixParam("geoCode") int code,
				@HeaderParam("2") double hostNM) 
	{
		System.out.println("State :- "+state);
		System.out.println("Country Code :- "+country_Code);
		System.out.println("Known For :- "+known);
		System.out.println("myName :- "+name);
		System.out.println("myLocation :- "+myLoc);
		System.out.println("GEO Code :- "+code);
		System.out.println("Host Name :- "+hostNM);
		
		LocationDAO dao = new LocationDAO();
		LocationDataDTO data = dao.getLocationData(myclass.getLocation());
		return data.toString();
	}
	
	@GET
	@Path("/xml/{location}")
	@Produces(MediaType.APPLICATION_XML)
	public LocationDataDTO getLocationDataInXml(@PathParam("location") String location)
	{
		LocationDAO dao = new LocationDAO();
		return dao.getLocationData(location);
	}
	
	@GET
	@Path("/json/{location}")
	@Produces(MediaType.APPLICATION_JSON)
	public LocationDataDTO getLocationDataInJson(@PathParam("location") String location)
	{
		LocationDAO dao = new LocationDAO();
		return dao.getLocationData(location);
	}
	
}//End of Class

