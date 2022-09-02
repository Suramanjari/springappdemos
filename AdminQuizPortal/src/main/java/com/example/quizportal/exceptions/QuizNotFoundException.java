package com.example.quizportal.exceptions;

public class QuizNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public QuizNotFoundException(int id) {
		super("Quiz with id " + id + " not found.");
	}



}