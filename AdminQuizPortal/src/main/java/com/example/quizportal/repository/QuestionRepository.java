package com.example.quizportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.quizportal.entity.Questions;

public interface QuestionRepository extends CrudRepository<Questions, Integer> {

}