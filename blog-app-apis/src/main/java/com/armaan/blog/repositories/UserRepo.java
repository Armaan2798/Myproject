package com.armaan.blog.repositories;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.armaan.blog.entities.User;

import jakarta.persistence.EntityManager;

public class UserRepo extends SimpleJpaRepository<User,Integer> {

	public UserRepo(JpaEntityInformation<User, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
		// TODO Auto-generated constructor stub
	}

	

}
