package com.devsuperior.aula1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.aula1.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
