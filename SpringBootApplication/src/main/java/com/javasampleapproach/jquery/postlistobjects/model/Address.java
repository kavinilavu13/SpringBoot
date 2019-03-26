package com.javasampleapproach.jquery.postlistobjects.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	 
	private String street;
	private String postcode;
	
	public Address(){}
	
	public Address(String street, String postcode){
		this.street = street;
		this.postcode = postcode;
	}
 
	public String getStreet() {
		return street;
	}
 
	public void setStreet(String street) {
		this.street = street;
	}
 
	public String getPostcode() {
		return postcode;
	}
 
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
 
	@Override
	public String toString() {
		return "Address {street:" + street + ", postcode:" + postcode + "}";
	}
}