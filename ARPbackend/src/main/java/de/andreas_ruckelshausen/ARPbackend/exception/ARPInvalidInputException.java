package de.andreas_ruckelshausen.ARPbackend.exception;

import de.andreas_ruckelshausen.ARPbackend.models.ErrorMessage;

public class ARPInvalidInputException extends RuntimeException{

	private static final long serialVersionUID = -4177480794991566992L;
	
	ErrorMessage errMsg = null;

	public ARPInvalidInputException(ErrorMessage errMsg) {
		super(errMsg.getErrorMessage());
		this.errMsg = errMsg;
	}

	public ErrorMessage getErrMsg() {
		return errMsg;
	}
	
	

	
	
}
