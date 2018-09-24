package com.example.demo.exception.handling;

public class BaseException extends RuntimeException {
	
	private String errorMessage;
	private String ErrorCode;
	
	public BaseException(String errorMessage, String errorCode) {
		super();
		this.errorMessage = errorMessage;
		ErrorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return ErrorCode;
	}

	public void setErrorCode(String errorCode) {
		ErrorCode = errorCode;
	}
	
	
	

}
