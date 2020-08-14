package de.arn.MyRestService.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import de.arn.MyRestService.dao.Database;
import de.arn.MyRestService.model.Task;

@Path("/tasks")
@Produces(MediaType.APPLICATION_JSON)
public class MyTaskService {
	
	public MyTaskService(){
		super();
	}

	@GET
	@Path("/demo")
	@Produces(MediaType.TEXT_PLAIN)
	public String getDemo(@HeaderParam("exampleHeaderParam") String headerParam, 
			                  @QueryParam("extraMessage") String extraMessage,
			                  @CookieParam("cookieTest") String cookieTest) {
		return "Header: " + headerParam + "\nmessage: " + extraMessage + "\ncookie: " + cookieTest;
	}
	
	@GET
	public List<Task> getAllTasks() {
		return Database.getInstance().getAllTasks();
	}
	
	@GET
	@Path("/{taskId}")
	public Task getTask(@PathParam("taskId") long id){
		return Database.getInstance().getTask(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Task createTask(Task newTask){
		System.out.println("create...");
		return Database.getInstance().createTask(newTask);
	}
	
	@POST
	@Path("/secure/init")
	@Produces(MediaType.TEXT_PLAIN)
	public String initTasks(){
		Database.getInstance().initData();
		return "Daten wurden neu initialisiert";
	}
	
	@PUT
	//@Path("/{taskId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void modifyTask(Task modifiedTask){
		System.out.println("modify...");
		Database.getInstance().updateTask(modifiedTask);
	}
	
	@DELETE
	@Path("/{taskId}")
	public void removeTask(@PathParam("taskId") long taskId){
		Database.getInstance().removeTask(taskId);
	}

}
