package com.devsuperior.dsmovie.repositories;

import com.devsuperior.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}