package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.SearchUserForm;
import com.example.bean.User;
import com.example.bean.UserView;
import com.example.service.UserService;

@RestController
public class SearchUserController {

	@Autowired
	private UserService userService;

	@Autowired
	private ModelMapper modelMapper;


	@GetMapping("/users")
	public List<UserView> searchUserName(@ModelAttribute SearchUserForm form) {

		List<User> list = new ArrayList<User>();
		List<UserView> listView = new ArrayList<UserView>();

		//それぞれのパターンで検索
		if(form.getName() != null && form.getBirthdate() == null) {
			list = this.userService.readUserName(form.getName());
		} else if(form.getName() == null && form.getBirthdate() != null) {
			list = this.userService.readUserBirthdate(form.getBirthdate());
		} else if (form.getName() != null && form.getBirthdate() != null) {
			list = this.userService.readUser(form.getName(), form.getBirthdate());
		} else if (form.getName() == null && form.getBirthdate() == null) {
			list = this.userService.readUserAll();
		}

		// Listの中身を変換
		for (int i = 0; i < list.size(); i++) {

			UserView userView = this.modelMapper.map(list.get(i), UserView.class);
			listView.add(userView);

		}
		return listView;

	}
}