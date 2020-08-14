package de.andreas_ruckelshausen.ARPbackend.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ARPWebApplicationExceptionMapper implements ExceptionMapper<WebApplicationException> {


	@Override
	public Response toResponse(WebApplicationException exception) {
		exception.printStackTrace(); //TODO log
		Response response = Response
	            .status(Status.BAD_REQUEST)
	            .entity(exception.getMessage())
	            .build();
		return response;
	}

}
