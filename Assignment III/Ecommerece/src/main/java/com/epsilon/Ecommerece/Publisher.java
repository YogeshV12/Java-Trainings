package com.epsilon.Ecommerece;

public class Publisher {
	int publisherId;

	String name;

	String location;

	public int getPublisherId() {

	return publisherId;

	}

	public void setPublisherId(int publisherId) {

	this.publisherId = publisherId;

	}

	public String getName() {

	return name;

	}

	public void setName(String name) {

	this.name = name;

	}

	public String getLocation() {

	return location;

	}

	public void setLocation(String location) {

	this.location = location;

	}

	@Override

	public String toString() {

	return "Publisher [publisherId=" + publisherId + ", name=" + name + ", location=" + location + "]";

	}
}
