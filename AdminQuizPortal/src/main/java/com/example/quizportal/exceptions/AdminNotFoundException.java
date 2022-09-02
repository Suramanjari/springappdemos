package com.example.quizportal.exceptions;

public class AdminNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AdminNotFoundException(int id) {
		super("Admin with id " + id + " not found.");
	}

	public AdminNotFoundException(String username, String password) {
		super("Admin with Username: " + username + " password " + password + " not found.");
	}

}