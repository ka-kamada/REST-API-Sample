package com.example.bean;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserView {

	private String id;
	private String name;
	private LocalDate birthdate;

}
