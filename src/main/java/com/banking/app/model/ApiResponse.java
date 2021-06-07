package com.banking.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value=Include.NON_NULL)
public class ApiResponse<T> {

	private ApiStatus apiStatus;
	private Metadata metaData;
	private Error errors;
	private T data;
	private String message;
	public ApiStatus getApiStatus() {
		return apiStatus;
	}
	public void setApiStatus(ApiStatus apiStatus) {
		this.apiStatus = apiStatus;
	}
	public Metadata getMetaData() {
		return metaData;
	}
	public void setMetaData(Metadata metaData) {
		this.metaData = metaData;
	}
	public Error getErrors() {
		return errors;
	}
	public void setErrors(Error errors) {
		this.errors = errors;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
