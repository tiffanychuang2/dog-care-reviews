package com.dogcarereviews;

public class DogCare {
	
//	instance variables
	private long id;
	private String name;
	private String imageUrl;
	private String service;
	private String rating;
	private String location;
	private String yearOpened;
	private String contact;
	
//	constructors
	public DogCare(long id, String name, String imageUrl, String service, String rating, String location, String yearOpened, String contact) {
		this.id = id;
		this.name = name;
		this.imageUrl = imageUrl;
		this.service = service;
		this.rating = rating;
		this.location = location;
		this.yearOpened = yearOpened;
		this.contact = contact;
	}
	
//	getters
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public String getImageUrl() {
		return imageUrl;
	}
	
	public String getService() {
		return service;
	}
	
	public String getRating() {
		return rating;
	}

	public String getYearOpened() {
		return yearOpened;
	}
	
	public String getContact() {
		return contact;
	}
	
	//	setters
	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getLocation() {
		return location;
	}	
	
	public void setService(String service) {
		this.service = service;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setYearOpened(String yearOpened) {
		this.yearOpened = yearOpened;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
}
