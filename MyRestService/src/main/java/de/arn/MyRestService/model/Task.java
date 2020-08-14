package de.arn.MyRestService.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Task {
	
	public Task(){
		super();
	}
	
	public Task(long id, String description, String person, Date plandate, double estimation) {
		super();
		this.id = id;
		this.description = description;
		this.person = person;
		this.plandate = plandate;
		this.estimation = estimation;
	}
	
	
	
	private long id;
	private String description;
	private String person;
	private Date plandate;
	private double estimation;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public Date getPlandate() {
		return plandate;
	}
	public void setPlandate(Date plandate) {
		this.plandate = plandate;
	}
	public double getEstimation() {
		return estimation;
	}
	public void setEstimation(double estimation) {
		this.estimation = estimation;
	}

}
