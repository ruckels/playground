package de.andreas_ruckelshausen.ARPgateway.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.andreas_ruckelshausen.ARPgateway.models.*;
import de.andreas_ruckelshausen.ARPgateway.services.StoryService;


@Path("/stories")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class StoryResource{
	
	StoryService storyService = new StoryService();

    
	@Path("/{id}")
	@GET
	public StoryExternal getStory(@PathParam("id") int id) {
		//return new Story();
		System.out.println("getStoryRessource...");
		return storyService.getStory(id);
	}
	
}
