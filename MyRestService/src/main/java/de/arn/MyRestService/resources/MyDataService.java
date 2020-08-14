package de.arn.MyRestService.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/data")
public class MyDataService {
	
	/**
	 * Returns the requested data
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getData(){
		return "my data from somewhere";
	}

}
