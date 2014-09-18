package org.ridepad.ext;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The persistent class for the cars database table.
 * 
 */

@XmlRootElement
public class CarExt implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private String email;

	private String cartype;

	private String miles;

	private String model;

	private String mpg;

	private String mpg2;

	private String pricepg;

	private String year;

    public CarExt() {
    }

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCartype() {
		return this.cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	public String getMiles() {
		return this.miles;
	}

	public void setMiles(String miles) {
		this.miles = miles;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMpg() {
		return this.mpg;
	}

	public void setMpg(String mpg) {
		this.mpg = mpg;
	}

	public String getMpg2() {
		return this.mpg2;
	}

	public void setMpg2(String mpg2) {
		this.mpg2 = mpg2;
	}

	public String getPricepg() {
		return this.pricepg;
	}

	public void setPricepg(String pricepg) {
		this.pricepg = pricepg;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}