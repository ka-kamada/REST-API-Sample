package com.example.service;

import com.example.bean.User;
import com.example.bean.UserForm;

public interface UpdateUserService {

	/** 更新 */
	public void updateUser(User user, UserForm form);

}
