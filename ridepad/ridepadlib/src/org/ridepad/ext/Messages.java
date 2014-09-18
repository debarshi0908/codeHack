package org.ridepad.ext;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement
@XmlSeeAlso(Message.class)
public class Messages {
	private List<Message> msg = new ArrayList<Message>();
	
	public Messages(){
		System.out.println("------------------Instance--------------");
	}
	public void add(Message m){
		System.out.println("------------------add--------------");
		msg.add(m);
	}
	
	public List<Message> getMessages(){
		return msg;
	}
}
