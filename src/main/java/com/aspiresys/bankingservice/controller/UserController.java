package com.aspiresys.bankingservice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aspiresys.bankingservice.dto.UserDTO;
import com.aspiresys.bankingservice.service.UserService;

@RestController
public class UserController {

	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST )
	public ResponseEntity<Boolean> create(@Valid @RequestBody UserDTO userDTO) {
		return new ResponseEntity<Boolean>(userService.create(userDTO), HttpStatus.ACCEPTED);
	} 
	
	
	
}
