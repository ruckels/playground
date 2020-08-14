package de.andreas_ruckelshausen.ARPbackend.exception;

import de.andreas_ruckelshausen.ARPbackend.models.ErrorMessage;

public class ARPDataNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = -3942827405668000063L;
	
	
	ErrorMessage errMsg = null;

	public ARPDataNotFoundException(ErrorMessage errMsg) {
		super(errMsg.getErrorMessage());
		this.errMsg = errMsg;
	}

	public ErrorMessage getErrMsg() {
		return errMsg;
	}
	
	

	
	
}
