package com.banking.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value=Include.NON_NULL)
public class Error {
	private String code;
    private String value;
    public String getCode() {
        return code;
    }
    public Error setCode(String code) {
        this.code = code;
        return this;
    }
    public String getValue() {
        return value;
    }
    public Error setValue(String value) {
        this.value = value;
        return this;
    }
    
    public Error() {
    	
    }
	public Error(String code, String value) {
		super();
		this.code = code;
		this.value = value;
	}   
}
