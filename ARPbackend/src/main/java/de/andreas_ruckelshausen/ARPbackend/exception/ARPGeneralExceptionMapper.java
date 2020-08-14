package de.andreas_ruckelshausen.ARPbackend.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ARPGeneralExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable throwable) {
		throwable.printStackTrace(); //TODO log
		Response response = Response
	            .status(Status.INTERNAL_SERVER_ERROR)
	            .entity(throwable.getMessage())
	            .build();
		return response;
	}

}
