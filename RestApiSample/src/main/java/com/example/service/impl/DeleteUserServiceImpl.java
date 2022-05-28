package com.example.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.User;
import com.example.repository.UserMapper;
import com.example.service.DeleteUserService;

@Service
public class DeleteUserServiceImpl implements DeleteUserService {

	@Autowired
	private UserMapper mapper;

	/** 削除 */
	@Override
	public void deleteUser(User user) {

		user.setDeletedAt(LocalDateTime.now());

		this.mapper.deleteUser(user.getId(), user.getDeletedAt());

	}

}
