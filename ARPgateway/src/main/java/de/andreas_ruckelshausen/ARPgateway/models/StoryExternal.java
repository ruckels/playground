package de.andreas_ruckelshausen.ARPgateway.models;

/**
 * 
 * @author Andreas
 *
 */
public class StoryExternal{
	
	
	int id = -1;
	String shortDescription;
	String details;
	
	public StoryExternal() {
		super();
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}


	public String getShortDescription() {
		return this.shortDescription;
	}


	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	


}
