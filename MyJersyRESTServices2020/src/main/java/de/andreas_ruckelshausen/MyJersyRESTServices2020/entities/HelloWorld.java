package de.andreas_ruckelshausen.MyJersyRESTServices2020.entities;

public class HelloWorld {
	
	int id = 0;
	String text = "hello API world";
	String description = "what should I say?";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
