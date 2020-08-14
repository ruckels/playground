package de.andreas_ruckelshausen.ARPbackend.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.andreas_ruckelshausen.ARPbackend.exception.ARPInvalidInputException;
import de.andreas_ruckelshausen.ARPbackend.models.ErrorMessage;
import de.andreas_ruckelshausen.ARPbackend.models.Story;
import de.andreas_ruckelshausen.ARPbackend.services.StoryService;

/**
 * Root resource (exposed at "hello" path)
 */
@Path("/stories")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class StoryRessource {

	StoryService storyService = new StoryService();

	public StoryRessource() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GET
	// @Produces(MediaType.APPLICATION_JSON)
	public List<Story> getStories() {
		List<Story> storyList = storyService.getStoryList();
		// return Response.status(Status.OK).entity(storyList).build();
		return storyList;
	}

	@Path("/{id}")
	@GET
	// @Produces(MediaType.APPLICATION_JSON)
	public Story getStory(@PathParam("id") int id) {
		return storyService.getStory(id);
	}

	/**
	 * 
	 * @param newStory
	 * @return int id of new created story
	 */
	@POST
	public Story addStory(Story newStory) {
		return storyService.addStory(newStory);
	}

	/**
	 * 
	 * @param newStory
	 * @return void
	 */
	@Path("/{id}")
	@PUT
	// @Consumes(MediaType.APPLICATION_JSON)
	// @Produces(MediaType.APPLICATION_JSON)
	public Story modifyStory(@PathParam("id") int id, Story modifiedStory) {
		if (id == modifiedStory.getId() || modifiedStory.getId() == -1) {
			modifiedStory.setId(id);
			storyService.modifyStory(modifiedStory);
		} else {
			ErrorMessage errMsg = new ErrorMessage("Invalid id combination. id in path is not equal id in body", 40001,
					"see technical documentation.");
			throw new ARPInvalidInputException(errMsg);
		}
		return modifiedStory;
	}

	@Path("/{id}")
	@DELETE
	public String deleteStory(@PathParam("id") int id) {
		storyService.deleteStory(id);
		return "Story has been deleted";
	}
}
