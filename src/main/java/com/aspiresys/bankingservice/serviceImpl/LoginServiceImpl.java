package com.aspiresys.bankingservice.serviceImpl;

import java.util.Date;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspiresys.bankingservice.dto.LoginDTO;
import com.aspiresys.bankingservice.entity.LoginEntity;
import com.aspiresys.bankingservice.repository.LoginRepository;
import com.aspiresys.bankingservice.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository loginRepository;

	@Autowired
	private DozerBeanMapper beanMapper;

	@SuppressWarnings("null")
	@Override
	public LoginDTO allowLogin(LoginDTO loginDTO) {
		LoginDTO loginDTORef = null;
		LoginEntity loginEntity = beanMapper.map(loginDTO, LoginEntity.class);
		LoginEntity result = loginRepository.findSomeoneByUserName(loginEntity.getUserName());
		if (result != null) {
			if (result.getPassword().equals(loginDTO.getPassword())) {
				loginDTORef = beanMapper.map(result, LoginDTO.class);
				loginDTORef.setAuthorized(true);
			} else
				loginDTORef.setAuthorized(false);
		} else
			loginDTORef.setAuthorized(false);
		return loginDTORef;
	}

	@Override
	public boolean create(LoginDTO loginDTO) {
		LoginEntity loginEntity = beanMapper.map(loginDTO, LoginEntity.class);
		loginEntity.setCreatedAt(new Date());
		loginRepository.save(loginEntity);
		return true;
	}

}
