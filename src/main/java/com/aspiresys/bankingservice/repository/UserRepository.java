package com.aspiresys.bankingservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aspiresys.bankingservice.entity.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, String>{
	
	public List<UserEntity> findUserByAadharNumber(String aadharNumber);
	
	public List<UserEntity> findUserByStatus(String status);
	 
}
