package com.example.SpringSecurity.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringSecurity.entities.User;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringSecurity.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByName(String name);
}