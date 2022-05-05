package com.example.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.User;
import com.example.repository.UserMapper;
import com.example.service.UserService;

import de.huxhorn.sulky.ulid.ULID;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper mapper;

	@Autowired
	private ULID ulid;

	/** 登録 */
	@Override
	public void createUser(User user) {

		user.setId(ulidId());

		LocalDateTime now = LocalDateTime.now();
		user.setCreatedAt(now);
		user.setUpdatedAt(now);

		user.setUpdatedBy(user.getCreatedBy());

		System.out.println(user);

		this.mapper.setUser(user);
	}

	/** ID生成 */
	public String ulidId() {

		String ulidId = this.ulid.nextULID();

		return ulidId;

	}

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

}
