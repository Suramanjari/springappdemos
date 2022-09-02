package com.example.quizportal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.quizportal.exceptions.QuestionNotFoundException;

@ControllerAdvice
public class QuestionExceptionController {

	@ExceptionHandler(value = QuestionNotFoundException.class)
	public ResponseEntity<Object> handleException(QuestionNotFoundException ex) {
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}

}