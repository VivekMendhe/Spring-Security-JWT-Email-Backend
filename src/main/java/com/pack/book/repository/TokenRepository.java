package com.pack.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.book.models.Token;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Long> {
	Optional<Token> findByToken(String token);
}
