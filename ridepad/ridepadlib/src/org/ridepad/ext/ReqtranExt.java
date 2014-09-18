package org.ridepad.ext;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.sql.Timestamp;


/**
 * The persistent class for the reqtrans database table.
 * 
 */

@XmlRootElement
public class ReqtranExt implements Serializable {
	private static final long serialVersionUID = 1L;


	private int id;

	private String email;

	private String participants;

	private String state;

	private Timestamp timetx;

    public ReqtranExt() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getParticipants() {
		return this.participants;
	}

	public void setParticipants(String participants) {
		this.participants = participants;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Timestamp getTimetx() {
		return this.timetx;
	}

	public void setTimetx(Timestamp timetx) {
		this.timetx = timetx;
	}

}