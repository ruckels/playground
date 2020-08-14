package de.andreas_ruckelshausen.ARPbackend.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ARPInvalidInputExceptionMapper implements ExceptionMapper<ARPInvalidInputException> {

	@Override
	public Response toResponse(ARPInvalidInputException exception) {
		Response response = Response
				            .status(Status.BAD_REQUEST)
				            .entity(exception.getErrMsg())
				            .build();
		return response;
	}

}
