package org.ridepad.ext;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The persistent class for the groups database table.
 * 
 */

@XmlRootElement
public class GroupExt implements Serializable {
	private static final long serialVersionUID = 1L;


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

	public GroupExt() {
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