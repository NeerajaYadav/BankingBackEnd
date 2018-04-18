package com.aspiresys.bankingservice.service;

import com.aspiresys.bankingservice.dto.LoginDTO;

public interface LoginService {
	public LoginDTO allowLogin(LoginDTO loginDTO);
	public boolean create(LoginDTO loginDTO);
	
}
