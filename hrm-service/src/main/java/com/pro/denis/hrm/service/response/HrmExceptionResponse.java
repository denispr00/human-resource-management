package com.pro.denis.hrm.service.response;

public class HrmExceptionResponse {

	private String errorMessage;
	private Integer responseCode;

	public HrmExceptionResponse() {

	}

	public HrmExceptionResponse(String errorMessage, Integer responseCode) {
		super();
		this.errorMessage = errorMessage;
		this.responseCode = responseCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Integer getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

}
