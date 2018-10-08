package com.pro.denis.hrm.rest.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.pro.denis.hrm.service.HrmException;
import com.pro.denis.hrm.service.response.HrmExceptionResponse;

@RestControllerAdvice(annotations = RestController.class)
public class ExceptionHandlerController {

	private final Log logger = LogFactory.getLog(this.getClass());

	@ExceptionHandler(HrmException.class)
	public @ResponseBody ResponseEntity<HrmExceptionResponse> handleHrmException(HttpServletRequest request,
			HrmException ex) {
		logger.info("HrmException Occured:: URL=" + request.getRequestURL());
		HrmExceptionResponse hrmExceptionResponse = new HrmExceptionResponse();
		if (ex != null) {
			hrmExceptionResponse.setErrorMessage(ex.getJsonMessage());
			hrmExceptionResponse.setResponseCode(101);
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(hrmExceptionResponse);
	}


}
