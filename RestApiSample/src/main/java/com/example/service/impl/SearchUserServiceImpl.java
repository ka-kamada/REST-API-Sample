package com.example.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.User;
import com.example.repository.UserMapper;
import com.example.service.SearchUserService;

@Service
public class SearchUserServiceImpl implements SearchUserService {

	@Autowired
	private UserMapper mapper;

	/** 名前+生年月日検索 */
	@Override
	public List<User> readUser(String name, LocalDate birthdate) {

		List<User> list = this.mapper.getUser(name, birthdate);

		return list;
	}

	/** 名前検索 */
	@Override
	public List<User> readUserName(String name) {

		List<User> list = this.mapper.getUserName(name);

		return list;

	}

	/** 生年月日検索 */
	@Override
	public List<User> readUserBirthdate(LocalDate birthdate) {

		List<User> list = this.mapper.getUserBirthdate(birthdate);

		return list;
	}

	/** 全件検索 */
	@Override
	public List<User> readUserAll() {

		List<User> list = this.mapper.getUserAll();

		return list;
	}

	/** ID検索 */
	@Override
	public User readUserId(String id) {

		User user = this.mapper.getUserId(id);

		return user;
	}

}
