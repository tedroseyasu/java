package com.Spring.SpringJPA.service;

import org.springframework.stereotype.Repository;

import com.Spring.SpringJPA.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UserDAOService {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	public long insert(User user) {
		
		entityManager.persist(user);
		return user.getId();
	}
}
