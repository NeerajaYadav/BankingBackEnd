package com.aspiresys.bankingservice.service;

import com.aspiresys.bankingservice.dto.UserDTO;

public interface UserService {

	public boolean create(UserDTO userDTO);

	//public List<UserDTO> listAllUsers();

	// public UserDTO listUserById(String aadharNumber);

	// public Boolean delete(String aadharNumber);
	// public Boolean isUserExists(String aadharNumber);

}
