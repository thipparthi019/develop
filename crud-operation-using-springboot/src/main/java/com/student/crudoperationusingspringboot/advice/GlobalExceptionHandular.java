package com.student.crudoperationusingspringboot.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.student.crudoperationusingspringboot.exception.IdAlredyExistException;
import com.student.crudoperationusingspringboot.exception.IdNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandular {

	@ExceptionHandler(IdAlredyExistException.class)
	public ResponseEntity<String> handelIdExistException(IdAlredyExistException e)
	{
		return new ResponseEntity<String>("The id already exist,please give another RollNO....",HttpStatus.FOUND);
	}
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<String> handleIdNotFoundExcepton(IdNotFoundException e){
		return new ResponseEntity<String>("Student is not there given with that RollNo",HttpStatus.FOUND);
	}
}
