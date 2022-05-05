package com.example.repository;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.bean.User;

@Mapper
public interface UserMapper {

	/** 登録 */
	public void setUser(User user);

	/** 名前+生年月日検索 */
	public List<User> getUser(@Param("name") String name, @Param("birthdate") LocalDate birthdate);

	/** 名前検索 */
	public List<User> getUserName(String name);

	/** 生年月日検索 */
	public List<User> getUserBirthdate(LocalDate birthdate);

	/** 全件検索 */
	public List<User> getUserAll();

}
