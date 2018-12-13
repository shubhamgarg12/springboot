package com.fakelook.main.exceptioncontroller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fakelook.main.error.ErrorDetails;
import com.fakelook.main.exceptionhandler.UserException;

@RestControllerAdvice
public class UserExceptionController {
 
	@ExceptionHandler(value = UserException.class)
	@RequestMapping(value= "/error",produces = "application/json")
	public ErrorDetails registerExceptio(UserException userException) {
		
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setCode("400");
		errorDetails.setMessage(userException.getMessage());	
		return errorDetails;
		
		
	}
}
