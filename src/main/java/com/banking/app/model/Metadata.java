package com.banking.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value=Include.NON_NULL)
public class Metadata {
	private Long   requestTs;
    private Long   responseTs;
    private String apiVer;
	public Long getRequestTs() {
		return requestTs;
	}
	public Metadata setRequestTs(Long requestTs) {
		this.requestTs = requestTs;
		return this;
	}
	public Long getResponseTs() {
		return responseTs;
	}
	public Metadata setResponseTs(Long responseTs) {
		this.responseTs = responseTs;
		return this;
	}
	public String getApiVer() {
		return apiVer;
	}
	public Metadata setApiVer(String apiVer) {
		this.apiVer = apiVer;
		return this;
	}
}
