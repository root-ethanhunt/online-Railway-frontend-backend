package com.example.Security.modles;

import javax.validation.constraints.NotBlank;

public class Login {
	@NotBlank
	private String username;

	@NotBlank
	private String password;

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(@NotBlank String username, @NotBlank String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
