package com.example.quizportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.quizportal.entity.Quiz;

public interface QuizRepository extends CrudRepository<Quiz, Integer> {

}