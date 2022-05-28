package com.example.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.User;
import com.example.bean.UserForm;
import com.example.service.RegisterUserService;

@RestController
public class RegisterUserController {

	@Autowired
	private RegisterUserService registerUserService;

	@Autowired
	private ModelMapper modelMapper;

	@PostMapping("/users")
	public String signup(@ModelAttribute UserForm form) {


		// 型変換
		User user = this.modelMapper.map(form, User.class);

		this.registerUserService.createUser(user);

		return "登録完了";

	}

}
