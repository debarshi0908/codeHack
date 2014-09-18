package org.hci.ridepad;

public class HomeItem {
	private int iconId;
	private String itemName;
	private boolean isSeperator;
	private int arrow;

	public HomeItem(int iconId, String itemName, boolean isSeperator,int arrow) {
		super();
		this.iconId = iconId;
		this.itemName = itemName;
		this.isSeperator = isSeperator;
		this.arrow=arrow;
		//this.icon=icon;
	}

	public boolean isSeperator() {
		return isSeperator;
	}

	public int getIconId() {
		return iconId;
	}

	public void setArrow(int arrow) {
		this.arrow = arrow;
	}
	public int getArrow() {
		return arrow;
	}

	public void setIconId(int iconId) {
		this.iconId = iconId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
