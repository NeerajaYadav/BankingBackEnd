package com.aspiresys.bankingservice.service;

import java.util.List;

import com.aspiresys.bankingservice.dto.UserDTO;

public interface AdminService {
	public List<UserDTO> listAllUsers();
}
