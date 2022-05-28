package com.example.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.User;
import com.example.bean.UserForm;
import com.example.repository.UserMapper;
import com.example.service.UpdateUserService;

@Service
public class UpdateUserServiceImpl implements UpdateUserService {

	@Autowired
	private UserMapper mapper;

	/** 更新 */
	@Override
	public void updateUser(User user, UserForm form) {

		user.setName(form.getName());
		user.setBirthdate(form.getBirthdate());
		user.setUpdatedAt(LocalDateTime.now());

		this.mapper.updateUser(user);

	}

}
