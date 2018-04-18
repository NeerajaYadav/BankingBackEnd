package com.aspiresys.bankingservice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aspiresys.bankingservice.dto.LoginDTO;
import com.aspiresys.bankingservice.dto.UserDTO;
import com.aspiresys.bankingservice.service.LoginService;
import com.aspiresys.bankingservice.service.UserService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST )
	public ResponseEntity<LoginDTO> auth(@Valid @RequestBody LoginDTO loginDTO) {
		if(loginService.allowLogin(loginDTO).getAuthorized())
			return new ResponseEntity<LoginDTO>(loginService.allowLogin(loginDTO), HttpStatus.ACCEPTED);
		else
			return new ResponseEntity<LoginDTO>(loginService.allowLogin(loginDTO), HttpStatus.UNAUTHORIZED);
	}
	
	//Just for checking
	@RequestMapping(value = "/create", method = RequestMethod.POST )
	public ResponseEntity<Boolean> createlogin(@Valid @RequestBody LoginDTO loginDTO) {
		return new ResponseEntity<Boolean>(loginService.create(loginDTO), HttpStatus.CREATED);
	}
}
