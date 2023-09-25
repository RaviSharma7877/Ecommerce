package com.masai.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrorDetails> getExceptionForNoHandler(NoHandlerFoundException ex, WebRequest request){
		ErrorDetails ed = new ErrorDetails(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(ed,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoUserFoundException.class)
	public ResponseEntity<ErrorDetails> UserNotFound(NoUserFoundException ex, WebRequest request){
		ErrorDetails ed = new ErrorDetails(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(ed,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(NoProductFountException.class)
	public ResponseEntity<ErrorDetails> ProductNotFound(NoProductFountException ex, WebRequest request){
		ErrorDetails ed = new ErrorDetails(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(ed,HttpStatus.NOT_FOUND);
	}
}
