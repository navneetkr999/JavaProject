package com.CarRentals.pojo;

import java.io.Serializable;
import java.util.ArrayList;

public class CarDetails implements Serializable 
{
    private static final long serialVersionUID = 1L;
	
	private String id;
	private String brand;
	private String modelname;
	private String seaters;
	private String rate;
    private String date;
	private String time;
	private String bdt;
	private ArrayList<String> bookingdt;
	
	public String getBdt() {
		return bdt;
	}

	public void setBdt(String bdt) {
		this.bdt = bdt;
	}

	
	
	public ArrayList<String> getBookingdt() {
		return bookingdt;
	}

	public void setBookingdt(ArrayList<String> bookingdt) {
		this.bookingdt = bookingdt;
	}

	
	
	public CarDetails(String seaters, String bdt) {
		super();
		this.seaters = seaters;
		this.bdt = bdt;
	}
	

	public CarDetails(String id, String brand, String modelname, String seaters, String rate, String date, String time,
			ArrayList<String> bookingdt) {
		super();
		this.id = id;
		this.brand = brand;
		this.modelname = modelname;
		this.seaters = seaters;
		this.rate = rate;
		this.date = date;
		this.time = time;
		this.bookingdt = bookingdt;
	}

	public CarDetails()
	{
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public String getSeaters() {
		return seaters;
	}

	public void setSeaters(String seaters) {
		this.seaters = seaters;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getModelname() 
	{
		return modelname;
	}



	
}
