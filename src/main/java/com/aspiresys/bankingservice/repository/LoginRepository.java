package com.aspiresys.bankingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aspiresys.bankingservice.entity.LoginEntity;

public interface LoginRepository extends JpaRepository<LoginEntity, Long> {
	public LoginEntity findSomeoneByUserName(String userName);
}
