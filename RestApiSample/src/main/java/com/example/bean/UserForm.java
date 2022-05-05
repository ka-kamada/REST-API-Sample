package com.example.bean;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
public class UserForm {

	@NotNull
	private String name;

	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthdate;

	@NotNull
	private String createdBy;

	private String updatedBy;

	private String deletedBy;

}
