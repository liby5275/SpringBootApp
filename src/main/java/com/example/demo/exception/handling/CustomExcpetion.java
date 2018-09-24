package com.example.demo.exception.handling;

public abstract class CustomExcpetion {

	
	public static final class BusinessException extends BaseException {

		public BusinessException(String errorMessage, String errorCode) {
			super(errorMessage, errorCode);
		}
		
	}

}
