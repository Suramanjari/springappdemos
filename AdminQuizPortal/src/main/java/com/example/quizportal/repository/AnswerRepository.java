package com.example.quizportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.quizportal.entity.Answer;

public interface AnswerRepository extends CrudRepository<Answer, Integer> {

}