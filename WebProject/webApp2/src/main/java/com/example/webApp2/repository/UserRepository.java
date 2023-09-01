package com.example.webApp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.webApp2.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
