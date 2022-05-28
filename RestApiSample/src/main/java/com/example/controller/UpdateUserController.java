package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.User;
import com.example.bean.UserForm;
import com.example.service.SearchUserService;
import com.example.service.UpdateUserService;

@RestController
public class UpdateUserController {

	@Autowired
	private SearchUserService searchUserService;

	@Autowired
	private UpdateUserService updateUserService;

	@PatchMapping("/users/{id}")
	public String updateUser(@PathVariable("id") String id, @ModelAttribute UserForm form) {

		// idで検索
		User user = this.searchUserService.readUserId(id);

		if (user != null) {
			// 持ってきたユーザーを更新
			this.updateUserService.updateUser(user, form);

			return "user updated";

		} else if (user == null) {

			return "user not found";
		}

		return "";

	}

}
