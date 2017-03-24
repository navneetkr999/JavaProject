package com.CarRentals.pojo;

import java.io.Serializable;

public class EmployeeDetails implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	public String id;
	public String password;
	private String name;
	private String emailid;
	private String mobno;
    private String address;
	private String gender;
	private String dob;
	private String date;
	private String time;
	
	
	public EmployeeDetails(String id, String password,String name,String emailid,String mobno2, String address,
			String gender, String dob, String date,String time) 
	{
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.emailid = emailid;
		this.mobno = mobno2;
		this.address = address;
		this.gender = gender;
		this.dob = dob;
		this.date = date;
		this.time = time;
	}
	
	public EmployeeDetails()
	{
		
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
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

}
