package com.example.demo.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.jpa.Model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long>{
    Optional<User> findByEmail(String email);
}
