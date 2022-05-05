package com.example.bean;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SearchUserForm {

	private String name;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthdate;

}
