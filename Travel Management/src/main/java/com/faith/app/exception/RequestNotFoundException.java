package com.faith.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class RequestNotFoundException extends RuntimeException{
		public static final long serialVersionUID=1L;
		
		public RequestNotFoundException(String message) {
			super(message);
		}
}

