package com.example.quizportal.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.quizportal.entity.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {

	Optional<Admin> findByAdminnameAndPassword(String name, String password);

}