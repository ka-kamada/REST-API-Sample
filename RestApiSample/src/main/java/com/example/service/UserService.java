package com.example.service;

import java.time.LocalDate;
import java.util.List;

import com.example.bean.User;
import com.example.bean.UserForm;

public interface UserService {

	/** 登録 */
	public void createUser(User user);

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

	/** 削除 */
	public void deleteUser(User user);

	/** 更新 */
	public void updateUser(User user, UserForm form);

}
