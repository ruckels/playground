package de.andreas_ruckelshausen.ARPbackend.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ARPDataNotFoundExceptionMapper implements ExceptionMapper<ARPDataNotFoundException> {

	@Override
	public Response toResponse(ARPDataNotFoundException exception) {
		Response response = Response
				            .status(Status.NOT_FOUND)
				            .entity(exception.getErrMsg())
				            .build();
		return response;
	}

}
