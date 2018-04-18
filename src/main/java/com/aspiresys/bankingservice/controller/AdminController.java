package com.aspiresys.bankingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aspiresys.bankingservice.dto.UserDTO;
import com.aspiresys.bankingservice.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	//Not getting the desired results(status is not coming)
	@RequestMapping(value = "/admin/allusers", method = RequestMethod.GET)
	public ResponseEntity<List<UserDTO>> getAllUser() {
		return new ResponseEntity<List<UserDTO>>(adminService.listAllUsers(), HttpStatus.OK);
	}
}
