package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.User;
import com.example.bean.UserForm;
import com.example.service.UserService;

@RestController
public class UpdateUserController {

	@Autowired
	private UserService userService;

	@PatchMapping("/users/{id}")
	public String deleteUser(@PathVariable("id") String id, @ModelAttribute UserForm form) {

		// idで検索
		User user = this.userService.readUserId(id);

		if (user.getId() != null) {
			// 持ってきたユーザーを更新
			this.userService.updateUser(user, form);
			return "更新完了メッセージ";
		} else if (user.getId() == null) {
			return "該当ユーザーなし";
		}

		return "";

	}

}
