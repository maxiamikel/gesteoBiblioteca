package com.damapi.gestao_biblioteca.controllers.exceptions;

import javax.servlet.ServletRequest;

import org.hibernate.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<CommonExceptions> objectNotFoundException(ObjectNotFoundException e, ServletRequest request){
		CommonExceptions error = new CommonExceptions(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(),	e.getMessage());
		//CommonExceptions err = new CommonExceptions(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(),	e.getMessage())
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}

}
