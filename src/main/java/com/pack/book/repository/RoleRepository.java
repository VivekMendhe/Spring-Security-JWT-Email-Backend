package com.pack.book.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.book.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	Optional<Role> findByName(String roleStudent);
}
