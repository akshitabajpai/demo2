package com.cg.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN, reason="To show an example of a custom message")
public class ForbiddenException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;}
