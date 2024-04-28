package com.Spring.SpringJPA.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.SpringJPA.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
