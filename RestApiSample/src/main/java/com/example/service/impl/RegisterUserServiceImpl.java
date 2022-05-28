package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.User;
import com.example.repository.UserMapper;
import com.example.service.RegisterUserService;

import de.huxhorn.sulky.ulid.ULID;

@Service
public class RegisterUserServiceImpl implements RegisterUserService {

	@Autowired
	private UserMapper mapper;

	@Autowired
	private ULID ulid;

	/** 登録 */
	@Override
	public void createUser(User user) {

		System.out.println(user);

		user.userNew(user.getName(), user.getBirthdate(), user.getCreatedBy());
		System.out.println(user);

		this.mapper.setUser(user);
	}

	/** ID生成 */
	public String ulidId() {

		String ulidId = this.ulid.nextULID();

		return ulidId;

	}

}
