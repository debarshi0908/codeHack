package org.ridepad.ext;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Item {
	private String entry;

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}
	
	
}
