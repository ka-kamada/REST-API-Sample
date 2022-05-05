package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.User;
import com.example.service.UserService;

@RestController
public class DeleteUserController {

	@Autowired
	private UserService userService;

	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable("id") String id) {

		// idで検索
		User user = this.userService.readUserId(id);

		if (user.getId() != null) {
			// 持ってきたユーザーを論理削除
			this.userService.deleteUser(user);
			return "削除完了メッセージ";
		} else if (user.getId() == null) {
			return "該当ユーザーなし";
		}
		return "";


	}

}
