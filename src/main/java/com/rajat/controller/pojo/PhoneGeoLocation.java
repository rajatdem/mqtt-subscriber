package com.rajat.controller.pojo;

import org.json.JSONObject;

public class PhoneGeoLocation {

	public class Coordinates {
		private double latitude;
		private double longitude;
		
		public Coordinates(double latitude, double longitude) {
			super();
			this.latitude = latitude;
			this.longitude = longitude;
		}
		
		@Override
		public String toString () {
			return "\"coordinates\":"+"["+this.latitude+","+this.longitude+"]";
		}
	}
	private Coordinates geo;

	public PhoneGeoLocation(double latitude, double longitude) {
		super();
		this.geo =  new Coordinates (latitude, longitude);
	}
	public PhoneGeoLocation() {
		super();
	}
	
	@Override
	public String toString () {
		return "{\"geometry\":{\"type\": \"Point\","+geo.toString()+"}";
	}
}
