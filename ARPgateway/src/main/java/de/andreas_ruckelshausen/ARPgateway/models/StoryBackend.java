package de.andreas_ruckelshausen.ARPgateway.models;

import javax.xml.bind.annotation.XmlTransient;

public class StoryBackend extends StoryExternal {

	String shortDesc;

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	@XmlTransient
	public void transform() {
		this.shortDescription = this.shortDesc + " => transformed";
	}
	
}
