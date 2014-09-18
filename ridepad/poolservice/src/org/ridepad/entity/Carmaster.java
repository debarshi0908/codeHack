package org.ridepad.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the carmaster database table.
 * 
 */
@Entity
public class Carmaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idcarmaster;

	private String carmake;

	private String carmodel;

	private String mpg1;

	private String mpg2;

	private String year;

    public Carmaster() {
    }

	public int getIdcarmaster() {
		return this.idcarmaster;
	}

	public void setIdcarmaster(int idcarmaster) {
		this.idcarmaster = idcarmaster;
	}

	public String getCarmake() {
		return this.carmake;
	}

	public void setCarmake(String carmake) {
		this.carmake = carmake;
	}

	public String getCarmodel() {
		return this.carmodel;
	}

	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}

	public String getMpg1() {
		return this.mpg1;
	}

	public void setMpg1(String mpg1) {
		this.mpg1 = mpg1;
	}

	public String getMpg2() {
		return this.mpg2;
	}

	public void setMpg2(String mpg2) {
		this.mpg2 = mpg2;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}