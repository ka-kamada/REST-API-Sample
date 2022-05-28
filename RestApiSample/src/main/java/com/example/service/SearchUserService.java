package com.example.service;

import java.time.LocalDate;
import java.util.List;

import com.example.bean.User;

public interface SearchUserService {

	/** 名前+生年月日検索 */
	public List<User> readUser(String name, LocalDate birthdate);

	/** 名前検索 */
	public List<User> readUserName(String name);

	/** 生年月日検索 */
	public List<User> readUserBirthdate(LocalDate birthdate);

	/** 全件検索 */
	public List<User> readUserAll();

	/** ID検索 */
	public User readUserId(String id);

}
