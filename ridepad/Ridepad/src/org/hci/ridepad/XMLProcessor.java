package org.hci.ridepad;

import java.io.StringReader;
import java.util.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.ridepad.ext.Item;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;


public class XMLProcessor {

	public List<Item> convertToList(String str){
		
		List<Item> list =  new ArrayList<Item>();
		try{
		 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		 DocumentBuilder db = dbf.newDocumentBuilder();
		 InputSource is = new InputSource();
		 is.setCharacterStream(new StringReader(str));

		 Document doc = db.parse(is);
		 NodeList nodes = doc.getElementsByTagName("item");
		 for(int i=0; i < nodes.getLength(); i++){
			 Item item = new Item();
			 Element element = (Element) nodes.item(i);
			 NodeList entry = element.getElementsByTagName("entry");
			 Element line = (Element) entry.item(0);
			 item.setEntry(getCharacterDataFromElement(line));
			 list.add(item);
			 
			 
		 }
		 
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	public String getCharacterDataFromElement(Element e){
		Node child = e.getFirstChild();
		if(child instanceof CharacterData){
			CharacterData cd = (CharacterData) child;
			return cd.getData();
		}
		return "?";
	}
}
