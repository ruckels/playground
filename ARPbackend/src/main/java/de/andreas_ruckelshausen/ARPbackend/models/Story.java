package de.andreas_ruckelshausen.ARPbackend.models;

/**
 * 
 * @author Andreas
 *
 */
public class Story {
	
	
	int id = -1;
	String shortDesc;
	String details;
	
	public Story() {
		super();
	}
	public Story(int id, String shortDesc, String details ) {
		this.id = id;
		this.shortDesc = shortDesc;
		this.details = details;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShortDesc() {
		return shortDesc;
	}
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}

}
