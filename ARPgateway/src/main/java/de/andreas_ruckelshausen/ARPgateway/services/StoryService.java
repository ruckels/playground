package de.andreas_ruckelshausen.ARPgateway.services;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import de.andreas_ruckelshausen.ARPgateway.models.*;

public class StoryService {

	
	//TODO tuning: only open once
	public StoryService() {
		// TODO Auto-generated constructor stub
	}
	
	public StoryExternal getStory(int id) {
		Client client = ClientBuilder.newClient();
		WebTarget baseTarget = client.target("http://localhost:8085/ARPbackend/");
		WebTarget storiesTarget = baseTarget.path("stories");
		WebTarget singleStoryTarget = storiesTarget.path("{id}");
		//singleStoryTarget = client.target("http://localhost:8085/ARPbackend/stories/{id}");
		
		StoryBackend story = singleStoryTarget
				.resolveTemplate("id", id)
				.request(MediaType.APPLICATION_JSON)
				.get(StoryBackend.class);

		story.transform();
		
		return story;
	}

}
