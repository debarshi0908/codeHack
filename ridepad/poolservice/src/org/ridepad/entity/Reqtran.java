package org.ridepad.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the reqtrans database table.
 * 
 */
@Entity
@Table(name="reqtrans")
public class Reqtran implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String email;

	private String participants;

	private String state;

	private Timestamp timetx;
	
	private String email2;

    public Reqtran() {
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
	
	public String getEmail2() {
		return this.email;
	}

	public void setEmail2(String email) {
		this.email2 = email;
	}

}