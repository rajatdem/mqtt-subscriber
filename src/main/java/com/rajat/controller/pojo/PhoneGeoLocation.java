package com.rajat.controller.pojo;

public class PhoneGeoLocation {

	private String latitude;
	private String longitude;
	private String altitude;

	public PhoneGeoLocation(double latitude, double longitude, double altitude) {
		super();
		this.latitude = latitude+"";
		this.longitude = longitude+"";
		this.altitude = altitude+"";
	}
	public PhoneGeoLocation() {
		super();
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getAltitude() {
		return altitude;
	}
	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}
	
	
}
