package com.aspiresys.bankingservice.serviceImpl;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspiresys.bankingservice.dto.UserDTO;
import com.aspiresys.bankingservice.entity.UserEntity;
import com.aspiresys.bankingservice.repository.UserRepository;
import com.aspiresys.bankingservice.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	private DozerBeanMapper beanMapper;

	@Override
	public boolean create(UserDTO userDTO) {
		UserEntity userEntity = beanMapper.map(userDTO, UserEntity.class);
		if (userRepository.findUserByAadharNumber(userEntity.getAadharNumber()).isEmpty()) {
			userRepository.save(userEntity);
			return true;
		} else
			return false;
	}

}
