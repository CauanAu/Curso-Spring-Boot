package com.teste.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.demo.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}