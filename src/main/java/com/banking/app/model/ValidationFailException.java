package com.banking.app.model;


public class ValidationFailException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String message;
	private String code;
	
	public ValidationFailException(String code){
		super(code);
	}
	
	public ValidationFailException(String code,String message){
		this.code=code;
		this.message=message;
	}

	public String getMessage() {
		return message;
	}
	
	public String getCode() {
		return code;
	}
}