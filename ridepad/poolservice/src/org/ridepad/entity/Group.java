package org.ridepad.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the groups database table.
 * 
 */
@Entity
@Table(name="groups")
public class Group implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idgroups;

	private String friend;

	private String userid;
	
	private String status;

    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Group() {
    }

	public int getIdgroups() {
		return this.idgroups;
	}

	public void setIdgroups(int idgroups) {
		this.idgroups = idgroups;
	}

	public String getFriend() {
		return this.friend;
	}

	public void setFriend(String friend) {
		this.friend = friend;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}