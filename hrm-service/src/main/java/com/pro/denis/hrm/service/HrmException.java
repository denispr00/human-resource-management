package com.pro.denis.hrm.service;

import org.springframework.http.HttpStatus;

public class HrmException extends Exception {

	HttpStatus httpStatus;

	String jsonMessage;

	public HrmException(HttpStatus httpStatus, String message, String jsonMessage) {
		super("hrm exception" + message);
		this.httpStatus = httpStatus;
		this.jsonMessage = jsonMessage;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getJsonMessage() {
		return jsonMessage;
	}

	public void setJsonMessage(String jsonMessage) {
		this.jsonMessage = jsonMessage;
	}

}
