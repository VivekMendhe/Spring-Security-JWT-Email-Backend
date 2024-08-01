package com.pack.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.book.models.User;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByEmail(String email);
}