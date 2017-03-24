package com.CarRentals.pojo;

import java.io.Serializable;

public class CustomerDetails implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String emailid;
	private String mobno;
	private String carid;
    private String address;
    private String gender;
	private String date;
	private String time;
	private String rate;
	private String seaters;
	
	
	public CustomerDetails(String id, String name,String emailid,String mobno,String carid , 
		String gender,String address,String seaters, String bookingdate, String rate,String time) 
	{
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.mobno = mobno;
		this.carid = carid;
		this.address = address;
		this.gender = gender;
		this.rate = rate;
		this.date = bookingdate;
		this.time = time;
		this.seaters = seaters;
	}
	public CustomerDetails()
	{
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getCarid() {
		return carid;
	}
	public void setCarid(String carid) {
		this.carid = carid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getSeaters() {
		return seaters;
	}
	public void setSeaters(String seaters) {
		this.seaters = seaters;
	}
	


}
