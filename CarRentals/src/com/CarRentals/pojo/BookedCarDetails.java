package com.CarRentals.pojo;

import java.io.Serializable;

public class BookedCarDetails implements Serializable 
{
    private static final long serialVersionUID = 1L;
    private String carid;
    private String bookingdt;
    private String noofseat;
    private String rate;
    
	public String getNoofseat() {
		return noofseat;
	}

	public void setNoofseat(String noofseat) {
		this.noofseat = noofseat;
	}

	public BookedCarDetails(String carid, String bookingdt, String noofseat, String rate) {
		super();
		this.carid = carid;
		this.bookingdt = bookingdt;
		this.noofseat = noofseat;
		this.rate = rate;
	}

	
	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getCarid() {
		return carid;
	}

	public void setCarid(String carid) {
		this.carid = carid;
	}

	public String getBookingdt() {
		return bookingdt;
	}

	public void setBookingdt(String bookingdt) {
		this.bookingdt = bookingdt;
	}
    
    
}
