package com.example.quizportal.exceptions;

public class QuestionNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public QuestionNotFoundException(int id) {
		super("Question with id " + id + " not found.");
	}



}