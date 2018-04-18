package com.aspiresys.bankingservice.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspiresys.bankingservice.dto.UserDTO;
import com.aspiresys.bankingservice.entity.UserEntity;
import com.aspiresys.bankingservice.repository.UserRepository;
import com.aspiresys.bankingservice.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	private DozerBeanMapper beanMapper;

	public List<UserDTO> listAllUsers() {
		List<UserEntity> userEntity = userRepository.findAll();
		List<UserDTO> userDTO = new ArrayList<UserDTO>();
		beanMapper.map(userEntity, userDTO);						
		return userDTO;
	}
}
